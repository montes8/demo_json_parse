package com.example.eddymontesinos.demojson;

public class Domestico {

    private String id;
    private String animal;
    private String color;
    private Integer edad;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Domestico{" +
                "id='" + id + '\'' +
                ", animal='" + animal + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }
}
