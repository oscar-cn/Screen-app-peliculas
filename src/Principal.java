public class Principal {

    public static void main(String[] args) {
        Movies myMovie = new Movies(); // creamos una nueva instancia- la memoria guarda un espacio para este objeto: myMovie

        myMovie.name = "Harry potter y la piedra filosofal";
        myMovie.durationInMinutes = 152;
        myMovie.releaseDate = 2001;
        myMovie.isIncludedInPlan = true;

        myMovie.showTechnicalSheet(); // llamada al metodo void que imprime la ficha tecnica de la pelicula
        myMovie.evaluate(10);
        myMovie.evaluate(8);

        System.out.println(myMovie.sumOfEvaluation);
        System.out.println(myMovie.calculateAverage());



        Movies otherMovie = new Movies();

        otherMovie.name = "Matrix";
        otherMovie.durationInMinutes = 125;
        otherMovie.releaseDate = 1999;
        otherMovie.isIncludedInPlan = true;

//        otherMovie.showTechnicalSheet();

    }
}
