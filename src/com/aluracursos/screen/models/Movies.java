package com.aluracursos.screen.models;
import com.aluracursos.screen.calculations.Classification;

public class Movies extends Title implements Classification { // clase modelo

    private String movieDirector;

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    @Override
    public int getClassification() {
        return (int) calculateAverage() / 2;
    }
}
