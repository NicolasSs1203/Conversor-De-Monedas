import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    private static final String API_KEY = "975726e9d944963af2fc71a0";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public double convierteMoneda(String monedaBase, String monedaDestino, double monto) {
        String url = BASE_URL + monedaBase + "/" + monedaDestino + "/" + monto;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            return jsonResponse.get("conversion_result").getAsDouble();

        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la API", e);
        }
    }
}