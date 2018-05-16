package com.example.eddymontesinos.demojson;

public class Animales {

    private String tipo;
    private Animal value;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "tipo='" + tipo + '\'' +
                ", value=" + value +
                '}';
    }
}
