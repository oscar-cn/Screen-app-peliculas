package com.aluracursos.screen.calculations;

public class RecommendationFilter {

    public void filter(Classification classification){
        if (classification.getClassification() >=4){
            System.out.println("Muy valorado por nuestros usuaios expertos");
        } else if (classification.getClassification() >= 3) {
            System.out.println("Buena elección popular");
        }else {
            System.out.println("Puedes descrubir el potencial que otros no han encontrado aqui");
        }
    }
}
