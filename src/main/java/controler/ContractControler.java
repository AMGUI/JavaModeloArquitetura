package controler;

import java.net.http.HttpResponse;

public interface ContractControler {
    String ShowTransmition();
    HttpResponse<String> getTransmition();
}
