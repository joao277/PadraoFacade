package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Inventario {
    private List<Jogador> JogadorComChave = new ArrayList<>();

    public void addJogadorComChave(Jogador jogador) {
        this.JogadorComChave.add(jogador);
    }

    public boolean checkJogadorComChave(Jogador jogador) {
        return this.JogadorComChave.contains(jogador);
    }
}