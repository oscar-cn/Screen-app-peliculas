package com.aluracursos.screen.calculations;


import com.aluracursos.screen.models.Title;

public class Calculator {


    private int totalTime;


    public int getTotalTime() {
        return totalTime;
    }

    public void includes (Title title){
        this.totalTime += totalTime + title.getDurationInMinutes();
    }
}
