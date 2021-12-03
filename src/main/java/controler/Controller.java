package controler;
import JsonObj.ContractJsonObj;
import JsonObj.MoviesToObjsModelimplements;
import features.ContractMoveis;
import features.ControllerMovies;
import model.Movies;
import java.util.List;

public class Controller implements ContractControler {
    private Repositorio repositorio;
    private ContractJsonObj contractJsonObj;
    private ContractMoveis contractMoveis;

    public Controller() {
        this.repositorio = new RepoImplement();
        this.contractJsonObj = new MoviesToObjsModelimplements(this.repositorio.getTransmition());
        this.contractMoveis = new ControllerMovies();
    }

    @Override
    public List<Movies> getMoviesComedy()
    {
        contractMoveis.setMoviesComedy(contractJsonObj.getJason());
        return this.contractMoveis.getMoviesComedy();
    }

    @Override
    public void setMovie(Movies modelPessoa) {

    }


}
