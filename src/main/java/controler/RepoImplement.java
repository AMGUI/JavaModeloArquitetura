package controler;

import model.Movies;

import java.util.ArrayList;
import java.util.List;

public class RepoImplement implements Repositorio{
    private ArrayList<Movies> movies;

    public RepoImplement(Movies objPessoa) {
        this.movies = new ArrayList<Movies>();
        this.movies.add(objPessoa);

    }


    @Override
    public List<Movies> showMovies() {
        return this.movies;
    }

    @Override
    public void addMovie(Movies modelPessoa) {
        this.movies.add(modelPessoa);

    }
}
