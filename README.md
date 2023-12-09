# Consumo-de-API
Utilizando alguns métodos de consumo de api para estudo.

Neste projeto eu projeto eu utilizei algumas formas para consumir api's no Java. Elas foram HttpClient e RestTemplate. E para mais elucidar, baseei-me neste artigo: 
https://therealsainath.medium.com/resttemplate-vs-webclient-vs-httpclient-a-comprehensive-comparison-69a378c2695b


No geral, as diferenças são:

# HttpCliente:
HttpClient é um cliente HTTP de baixo nível, assíncrono e sem bloqueio introduzido no Java 11. Ele fornece uma API bruta para construir e executar solicitações HTTP e não lida com a serialização e desserialização de corpos de solicitação e resposta. A principal vantagem de usar HttpClient é que ele fornece uma API de baixo nível, que dá aos desenvolvedores mais controle sobre a solicitação e resposta HTTP.

Prós:

* API de baixo nível, que oferece aos desenvolvedores mais controle sobre a solicitação e resposta HTTP.
De natureza assíncrona e sem bloqueio, o que significa que o thread que faz a solicitação não será bloqueado.
Fornece uma API bruta para criar e executar solicitações HTTP.
Contras:

* API bruta, que exige que os desenvolvedores lidem com a serialização e desserialização de corpos de solicitação e resposta.
* API mais complexa em comparação com RestTemplate e WebClient.

# RestTemplate:
RestTemplate é um cliente HTTP síncrono, de bloqueio e de estilo antigo fornecido pela estrutura Spring. É fácil de usar e fornece uma API conveniente e de alto nível para executar solicitações HTTP. A principal vantagem de usar RestTemplate é que ele pode lidar automaticamente com a serialização e desserialização de corpos de solicitação e resposta.

Prós:

* Fácil de usar e fornece uma API conveniente.
* Lida automaticamente com a serialização e desserialização de corpos de solicitação e resposta.
* Suporta vários métodos HTTP como GET, POST, PUT, DELETE, etc.
* Fornece a capacidade de adicionar cabeçalhos personalizados, parâmetros de solicitação e variáveis ​​URI.
  
Contras:

* Bloqueio por natureza, o que significa que o thread que faz a solicitação será bloqueado até que uma resposta seja recebida.
* Não suporta programação reativa.
