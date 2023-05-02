package com.example;

public class Mochila extends Inventario{
    private static Mochila mochila = new Mochila();

    private Mochila() {};

    public static Mochila getInstancia() {
        return mochila;
    }
}