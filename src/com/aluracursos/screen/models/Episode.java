package com.aluracursos.screen.models;
import com.aluracursos.screen.calculations.Classification;

public class Episode  implements Classification {

    private String name;
    private int number; //number of episode
    private Serie serie; // hace referencia a la clase Serie y la relaciona con la clase episodio
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 500) {
            return 5;
        } else if (totalViews > 400) {
            return 4;
        } else if (totalViews > 300) {
            return 3;
        } else {
            return 2;
        }
    }
}
