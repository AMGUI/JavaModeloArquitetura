package controler;
import JsonObj.ContractJsonObj;
import JsonObj.MoviesToObjsModelimplements;
import model.Movies;
import java.util.ArrayList;
import java.util.List;

public class Controller implements ContractControler {
    private Repositorio repositorio;

    private ContractJsonObj contractJsonObj;

    public Controller() {
        this.repositorio = new RepoImplement();
        this.contractJsonObj = new MoviesToObjsModelimplements(this.repositorio.getTransmition());

    }

    @Override
    public List<Movies> getMovies() {
        return this.contractJsonObj.getJason();
    }

    @Override
    public void setMovie(Movies modelPessoa) {

    }


}
