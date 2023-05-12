package com.nxstage.nxgamelist.domain.service;

import com.nxstage.nxgamelist.api.dto.GameListDTO;
import com.nxstage.nxgamelist.api.dto.GameMinProjection;
import com.nxstage.nxgamelist.domain.exception.GameListNotFoundException;
import com.nxstage.nxgamelist.domain.model.GameList;
import com.nxstage.nxgamelist.domain.repository.GameListRepository;
import com.nxstage.nxgamelist.domain.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    public List<GameListDTO> findAll(){
        List<GameList> gameLists = gameListRepository.findAll();
        return gameLists.stream().map(gameList ->
                new GameListDTO(gameList)).collect(Collectors.toList());
    }

    public GameListDTO findById(Long id){
        return new GameListDTO(
                gameListRepository.findById(id).orElseThrow(
                        ()-> new GameListNotFoundException(id)));
    }

    @Transactional
    public void move(long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex,obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max ; i++) {
            gameListRepository.updateBelongingPosition(listId,list.get(i).getId(), i);

        }
    }
}
