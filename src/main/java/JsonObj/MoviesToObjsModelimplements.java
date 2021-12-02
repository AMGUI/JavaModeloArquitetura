package JsonObj;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movies;

import java.lang.reflect.Type;
import java.net.http.HttpResponse;
import java.util.Collection;
import java.util.List;

public class MoviesToObjsModelimplements implements ContractJsonObj{
    private  HttpResponse<String> moviesForAPI;

    public MoviesToObjsModelimplements(HttpResponse<String> moviesForAPI) {
        this.moviesForAPI = moviesForAPI;

    }
    @Override
    public  List<Movies> getJason(){
        Gson gson = new Gson();
        Type collectionType = new TypeToken<Collection<Movies>>(){}.getType();
        Collection<Movies> movies = gson.fromJson(moviesForAPI.body(), collectionType);
        List<Movies> listMovies = movies.stream().toList();




      return listMovies;
    }


    @Override
    public void setObjsModal(HttpResponse<String> moviesForAPI) {

    }
}


