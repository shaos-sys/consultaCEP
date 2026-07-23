package com.consultacep;

import java.util.Scanner;
import com.consultacep.services.ConsultaCEPClient;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaCEPClient consulta = new ConsultaCEPClient();

        String cep;

        do {
            System.out.print("Informe o CEP para consulta (Ou 'n' para sair): ");
            cep = scan.nextLine();

            if (cep.equalsIgnoreCase("n")) {
                System.out.println("Encerrando...");
                break;
            }

            try {
                consulta.ConsultaClient(cep);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (!cep.equalsIgnoreCase("n"));

        scan.close();

    }
}