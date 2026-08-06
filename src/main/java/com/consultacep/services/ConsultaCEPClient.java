package com.consultacep.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaCEPClient {

  Gson gson = new Gson();
 
  public void ConsultaClient(String cep) throws Exception {
    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

     JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

      String logadouro = json.get("logradouro").getAsString();
      String bairro = json.get("bairro").getAsString();
      String localidade = json.get("localidade").getAsString();
      String uf = json.get("uf").getAsString();
      String regiao = json.get("regiao").getAsString();
      String ddd = json.get("ddd").getAsString();

    System.out.println("========== RELATÓRIO ==========");
    System.out.println("CEP: " + cep);
    System.out.println("Logadouro: " + logadouro); 
    System.out.println("Bairro: " + bairro);
    System.out.println("Localidade: " + localidade);
    System.out.println("UF: " + uf);
    System.out.println("Região: " + regiao);
    System.out.println("DDD: " + ddd);
    System.out.println("===============================");

  }

}
