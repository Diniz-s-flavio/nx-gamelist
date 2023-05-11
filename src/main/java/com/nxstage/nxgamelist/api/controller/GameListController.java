package com.nxstage.nxgamelist.api.controller;

import com.nxstage.nxgamelist.api.dto.GameListDTO;
import com.nxstage.nxgamelist.api.dto.GameMinDTO;
import com.nxstage.nxgamelist.domain.service.GameListService;
import com.nxstage.nxgamelist.domain.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping("/{gameListId}")
    public GameListDTO findGameListById(@PathVariable("gameListId") Long id){
        return gameListService.findById(id);
    }

    @GetMapping("/{gameListId}/games")
    public List<GameMinDTO> findByList(@PathVariable("gameListId") Long id){
        return gameService.findByList(id);
    }
}
