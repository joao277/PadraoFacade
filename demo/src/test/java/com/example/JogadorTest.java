package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


class JogadorTeste {

    @Test
    void jogadorNãoTemChave() {
        Jogador jogador = new Jogador();

        assertEquals(false, jogador.hasKey());
    }

    @Test
    void jogadorTemArmadura() {
        Jogador jogador = new Jogador();
        Armadura.getInstancia().addJogadorComChave(jogador);

        assertEquals(true, jogador.hasKey());
    }

    @Test
    void jogadorTemMohcila() {
        Jogador jogador = new Jogador();
        Mochila.getInstancia().addJogadorComChave(jogador);

        assertEquals(true, jogador.hasKey());
    }
}
