Um projeto de console (terminal) interativo desenvolvido em Java para realizar operações matemáticas, acompanhado de uma bateria de testes unitários para garantir a fiabilidade do código.

## 🚀 Sobre o Projeto

Este repositório contém uma aplicação de calculadora que permite ao utilizador realizar diversas operações matemáticas através de um menu interativo na consola. Além da lógica principal, o projeto foca-se fortemente na demonstração de testes unitários utilizando o **JUnit 5**, aplicando conceitos didáticos como o padrão **AAA (Arrange, Act, Assert)**. 

É um excelente exemplo de como separar a lógica de negócio da interface de entrada de dados, mantendo o código organizado e testável.

## ⚙️ Funcionalidades

A calculadora suporta as seguintes operações:
- **Somar**
- **Subtrair**
- **Multiplicar**
- **Dividir** (inclui tratamento para divisão por zero, retornando `null`)
- **Potência**
- **Raiz** (radiciação)
- **Logaritmo**

## 🛠️ Tecnologias e Ferramentas

- **Java 17**: Linguagem principal do projeto.
- **Maven**: Gestor de dependências e construção do projeto.
- **JUnit Jupiter (5.12.2)**: Framework utilizado para a execução dos testes unitários.

## 📂 Estrutura do Código

- `src/main/java/org/example/Calculadora.java`: Classe principal que contém o método `main`. Apresenta o menu interativo (usando `Scanner` e estrutura `switch`) e lida com as entradas/saídas do utilizador.
- `src/main/java/org/example/Methods.java`: Classe que contém a lógica de negócio das operações matemáticas. Usa métodos da classe `Math` para operações complexas como logaritmo e potência.
- `src/test/java/org/example/MethodTest.java`: Classe de testes unitários. Contém anotações como `@BeforeEach` para preparar as instâncias antes de cada teste e `@Test` para validar os métodos da classe `Methods`. Testa casos de sucesso para soma, subtração, multiplicação, divisão e inclui um teste específico (`assertNull`) para divisão por zero.
- `pom.xml`: Ficheiro de configuração do Maven que define a versão do Java e as dependências (JUnit 5).
- `.gitignore`: Configurado para ignorar ficheiros de IDEs (IntelliJ IDEA, Eclipse, NetBeans, VS Code) e ficheiros gerados na compilação.

## ▶️ Como Executar

1. Certifique-se de que possui o **Java 17** (ou superior) e o **Maven** instalados na sua máquina.
2. Clone este repositório.
3. Para compilar o projeto, navegue até à raiz do repositório no terminal e execute: `mvn clean compile`
4. Para executar a aplicação (a classe principal Calculadora): `mvn exec:java -Dexec.mainClass="org.example.Calculadora`

## 🧪 Como Executar os Testes
Os testes unitários validam a precisão matemática da classe Methods. Para correr a bateria de testes, execute o seguinte comando: `mvn test`
Isto irá compilar e executar todos os testes definidos em MethodTest.java, exibindo o relatório de sucesso ou falha no terminal.
