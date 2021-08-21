package com.company;

public class Main {

    public static void main(String[] args) {
        /*02 - Solicitar a idade de um número indefinido de pessoas e imprimir a média
        de idade lidas. O programa se encerra quando a média de idade for superior
        a 20 anos ou que tenha lido 10 pessoas.*/

        /*LerIdades mediaIdades = new LerIdades();
        mediaIdades.menu();*/

        /*03 - Escrever um programa que leia, valores inteiros, até ser lido o valor-99.
        Quando isso acontecer o programa deverá escrever a soma e a média dos valores lidos.*/

        /*SomaMediaValores somaMediaValores = new SomaMediaValores();
        somaMediaValores.menu();*/

        /*04 - Escrever um programa que receba vários números inteiros no teclado e no final
        imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)*/

        /*MediaNumbersMultiplosPor3 multiplosPor3 = new MediaNumbersMultiplosPor3();
        multiplosPor3.menu();*/

        /*06 - Escreva um programa que crie um array de inteiros data e use um laço for
        para criar um novo String que exiba o conteúdo do array data entre chaves e separado
        por vírgulas. Por exemplo, se o array data tiver tamanho 4 e armazenar os
        valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.*/

        /*ArrayNumerosEmString arrayString = new ArrayNumerosEmString();
        arrayString.menu();*/

        /*07 - Elabore uma classe que receba 5 notas de alunos por meio, armazene essas notas
        em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente
        (da maior para a menor) e a média aritmética das notas.*/

        /*MediaDasCincoNotas imprimeNotas = new MediaDasCincoNotas();
        imprimeNotas.menu();
        imprimeNotas.mediaNotas();*/

        /*08 - Crie uma classe que armazena os 12 meses do ano em um array. A seguir, gere um valor
        randômico entre 0 e 11 e apresente o mês correspondente ao valor sorteado. Considere que o
        valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.*/

        /*MesesDoAno mesesRandom = new MesesDoAno();
        mesesRandom.menu();*/

        /*2º docs com exercícios*/

        /*01 - Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a
        média das notas da turma e em seguida exibe a relação de nomes cuja nota é
        superior a esta média. Utilize vetores para armazenar as notas.*/

        /*Exerc01Docs02 notasDaTurma = new Exerc01Docs02();
        notasDaTurma.menu();*/

        /*02 - Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. Calcule
        a média de todas elas. Exiba o conjunto das notas maiores do que a média
        calculada. Em seguida, de forma agrupada, exiba o outro conjunto de notas
        (menores do que a média).Utilize vetores*/

        /*Exerc02Docs02 notas = new Exerc02Docs02();
        notas.menu();*/

        /*03 - Leia um conjunto de alunos, cada uma com o nome e a nota. Em seguida exiba o
        nome dos alunos que possuem a nota maior do que a média da turma*/

        /*04 - Leia um conjunto de valores inteiros e em seguida os exiba-os na ordem inversa do
        que foram digitados.*/

        /*05 - Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu
        preenchimento automático com os números de 101 a 150, ou seja, na posição
        número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente.
        Em seguida exiba os valores deste vetor.*/

        /*MostrarNumeros numerosDaArray = new MostrarNumeros();
        numerosDaArray.receber();
        numerosDaArray.mostrar();*/

        /*06 - Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu
        preenchimento automático de forma randômica. Em seguida exiba os valores deste
        vetor.*/

        /*07 - Escreva uma classe Estatística em Java que faça a leitura de uma
        Matriz 5x5, a classe deve ao final mostrar:
        a. A moda dos elementos no array (elemento mais freqüente).
        b. A mediana dos elementos no array (elemento central).
        c. A média.*/

        /*Exercícios slides*/

        /*01 - Dadas as temperaturas que foram registradas diariamente durante uma
        semana, deseja-se determinar em quantos dias dessa semana a temperatura esteve
        acima da média. A solução para esse problema envolve os seguintes passos:
        a) obter os valores das temperaturas
        b) calcular a média desses valores
        c) verificar quantos deles são maiores que a média*/

        /*Temperatura temperatura = new Temperatura();
        temperatura.obterTemperatura();
        temperatura.calcularMedia();
        temperatura.verificar();*/

        /*13 - Faça um programa que preencha um vetor com dez números inteiros,
        calcule e mostre os números superiores a cinquenta e suas respectivas posições.
        O programa deverá mostrar  mensagem se não existir nenhum número nessa condição.*/

        /*Exerc13DoSlide.tamanho = 20;     por tamanho ser uma variavel estática, posso acessar e mudar seu valor direto do Main*/
        /*Exerc13DoSlide verificaNumeros = new Exerc13DoSlide();
        verificaNumeros.obterNumeros();
        verificaNumeros.exibirInfos();*/

        /*Exercícios da internet como exemplo para matrizes*/

        /*01 - Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.Após
        isso determine o maior número da matriz e sua posição (linha, coluna) */

        /*Exerc01Internet matrizM = new Exerc01Internet();
        matrizM.menu();*/

        /*02 - Gere e imprima uma matriz M 10x10 com valores aleatórios de 0 - 9. Após isso
        indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.*/

        /*Exerc02Internet matriz = new Exerc02Internet();
        matriz.menu();*/

        /*03 - Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima
        a matriz criada e encontre a quantidade de números pares, e a quantidade de números ímpares*/

        /*Exerc03Internet matriz = new Exerc03Internet();
        matriz.menu();*/

        /*04 - Faça um programa para armazenar em uma matriz os COMPROMISSOS de uma agenda pessoal. Cada
        dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos associar uma tarefa
        específica (compromisso agendado). O programa dever ter um menu onde o usuário indica o dia do mês
        que deseja alterar a hora, entrando em seguida com o compromisso, ou então, o usuário pode também
        consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.*/

        /*Exerc04Internet matriz = new Exerc04Internet();
        matriz.menu();*/

        /*05 - Modifique o programa interior de maneira a guardar os compromissos de todo o ano,
        organizados por mês, dia e hora (só 8 horas por dia).*/

        /*Exerc05Internet matriz = new Exerc05Internet();
        matriz.menu();*/

        /*06 - Faça um programa para jogar o jogo da velha. O programa deve permitir
        * que dois jogadores façam uma partida do jogo da velha, usando o computador
        * para ser o tabuleiro. Cada jogador vai alternadamente informando a posição
        * onde deve colocar a sua peça ('0' ou 'X'). O programa deve impedir jogadas
        * inválidas e determinar automáticamente quando o jogo terminou e quem foi o
        vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar
        a situação do tabuleiro na tela.*/

        /*Exerc06Internet matrizJogoDaVelha = new Exerc06Internet();
        matrizJogoDaVelha.menu();*/

        /*3º docs com exercícios*/

        /*01 - Faça um programa para ler uma matriz 4 por 4, contendo os valores de notas de g1, e
        outro de g2. Ao final, o programa deve mostrar as médias dos alunos, mostrando se o
        aluno está aprovado, em exame ou reprovado. Considere média > 7 para aprovação,7 <
        média >6 para exame; e < 6 como reprovado. Importante deve ser validado que as notas
        aceitas sejam de 0 a 10.*/

        /*Exerc01Docs03Matriz matriz = new Exerc01Docs03Matriz();
        matriz.menu();*/

        /*Exercicio valendo sorpresa do Ramon*/

        ExercRamon matriz = new ExercRamon();
        matriz.menu();
    }
}
