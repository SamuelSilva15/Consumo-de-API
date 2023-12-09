package com.br.api.demo.httpcliente;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ClienteHttp {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
//                .DELETE()
//                .uri(URI.create("https://cat-fact.herokuapp.com/facts/"))
//                .uri(URI.create("https://www.getpostman.com"))
//                .uri(URI.create("https://postman-echo.com/delete"))
//                .uri(URI.create("https://apichallenges.herokuapp.com/todos"))
                //busca o conteúdo da url
                .uri(URI.create("https://xkcd.com/info.0.json"))
                //pode especificar o tipo de retorno, como por exemplo, application/xml
                .headers("Accept", "application/json")
//                .headers("Accept", "application/xml", "chave", "valor", "chave", "valor")
//                .header(null, null)
                //pode esperar por tempo determinado, e lançar exceção caso demore demais
                .timeout(Duration.ofSeconds(3))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                //lança exceção se o tempo passar do estimado abaixo
                .connectTimeout(Duration.ofSeconds(3))
                //redireciona para a nova pagina, por ser normal, só redecionara para https
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());
        System.out.println(response.headers());
        System.out.println(response.version());

        //para chamadas assincronas
//        httpClient.sendAsync(request, BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenApply(String::toUpperCase)
//                .thenAccept(System.out::println);
    }
}
