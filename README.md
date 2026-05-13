# Identificação

* Nome: Deborah dos Santos Araujo
* Email (@ccc): deborah.araujo@ccc.ufcg.edu.br
* Matrícula: 20250030337

# Roteiro: Ordenação linear

## Material Teórico 

[Counting Sort](https://joaoarthurbm.github.io/eda/posts/ordenacao-linear/)

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/main/java/** no formato de asserts.

> Seu código é tão bom quanto seus testes.

> Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `javac *.java` em **/src/main/java/**

> Executando os testes: `java -ea CountingSortAsserts` e `java -ea RadixSortAsserts` em **/src/main/java/**

## Introdução

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação linear.

## A tarefa. 

### Implementação e testes


**CountingSort.** Implemente os métodos da classe CountingSort. A explicação do que fazer está como comentário no código. Seu objetivo é passar nos testes que disponibilizei.

Ah...confira (sempre!) se você passa nos testes: `java -ea CountingSortAsserts` e `java -ea RadixSortAsserts` em **/src/main/java/**.

Óbvio que você pode simplesmente copiar código da Internet e colar lá. Eu mesmo disponibilizo código. Mas, conselho, assim você não aprende :)

### Teoria

Perguntas importantes:
  
  * Apresente um exemplo concreto em que o Counting Sort é muito adequado.

  > Ordenação de números de fichas em uma fila de espera foi distribuída e por
  > um imprevisto o atendimento precisou ser adiado para o dia seguinte, assim
  > algumas pessoas destas não puderam comparecer no dia seguinte. Normalmente o número
  > máximo de pessoas em uma fila de atendimento não costuma ser
  > muito grande, sendo assim nosso K não desperdiçaria tanto espaço na memória
  
  * Apresente um exemplo concreto em que o Counting Sort não é uma boa alternativa para ordenação.

  > Odenar 50 pessoas por número de CPF. O CPF tem uma quantidade muito grande de
  > digitos em relação a quantidade de pessoas, isso desperdicaria memória.

  * Qual problema do Counting Sort o Radix Sort resolve? Como? 

  > Ordenação com números de muitos digitos, valores muito alto, bem como o
  > exemplo de ordenar 50 pessoas pelo número do CPF delas, assim tenho 11
  > digitos vs 50. O Radix sort vai resolver o problema ordenando digito a
  > digito de cada número deste, e para ordenar esses números entre si ele
  > utilizará couting sort. Dessa maneira o K para cada digito comparado entre
  > eles, vai ser 9. 

    
## Mais estudo

Implemente as seguintes questões no tst-eda:

* Radix Dois Dígitos
* Radix Três Dígitos
