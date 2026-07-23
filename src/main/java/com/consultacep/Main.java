 package com.consultacep;

import com.consultacep.services.ConsultaCEPClient;

public class Main {
     public static void main(String[] args) {

     ConsultaCEPClient consulta = new ConsultaCEPClient();

     String cepTeste = "30840500";

     try {
      consulta.ConsultaClient(cepTeste);  
     } catch(Exception e) {
       System.out.println(e);
      }   
     }
 }