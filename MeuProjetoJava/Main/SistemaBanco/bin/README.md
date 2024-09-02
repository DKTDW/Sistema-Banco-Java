# Sistema de Transações de Empresa

Este é um simples sistema de gerenciamento de transações para uma empresa, permitindo que ela execute depósitos e saques em um saldo inicial. As operações geram um callback em JSON para um webhook especificado.

## Estrutura do Projeto

O projeto é estruturado da seguinte forma:
meu-projeto-java/ │ ├── src/ │ ├── Main.java # Classe principal que inicia o programa. │ ├── Cliente.java # Classe que representa um cliente com CPF. │ ├── Empresa.java # Classe que representa uma empresa com saldo e CNPJ. │ └── Usuario.java # Classe base para Cliente e Empresa.


## Classes Principais

- **Usuario**: Classe base que contém informações comuns entre `Cliente` e `Empresa`.
- **Cliente**: Extende a classe `Usuario` e adiciona um campo para CPF.
- **Empresa**: Extende a classe `Usuario` e contém métodos para realizar transações (depósitos e saques), além de um campo para CNPJ e saldo.
- **Main**: Classe que executa o programa, criando instâncias de `Cliente` e `Empresa` e realizando transações.

## Funcionalidades

- **Adicionar Transação**: A empresa pode realizar um depósito ou saque com um cliente.
- **Callback**: Após cada transação, um JSON é enviado para um webhook especificado contendo detalhes da transação.

## Requisitos

- JDK (Java Development Kit) instalado em sua máquina.
- Configurar o ambiente Java no seu editor (recomendado: Visual Studio Code).

## Instalação

1. Clone este repositório:
   ```bash
   git clone https://github.com/DKTDW/Sistema-Banco-Java.git
Navegue até a pasta do projeto:

bash


Copiar
1
cd MeuProjetoJava/src
Compile o código:

bash


Copiar
1
javac *.java
Execute o programa:

bash


Copiar
1
java Main
Uso
Ao executar o programa, ele realizará as seguintes operações:

Um depósito de 50.00.
Um saque de 50.00.
Ambas as operações exibirão informações no console sobre o saldo da empresa e o código de resposta do webhook.

Considerações Finais
Este projeto é uma demonstração de manipulação simples de transações em Java. Para fins de desenvolvimento, o webhook utilizado é um exemplo e pode não estar ativo.

Sinta-se à vontade para modificar, melhorar e expandir este código!

Licença
Este projeto é de código aberto e pode ser utilizado de acordo com as suas necessidades.


### Como Usar

Para usar esse `README.md`, basta copiá-lo e colá-lo em um arquivo chamado `README.md` na raiz do seu projeto (ou na pasta onde você está organizando seu código). Você pode personalizá-lo ainda mais conforme necessário!

Se precisar de mais alterações ou informações adicionais, é só avisar!