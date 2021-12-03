import controler.ContractControler;
import controler.Controller;
import model.Movies;

import java.util.List;

public class Main {

    public static void main(String[] args){
          ContractControler controller = new Controller();




            System.out.println("========================");
            List<Movies> model  =  controller.getMoviesComedy();
            for (Movies movie : model){
                System.out.println(movie.title);
            }

            System.out.println("========================");


    }
}
