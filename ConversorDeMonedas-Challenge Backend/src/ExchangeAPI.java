import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeAPI {

    public TipoDeCambio conversion(String moneda) {
        //Creando URI
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/21d6247e395146580ad924da/latest/"+moneda);


        //Solicitar una petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        //Petición Correcta
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TipoDeCambio.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontre esa pelicula");

        }
        //Lectura de Información

        //Imprimir información
    }

}
