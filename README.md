# 🐾 Pet Machine

Aplicação em Java que simula o funcionamento de uma máquina de banho para pets.

O projeto foi desenvolvido como exercício prático de **Programação Orientada a Objetos (POO)**, trabalhando separação de responsabilidades entre classes, encapsulamento, controle de estado e implementação de regras de negócio.

## 🎯 Objetivo

O objetivo do projeto é representar, por meio de classes e objetos, o funcionamento de uma máquina que recebe um pet, realiza o banho e controla recursos como água e shampoo.

A aplicação é executada pelo terminal e disponibiliza um menu para interação com as diferentes funcionalidades.

## ⚙️ Funcionalidades

A aplicação permite:

- colocar um pet na máquina;
- verificar se existe um pet na máquina;
- realizar o banho;
- retirar o pet;
- abastecer água;
- abastecer shampoo;
- consultar os níveis de água e shampoo;
- limpar a máquina;
- controlar o estado de limpeza da máquina.

## 📋 Regras de negócio

A aplicação implementa algumas regras para controlar o funcionamento da máquina:

- apenas **um pet por vez** pode permanecer na máquina;
- a máquina inicia com **30 litros de água** e **10 litros de shampoo**;
- cada banho consome **10 litros de água** e **2 litros de shampoo**;
- a limpeza da máquina consome **3 litros de água** e **1 litro de shampoo**;
- a capacidade máxima é de 30 litros de água e 10 litros de shampoo;
- um banho só pode ser realizado quando existe um pet na máquina;
- água e shampoo são verificados antes da realização do banho ou da limpeza;
- caso um pet seja retirado ainda sujo, a máquina precisa ser limpa antes de receber outro pet.

## 🧱 Estrutura e orientação a objetos

O projeto foi dividido em três classes principais:

### `Pet`

Representa o pet e mantém informações relacionadas ao seu nome e estado de limpeza.

### `PetMachine`

Representa a máquina e concentra suas regras de funcionamento, incluindo:

- controle de água;
- controle de shampoo;
- estado de limpeza;
- entrada e saída de pets;
- banho;
- limpeza da máquina.

### `Main`

Responsável pela interação com a pessoa usuária por meio do terminal.

A classe apresenta o menu de opções e direciona as ações escolhidas para os métodos correspondentes da `PetMachine`.

## 🛠️ Tecnologias e conceitos

- Java
- Programação Orientada a Objetos
- Classes e objetos
- Encapsulamento
- Métodos
- Estruturas condicionais
- Controle de estado
- Regras de negócio
- Git e GitHub

## 📁 Estrutura do projeto

```text
Pet-Machine/
│
├── Main.java
├── Pet.java
├── PetMachine.java
└── README.md
```

## 🚀 Como executar

É necessário ter o **Java instalado** na máquina.

### 1. Clone o repositório

```bash
git clone https://github.com/juliane-lr/Pet-Machine.git
cd Pet-Machine
```

### 2. Compile os arquivos

```bash
javac Main.java Pet.java PetMachine.java
```

### 3. Execute a aplicação

```bash
java Main
```

### 4. Utilize o menu

Após iniciar a aplicação, escolha uma das opções disponíveis digitando o número correspondente:

```text
1. Dar banho no pet
2. Abastecer a máquina com água
3. Abastecer a máquina com shampoo
4. Verificar água na máquina
5. Verificar shampoo na máquina
6. Verificar se tem pet na máquina
7. Colocar pet na máquina
8. Retirar pet da máquina
9. Limpar a máquina
0. Sair
```

## 💡 O que pratiquei

O desenvolvimento deste projeto permitiu praticar fundamentos de Java e Programação Orientada a Objetos, especialmente a divisão de responsabilidades entre classes e o controle do estado dos objetos.

Também foram trabalhadas regras de negócio e validações para impedir operações inválidas, como realizar um banho sem pet, consumir recursos insuficientes ou inserir um novo pet enquanto a máquina precisa ser limpa.

## 📌 Contexto

Projeto desenvolvido como exercício prático durante meus estudos de **Java e Programação Orientada a Objetos** na formação em Análise e Desenvolvimento de Sistemas.
