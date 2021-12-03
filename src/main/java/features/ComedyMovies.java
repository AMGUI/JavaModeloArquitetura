package features;

import model.Movies;

import java.util.ArrayList;
import java.util.List;

public class ComedyMovies {

    private  List<Movies> moviesComedy ;


    public ComedyMovies(List<Movies> movies) {
        creatListMoviesAnimations(movies);

    }

    public  List<Movies> getMovies() {
        return this.moviesComedy;
    }

    public void setMoviesComedy(List<Movies> moviesComedy) {
        this.moviesComedy = moviesComedy;
    }

    private void creatListMoviesAnimations(List<Movies> moviesAnimations){
        List<Movies> moviesList = new ArrayList();
        for (Movies movie : moviesAnimations){
            if(movie.genres.equals("Comedy")){
              moviesList.add(movie);

            }
        }
        setMoviesComedy(moviesList);
    }


}
