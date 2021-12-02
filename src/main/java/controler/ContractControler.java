package controler;

import model.Movies;

import java.net.http.HttpResponse;
import java.util.List;

public interface ContractControler {
    public List<Movies> getMovies();
    public void setMovie(Movies modelPessoa);
}
