package com.nxstage.nxgamelist.domain.exception;

public class GameNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public GameNotFoundException(String message){
        super(message);
    }
    public GameNotFoundException(Long id){
        this(String.format("O Jogo id '%d' não consta na base de dados",id));
    }
}
