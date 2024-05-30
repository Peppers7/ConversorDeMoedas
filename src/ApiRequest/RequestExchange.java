package ApiRequest;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestExchange {

    private String keyApi = "YOUR_API_KEY_HERE";

    public Double ReceiveValue(String coin1, String coin2) throws IOException, InterruptedException {
        String address = "https://v6.exchangerate-api.com/v6/"+this.keyApi+"/pair/"+coin1+"/"+coin2;
        Gson gson = new Gson();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        var conversionRate  = gson.fromJson(response.body(), FilterAPi.class);
        return conversionRate.conversion_rate();

    }

}
