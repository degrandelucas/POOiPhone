# Funções do iPhone - Simulação de um Dispositivo Multifuncional

Este projeto é uma aplicação Java que simula as principais funcionalidades de um iPhone. O programa implementa diversas interfaces que representam funcionalidades como reprodução de música, realização de chamadas telefônicas e navegação na web.

## Funcionalidades Principais

1. **Reprodução de Música:**
   - O iPhone pode tocar, pausar, avançar para a próxima faixa ou voltar para a faixa anterior.

2. **Realização de Chamadas Telefônicas:**
   - O iPhone permite ao usuário digitar o número do contato e realizar uma chamada.

3. **Navegação na Web:**
   - O iPhone pode acessar o navegador e visitar um site fornecido pela URL.

## Passo a Passo do Projeto

### Passo 1: Instanciar o iPhone
O programa cria uma instância do objeto `iPhone`, representando o dispositivo.

### Passo 2: Testar Funções do Reprodutor Musical
O usuário pode testar as funcionalidades de tocar, pausar e navegar entre faixas usando os métodos:
- `tocar()`
- `pausar()`
- `voltarMusica()`
- `avancarMusica()`

### Passo 3: Testar Funções de Chamadas Telefônicas
O usuário pode testar as funções de telefonia, como digitar um número e realizar a chamada usando os métodos:
- `digitarNumero()`
- `ligar()`

### Passo 4: Testar Funções do Navegador
O usuário pode abrir o navegador e acessar uma URL fornecida usando os métodos:
- `entrarNavegador()`
- `acessarURL(String url)`

### Estrutura das Interfaces
O programa implementa três interfaces:
- **ReprodutorMusical:** Contém métodos relacionados à reprodução de músicas.
- **AparelhoTelefonico:** Contém métodos para realizar chamadas telefônicas.
- **Navegador:** Contém métodos para navegação na web.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para desenvolver a aplicação.
- **Scanner (java.util.Scanner):** Utilizado para entrada de dados, como a URL.

## Autor

- **Nome:** Lucas Degrande