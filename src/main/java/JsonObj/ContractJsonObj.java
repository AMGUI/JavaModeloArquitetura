package JsonObj;

import model.Movies;

import java.net.http.HttpResponse;
import java.util.List;

public interface ContractJsonObj {
    public void setObjsModal(HttpResponse<String> moviesForAPI);
    public List<Movies> getJason();
}
