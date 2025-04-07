import com.aluracursos.screen.models.Movies;

public class Principal {

    public static void main(String[] args) {
        Movies myMovie = new Movies(); // creamos una nueva instancia- la memoria guarda un espacio para este objeto: myMovie

        myMovie.setName("Harry Potter y la piedra filosofal");
        myMovie.setDurationInMinutes(152);
        myMovie.setReleaseDate(2001);
        myMovie.setIncludedInPlan(true);

        myMovie.showTechnicalSheet(); // llamada al metodo void que imprime la ficha tecnica de la pelicula
        myMovie.evaluate(10);
        myMovie.evaluate(8);
        System.out.println(myMovie.getAverageOfTheEvaluations());
        System.out.println(myMovie.calculateAverage());






//        com.aluracursos.screen.models.Movies otherMovie = new com.aluracursos.screen.models.Movies();

//        otherMovie.name = "Matrix";
//        otherMovie.durationInMinutes = 125;
//        otherMovie.releaseDate = 1999;
//        otherMovie.isIncludedInPlan = true;

//        otherMovie.showTechnicalSheet();

    }
}
