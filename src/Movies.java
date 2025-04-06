public class Movies { // clase modelo

    String name;
    int releaseDate;
    int durationInMinutes;
    boolean isIncludedInPlan;
    double sumOfEvaluation;
    int averageOfTheEvaluations;

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
