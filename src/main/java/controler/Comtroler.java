package controler;

import model.Movies;
import network.ClientSevice;

import java.net.http.HttpResponse;

public class Comtroler implements ContractControler {
   private static Movies movies;
   private static Repositorio repositorio;

    public Comtroler() {

    }

    @Override
    public String ShowTransmition() {
     String result = "ERRO";

     return result;
    }

    @Override
    public HttpResponse<String> getTransmition() {
        HttpResponse<String> moviesForAPI = (HttpResponse<String>) new ClientSevice();
        return moviesForAPI;
    }
}
