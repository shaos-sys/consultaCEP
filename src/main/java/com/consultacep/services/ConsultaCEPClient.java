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
    endereco = gson.fromJson(response.body(), Endereco.class);

    System.out.println("========== RELATÓRIO ==========");
    System.out.println("CEP: " + cep);
    System.out.println("Logadouro: " + endereco.getLogradouro());
    System.out.println("Bairro: " + endereco.getBairro());
    System.out.println("Localidade: " + endereco.getLocalidade());
    System.out.println("UF: " + endereco.getUF());
    System.out.println("Região: " + endereco.getRegiao());
    System.out.println("DDD: " + endereco.getDDD());
    System.out.println("===============================");

  }

}
