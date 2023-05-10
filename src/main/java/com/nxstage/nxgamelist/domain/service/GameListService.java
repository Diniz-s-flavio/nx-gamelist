package com.nxstage.nxgamelist.domain.service;

import com.nxstage.nxgamelist.api.dto.GameListDTO;
import com.nxstage.nxgamelist.domain.exception.GameListNotFoundException;
import com.nxstage.nxgamelist.domain.model.GameList;
import com.nxstage.nxgamelist.domain.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

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
}
