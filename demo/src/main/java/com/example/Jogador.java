package com.example;

public class Jogador {
    public boolean hasKey() {
        return JogadorFacade.checkInventario(this);
    }
}