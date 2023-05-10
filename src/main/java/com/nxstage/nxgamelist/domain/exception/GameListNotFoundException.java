package com.nxstage.nxgamelist.domain.exception;

public class GameListNotFoundException extends RuntimeException{
    public GameListNotFoundException(String message){
        super(message);
    }

    public GameListNotFoundException(Long id){
        this(String.format("A Lista de jogos id '%d' não consta na base de dados",id));
    }
}
