package controler;
import network.ClientSevice;
import java.net.http.HttpResponse;

public class RepoImplement implements Repositorio{
    private  HttpResponse<String> moviesForAPI;

    public RepoImplement() {
        moviesForAPI = new ClientSevice().getApi();
    }

    @Override
    public HttpResponse<String>  setTransmition() {
        HttpResponse<String> response = null;

        return response ;
    }

    @Override
    public HttpResponse<String> getTransmition() {

        return this.moviesForAPI;
    }

}
