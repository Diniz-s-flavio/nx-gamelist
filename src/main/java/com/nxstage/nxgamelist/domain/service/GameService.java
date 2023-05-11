package com.nxstage.nxgamelist.domain.service;

import com.nxstage.nxgamelist.api.dto.GameDTO;
import com.nxstage.nxgamelist.api.dto.GameMinDTO;
import com.nxstage.nxgamelist.api.dto.GameMinProjection;
import com.nxstage.nxgamelist.domain.exception.GameNotFoundException;
import com.nxstage.nxgamelist.domain.model.Game;
import com.nxstage.nxgamelist.domain.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();

        return games.stream().map(
                game -> new GameMinDTO(game)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).orElseThrow(()->
                new GameNotFoundException(id));
        return new GameDTO(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> games = gameRepository.searchByList(listId);

        return games.stream().map(
                game -> new GameMinDTO(game)).collect(Collectors.toList());
    }
}
