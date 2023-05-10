package com.nxstage.nxgamelist.api.controller;

import com.nxstage.nxgamelist.api.dto.GameMinDTO;
import com.nxstage.nxgamelist.domain.repository.GameRepository;
import com.nxstage.nxgamelist.domain.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> gameList(){
        return gameService.findAll();
    }
}
