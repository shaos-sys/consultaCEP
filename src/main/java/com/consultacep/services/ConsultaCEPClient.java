package com.consultacep.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaCEPClient {

  Gson gson = new Gson();
  Endereco endereco = new Endereco();

  public void ConsultaClient(String cep) throws Exception {
    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

     JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
     String logadouro = json.get("logadouro").getAsString();
     

    System.out.println("========== RELATÓRIO ==========");
    System.out.println("CEP: " + cep);
    System.out.println("Logadouro: " 
    System.out.println("Bairro: " + 
    System.out.println("Localidade: " + 
    System.out.println("UF: " + 
    System.out.println("Região: " + 
    System.out.println("DDD: " + 
    System.out.println("===============================");

  }

}
