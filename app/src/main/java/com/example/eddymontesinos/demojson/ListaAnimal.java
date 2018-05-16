package com.example.eddymontesinos.demojson;

import java.util.ArrayList;

public class ListaAnimal {

    private String tipos;
    private ArrayList<Domestico> values;

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public ArrayList<Domestico> getValues() {
        return values;
    }

    public void setValues(ArrayList<Domestico> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "ListaAnimal{" +
                "tipos='" + tipos + '\'' +
                ", values=" + values +
                '}';
    }
}
