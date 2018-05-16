package com.example.eddymontesinos.demojson;

public class Animal {

    private String id;
    private String animal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}
