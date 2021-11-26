package controler;

import model.Movies;

import java.util.List;

public interface Repositorio {
List<Movies> showMovies();
void addMovie(Movies modelPessoa);
}
