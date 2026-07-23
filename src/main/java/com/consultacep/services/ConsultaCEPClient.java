 package com.consultacep.services;

 import java.net.URI;
 import java.net.http.HttpClient;
 import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;

 public class ConsultaCEPClient { 
 
     public void ConsultaClient(String cep) throws Exception{

     HttpClient client = HttpClient.newHttpClient();

      HttpRequest request = HttpRequest.newBuilder()
       .uri(URI.create("http://viacep.com.br/ws/" + cep + "/json/"))
       .build();

     HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      String json = response.body();

     System.out.println(json); 

     }


}
