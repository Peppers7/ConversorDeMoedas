# Challenge Conversor de Moedas (Alura + Oracle Next Education)

Este é um projeto simples que realiza a conversão de algumas moedas. Um menu interativo permite ao usuário escolher entre diferentes opções de conversão de moedas.

## Tecnologias Utilizadas

- **Java 17**
- **Gson 2.10.1**
- **ExchangeRate-API**
  - É necessário obter uma chave de API: [ExchangeRate-API](https://www.exchangerate-api.com/)

## Índice

- [Instalação](#instalação)
- [Configuração](#configuração)
- [Uso](#uso)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Autores](#autores)

## Instalação

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/challenge-conversor-moedas.git
   ```

2. Navegue até o diretório do projeto:
    ```bash
    cd challenge-conversor-moedas
    ```

3. Baixe as dependências necessárias (neste caso, o Gson):
    - Se estiver utilizando um gerenciador de dependências como Maven ou Gradle, adicione a dependência do Gson ao seu `pom.xml` ou `build.gradle`.
    - Alternativamente, você pode baixar o JAR do Gson e incluí-lo manualmente no seu projeto.

## Configuração

1. Obtenha uma chave de API no [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Adicione a chave da API no arquivo `RequestExchange.java`:
    ```java
    private String keyApi = "YOUR_API_KEY_HERE";
    ```

## Uso

Para iniciar o conversor de moedas, compile e execute o projeto:

1. Compile o projeto:
    ```bash
    javac -cp gson-2.10.1.jar:. Main/main.java
    ```

2. Execute o projeto:
    ```bash
    java -cp gson-2.10.1.jar:. Main.main
    ```

O menu será exibido, permitindo que você selecione as moedas e insira o valor a ser convertido.

## Estrutura do Projeto

- `Main/main.java`: Classe principal que contém o menu interativo.
- `Main/Menu.java`: Classe que exibe o menu.
- `ApiRequest/RequestExchange.java`: Classe que faz a solicitação à API de conversão de moedas.
- `ApiRequest/ConvertedValue.java`: Classe que calcula e exibe o valor convertido.
- `ApiRequest/FilterAPi.java`: Classe que mapeia a resposta da API.

## Contribuição

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas alterações (`git commit -am 'Adiciona nova funcionalidade'`).
4. Faça push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.

## Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.

## Autores

- **Matheus Parra Paulino** - *Trabalho inicial* - [Meu Perfil no GitHub](https://github.com/Peppers7)

