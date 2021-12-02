package controler;
import java.net.http.HttpResponse;


public interface Repositorio {
    public HttpResponse<String>  setTransmition();
    public HttpResponse<String> getTransmition();
}
