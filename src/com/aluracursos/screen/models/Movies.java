package com.aluracursos.screen.models;

public class Movies { // clase modelo

    private int releaseDate;
    private int durationInMinutes;
    private boolean isIncludedInPlan;
    private String name;
    private double sumOfEvaluation;
    private int averageOfTheEvaluations;


    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInPlan() {
        return isIncludedInPlan;
    }

    public String getName() {
        return name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        isIncludedInPlan = includedInPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageOfTheEvaluations (){
        return averageOfTheEvaluations;
    }

    public void showTechnicalSheet (){ // metodo void que imprime un mensaje
        String message = """
                Tu pelicula seleccionada es: %s, que fue estrenada en: %d.
                La pelicula tiene una duracion de %d minutos
                """.formatted(name, releaseDate, durationInMinutes);

        System.out.println(message);
    }

    public void evaluate (double calification){
        sumOfEvaluation += calification;
        averageOfTheEvaluations ++;
    }

    public double calculateAverage () {
        return sumOfEvaluation / averageOfTheEvaluations;
    }
}
