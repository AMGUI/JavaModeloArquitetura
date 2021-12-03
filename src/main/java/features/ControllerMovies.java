package features;

import model.Movies;

import java.util.List;

public class ControllerMovies implements ContractMoveis {
    private static List<Movies> moviesComedy;

    @Override
    public List<Movies> getMoviesComedy() {
        return this.moviesComedy;
    }

    @Override
    public void setMoviesComedy(List<Movies> ListMoviesApi) {
        this.moviesComedy = new ComedyMovies(ListMoviesApi).getMovies();

    }
}
