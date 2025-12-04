🪙 Cofrinho Digital – Java (POO)

Um projeto em Java desenvolvido para a disciplina de Programação Orientada a Objetos, simulando um cofrinho digital capaz de armazenar diferentes moedas, converter valores e gerenciar depósitos e remoções.

📌 Objetivo do Projeto

Implementar um sistema de console utilizando Java 17 e Programação Orientada a Objetos (POO), aplicando:

Herança

Polimorfismo

Classes abstratas

Listas

Encapsulamento

Sobrescrita de métodos (toString, equals, hashCode)

Controle de fluxo (switch, loops)

🏗️ Arquitetura do Sistema
src/
 └── org.example
       ├── model
       │      ├── Moeda.java
       │      ├── Real.java
       │      ├── Dolar.java
       │      └── Euro.java
       │
       ├── service
       │      └── CofrinhoService.java
       │
       ├── controller
       │      └── CofrinhoController.java
       │
       ├── utils
       │      └── MenusStrings.java
       │
       └── Main.java

💰 Funcionalidades
✔️ 1. Adicionar moedas

O usuário escolhe o tipo de moeda (Real, Dólar ou Euro) e o valor a ser depositado.

✔️ 2. Remover moedas

Permite remover valores específicos, respeitando o tipo da moeda.

✔️ 3. Listar moedas

Exibe todas as moedas atualmente armazenadas no cofrinho.

✔️ 4. Converter total para Real

Soma todos os valores, convertendo Dólar e Euro para Real com base em taxas pré-definidas.

🧱 Modelo de Moeda

Cada moeda possui:

Atributo valor

Método info()

Método converterParaReal()

As classes específicas herdam de Moeda e definem:

Taxas de conversão

Mensagens informativas

🕹️ Como Executar
1️⃣ Clone o repositório
git clone https://github.com/Matheusjsg/projeto-cofre-UNINTER

2️⃣ Abra o projeto na sua IDE (IntelliJ/Eclipse/VS Code)

Certifique-se de estar usando Java 17.

3️⃣ Rode a classe principal
src/main/java/org/example/Main.java


O menu será iniciado automaticamente pelo CofrinhoController.

🖼️ Exemplo do Menu
===== COFRINHO =====
1 - Adicionar moeda
2 - Remover moeda
3 - Converter para Real
4 - Listar moedas
0 - Encerrar

===== Moedas =====
1 - Euro
2 - Dólar
3 - Real

📚 Conceitos de POO Aplicados

Abstração: classe Moeda como modelo comum

Herança: Real, Euro e Dólar estendem Moeda

Polimorfismo: uso de converterParaReal() e info() de forma dinâmica

Encapsulamento: valores armazenados em lista privada

Coleções: uso de ArrayList<Moeda>

Sobrescrita: equals() e hashCode() para remoção correta

🔧 Tecnologias Utilizadas

Java 17

IntelliJ IDEA

Git e GitHub

Paradigma de Programação Orientada a Objetos

👨‍🎓 Autor

Matheus Jesus
Projeto desenvolvido para fins acadêmicos.
Sinta-se à vontade para sugerir melhorias ou abrir issues.
