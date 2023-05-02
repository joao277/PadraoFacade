package com.example;

public class Armadura extends Inventario{
    private static Armadura armadura = new Armadura();

    private Armadura() {};

    public static Armadura getInstancia() {
        return armadura;
    }
}