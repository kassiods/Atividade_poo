# Prática POO 02 - Encapsulamento

Módulo de Gestão Financeira de Contas Estudantis (`Aluno` e `ContaEstudantil`), aplicando os princípios de encapsulamento da POO. Instituto Federal do Piauí, Campus Picos, disciplina de Programação Orientada a Objetos.

## Tecnologias

| Camada | Tecnologia |
|---|---|
| Linguagem | Java 21 |
| Build | Maven |

## Como executar

Pré-requisitos: JDK 21+ e Maven 3.9+ instalados.

```bash
mvn compile exec:java
```

## Estrutura

- `src/main/java/contaestudantil/Aluno.java`: dados do aluno (matrícula imutável, nome, e-mail)
- `src/main/java/contaestudantil/ContaEstudantil.java`: saldo, limite de crédito e operações (`depositar`, `pagar`, `transferir`)
- `src/main/java/contaestudantil/Main.java`: testes pedidos no enunciado (instanciação, depósito, pagamento com limite, transferência)
- `respostas.pdf`: respostas às perguntas conceituais sobre encapsulamento, SRP e acoplamento
# Atividade_poo
