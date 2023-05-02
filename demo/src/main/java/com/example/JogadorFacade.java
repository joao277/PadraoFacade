package com.example;


public class JogadorFacade {

    public static boolean checkInventario(Jogador jogador) {
        if (Mochila.getInstancia().checkJogadorComChave(jogador)) {
            return true;
        }
        if (Armadura.getInstancia().checkJogadorComChave(jogador)) {
            return true;
        }
        return false;
    }
}