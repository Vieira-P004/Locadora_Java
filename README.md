# 🚗 Sistema de Cálculo de Locadora de Veículos

## 📌 Descrição

Este projeto foi desenvolvido como uma atividade do MAISTI com o objetivo de praticar conceitos básicos da linguagem JavaScript, sendo também implementado na linguagem Java.

* Métodos
* Estruturas de repetição (`do...while`)
* Estruturas condicionais (`if`)
* Entrada de dados com `Scanner`

O programa simula o cálculo do valor a ser pago pelo aluguel de um veículo com base na quantidade de quilômetros rodados.

---

## ⚙️ Funcionamento

O sistema solicita ao usuário:

* Quantidade de dias com o carro alugado
* Quantidade de quilômetros rodados

A lógica aplicada é:

* O valor base considera **até 100 km**
* Caso o cliente ultrapasse esse limite, é cobrado um valor adicional de **R$12 por km excedente**

---

## 🧠 Lógica do Método

O cálculo principal acontece no método:

```java
public static int locadora(int kmCliente)
```

### Regras:

* Valor inicial: `90`
* Se `kmCliente > 100`:

    * Para cada km adicional, soma-se `+12`

---

## ▶️ Execução

### Exemplo de uso:

```text
Dias rodados:
3
km rodados:
120

Você ficou com o carro alugado por 3 dias.
Valor gasto: R$330
```

---

## 🛠️ Tecnologias utilizadas

* Java
* IDE IntelliJ

---

## 📚 Objetivo educacional

Este exercício tem como foco:

* Praticar a criação de métodos
* Entender o uso de laços de repetição
* Trabalhar com entrada e saída de dados
* Aplicar lógica de programação em um problema real

---

