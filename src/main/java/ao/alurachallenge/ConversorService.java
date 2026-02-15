package ao.alurachallenge;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConversorService 

{
    
    public RespostaApi buscarTaxas(String baseCurrency){

        HttpClient client= HttpClient.newHttpClient();

        HttpRequest request= HttpRequest.newBuilder()
               .uri(
                URI.create(
                    "https://v6.exchangerate-api.com/v6/coloque_sua_apikey_aqui/latest/" + baseCurrency
                ))
                .build();

        try {
            HttpResponse <String> response= client
               .send(request, HttpResponse.BodyHandlers.ofString());

               Gson gson = new Gson();
               
               return gson.fromJson(response.body(), RespostaApi.class);

              
        } catch (Exception e) {
             throw new RuntimeException("Não foi possivel fazer a conversão");
        }
       
    }


    public double converter(String origem, String destino, Double valor){

        RespostaApi resposta = buscarTaxas("USD");

        Double taxaOrigem = resposta.getConversion_rates().get(origem);
        Double taxaDestino = resposta.getConversion_rates().get(destino);

        if (taxaOrigem == null || taxaDestino == null) {
            throw new IllegalArgumentException("Moeda inválida");
        }

        return valor * (taxaDestino/taxaOrigem);
    }

                    
}

