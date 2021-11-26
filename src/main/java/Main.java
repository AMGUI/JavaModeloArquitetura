import controler.Comtroler;
import controler.ContractControler;
import controler.RepoImplement;
import controler.Repositorio;
import model.Movies;

import java.util.List;

public class Main {
   // private static Movies movies;
    private static ContractControler contractControler = new Comtroler();
    //private static Repositorio repositorio;
    public static void main(String[] args){
       // List<Movies> list_movie;
       // movies = new Movies(1,"ass","movies");
       // repositorio = new RepoImplement(movies);
        // list_movie = repositorio.showMovies();


        System.out.println("========================");
        System.out.println(contractControler.getTransmition());
        System.out.println("========================");


    }


}
