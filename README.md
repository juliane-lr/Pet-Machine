# Pet Machine

Um projeto Java simples que simula uma máquina de banho para pets.

## Arquivos

- `main.java` - ponto de entrada da aplicação e menu de interação via terminal.
- `Pet.java` - classe que representa um pet com nome e estado de limpeza.
- `PetMachine.java` - classe que representa a máquina de banho, controla água, shampoo, limpeza e entrada/saída de pets.

## Funcionalidades

O programa permite:

- Dar banho no pet
- Abastecer a máquina com água
- Abastecer a máquina com shampoo
- Verificar a quantidade de água disponível
- Verificar a quantidade de shampoo disponível
- Verificar se há um pet na máquina
- Colocar um pet na máquina
- Retirar um pet da máquina
- Limpar a máquina

## Requisitos

- Java 8 ou superior

## Como executar

1. Compile os arquivos Java:

```bash
javac main.java Pet.java PetMachine.java
```

2. Execute o programa:

```bash
java main
```

## Uso

Ao executar, escolha uma opção do menu digitando o número correspondente e pressione Enter.

## Observações

- A máquina começa com 30 litros de água e 10 litros de shampoo.
- Cada banho consome 10 litros de água e 2 litros de shampoo.
- A lavagem da máquina consome 3 litros de água e 1 litro de shampoo.
- Se for colocado e tirado da máquina um pet sujo, a máquina deve ser limpa para aceitar um novo pet.
