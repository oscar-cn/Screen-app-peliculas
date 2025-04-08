import com.aluracursos.screen.calculations.Calculator;
import com.aluracursos.screen.calculations.RecommendationFilter;
import com.aluracursos.screen.models.Episode;
import com.aluracursos.screen.models.Movies;
import com.aluracursos.screen.models.Serie;

public class Principal {

    public static void main(String[] args) {
        Movies myMovie = new Movies(); // creamos una nueva instancia- la memoria guarda un espacio para este objeto: myMovie
        Calculator calculator = new Calculator();

        myMovie.setName("Harry Potter y la piedra filosofal");
        myMovie.setDurationInMinutes(152);
        myMovie.setReleaseDate(2001);
        myMovie.setIncludedInPlan(true);

        myMovie.showTechnicalSheet(); // llamada al metodo void que imprime la ficha tecnica de la pelicula
        myMovie.evaluate(10);
        myMovie.evaluate(8);
        System.out.println(myMovie.getAverageOfTheEvaluations());
        System.out.println(myMovie.calculateAverage());


        calculator.includes(myMovie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        System.out.println("******************");

        Serie selectedSeries = new Serie();
        selectedSeries.setName("The bigbang theory");
        selectedSeries.setIncludedInPlan(true);
        selectedSeries.setReleaseDate(2007);
        selectedSeries.setSeasons(12);
        selectedSeries.setEpisodesPerSeasons(12);
        selectedSeries.setMinutesPerSeasons(22);

        Episode episode = new Episode();

        episode.setSerie(selectedSeries);
        episode.setNumber(12);
        episode.setName("la teoria del taco");

        recommendationFilter.filter(episode);

        selectedSeries.showTechnicalSheet();
        calculator.includes(selectedSeries);
        System.out.println(calculator.getTotalTime());


    }
}
