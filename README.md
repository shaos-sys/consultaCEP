📍 ConsultaCEP

CONSULTA DE ENDEREÇOS A PARTIR DO CEP, VIA API PÚBLICA VIACEP.

Sistema desenvolvido em Java puro, sem uso de frameworks. O usuário informa um CEP e a aplicação consulta a API do ViaCEP, retornando os dados completos do endereço (logradouro, bairro, cidade, UF, região e DDD).

🚀 Tecnologias utilizadas
```
Java 21.
Maven — para gerenciamento de dependências e build.
Gson — serialização e desserialização de JSON.
HttpClient (java.net.http) — cliente HTTP nativo do Java.
API ViaCEP — consulta pública de endereços por CEP.
```
📋 Pré-requisitos

Java 17+
Maven 3.6+
Conexão com a internet (para consultar a API)

⚙️ Como rodar
```
1. Clonar repositório:
   git clone https://github.com/shaos-sys/consultaCEP
   cd consultacep

2. Compilar o projeto:
   mvn package

3. Executar:
   java -jar target/consultacep-1.0-SNAPSHOT-jar-with-dependencies.jar
```
🗂️ Estrutura do projeto
```
consultacep/
├── pom.xml
└── src/main/java/com/consultacep/
    ├── services/
    │   └── ConsultaCEPClient.java   — consulta a API e exibe o relatório
    └── Endereco.java            — modelo de dados do endereço
```
🎯 Funcionalidades

Informar um CEP para consulta.
Buscar o endereço correspondente na API do ViaCEP.
Exibir relatório com CEP, logradouro, bairro, localidade, UF, região e DDD.

🧠 Conceitos aplicados

Consumo de API REST com HttpClient nativo do Java.
Serialização e desserialização de JSON com Gson.
Mapeamento de resposta JSON para objeto Java (Endereco).
Tratamento de requisições HTTP e respostas assíncronas.
Separação de responsabilidades entre serviço e modelo.
```
👨‍💻 Autor: Desenvolvido por Hélio Souza como projeto pessoal para estudos, com foco em consumo de APIs REST em Java puro.
```
