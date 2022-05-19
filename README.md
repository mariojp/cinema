
# PROJETO: CINEMA

## SOBRE
O cinema faz parte da indústria do entretenimento há muito tempo: um bom filme é uma forma de escapar da realidade e viver uma variedade de emoções. A melhor experiência de cinema que você pode obter é provavelmente em um teatro de cinema. Neste projeto, você criará um aplicativo que ajuda a administrar uma sala de cinema: vende ingressos, verifica as vagas disponíveis, vê estatísticas de vendas e muito mais.


## Objetivos de aprendizagem
Este projeto é uma boa oportunidade para trabalhar com entrada e saída em Java. Você lidará com matrizes e funções multidimensionais, bem como com loops e instruções condicionais.

# Parte 1 

## Descrição
Existem muitas atividades divertidas neste pequeno planeta Terra engraçado e, ainda assim, a mais feliz, mais simples e mais gratificante de todas é provavelmente ir ao cinema. Ir com amigos, ir com seus entes queridos, experimentar uma aventura totalmente nova na segurança de uma poltrona de cinema, cercado por companheiros de viagem que pensam da mesma forma.

Como um desenvolvedor iniciante, você pode contribuir para a criação dessa experiência maravilhosa de cinema. Seus bons amigos pediram que você os ajudasse a criar um aplicativo para uma sala de cinema onde as pessoas podem conseguir ingressos, reservar lugares e desfrutar de sua noite de cinema.

## Objetivos
Não há muito espaço em nosso novo cinema, então você precisa levar em consideração as restrições quanto ao número de assentos. Seus amigos disseram que a sala caberia em 7 fileiras de 8 assentos. Sua tarefa é ajudá-los a visualizar a disposição dos assentos, imprimindo o esquema no console.

Sua saída deve ser como no exemplo abaixo e deve conter 9 linhas.

```
Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S
```




# Parte 2

## Descrição
Bom trabalho: nossos amigos gostaram muito do seu programa! Agora eles querem expandir seu teatro e adicionar salas de tela com mais assentos. No entanto, isso é caro, então eles querem ter certeza de que valerá a pena. Ajude-os a calcular o lucro de todos os ingressos vendidos, dependendo do número de assentos disponíveis.

## Objetivos
Neste estágio, você precisa construir um metodo que receber dois números inteiros positivos: 
- o número de fileiras 
- o número de assentos em cada fileira. 

O preço do ingresso é determinado pelas seguintes regras:
- Se o número total de assentos na sala de tela não for superior a 60, o preço de cada ingresso será de ```R$10```.

- Em uma sala maior, os ingressos custam ```R$10``` para a metade da frente das fileiras e ```R$8```  para a metade posterior. Observe que o número de linhas pode ser ímpar, por exemplo, 9 linhas. Neste caso, a primeira metade são as primeiras 4 linhas e a segunda metade são as 5 linhas restantes.

Calcule o lucro dos ingressos vendidos em função do número de assentos e imprima o resultado conforme os exemplos abaixo. Depois disso, seu programa deve parar.

Observe que, neste projeto, o número de filas de assentos não será maior que 9.

Exemplo 1:
```
> Numero de Fileiras: 4
> Numero de Cadairas por fila: 5
> Resultado Total: R$200
```
Exemplo 2:
```
> Numero de Fileiras: 8
> Numero de Cadairas por fila: 9
> Resultado Total: R$648
```

Exemplo 3:
```
> Numero de Fileiras: 9
> Numero de Cadairas por fila: 7
> Resultado Total: R$560
```


# Parte 3

## Descrição
Ao escolher um bilhete, você se orienta não apenas pela sua preferência de espaço, mas também por suas finanças. Vamos implementar a oportunidade de verificar o preço do ingresso e ver o assento reservado.

## Objetivos
- Com o numero de filas e assentos por fila, imprima a disposição dos assentos como na primeira parte.
- Em seguida, com o numero de uma fila e o numero do assento nessa fila ( estes números representam as coordenadas do assento)  imprimir o preço do bilhete. 

O preço do ingresso é determinado pelas mesmas regras da parte 2:
- Se o número total de assentos na sala de tela não for superior a 60, o preço de cada ingresso será de ```R$10```.
- Em uma sala maior, os ingressos custam ```R$10``` para a metade da frente das fileiras e ```R$8```. Observe que o número de linhas pode ser ímpar, por exemplo, 9 linhas. Neste caso, a primeira metade são as primeiras 4 linhas e a segunda metade são as 5 linhas restantes.

- Por ultimo voce deve imprimir todas as poltronas da sala telada conforme mostrado no exemplo e marcar a poltrona escolhida com o símbolo B e o preço do assento.

Observe que, neste projeto, o número de filas e assentos não será maior que 9.

Exemplo 1:
```
> Numero de Fileiras: 7
> Numero de Cadairas por fila: 8
> Numero da Fileira: 3
> Numero da Cadeira: 6
```
Saida:
```
Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

Ingresso: R$10

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S B S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S
```


# Parte 4

## Descrição
Administrar um cinema não é um negócio fácil. Para ajudar nossos amigos, vamos adicionar estatísticas ao seu programa.


## Objetivos
As estatísticas mostrarão:
- O número de ingressos comprados;
- O número de ingressos comprados representado como uma porcentagem. As porcentagens devem ser arredondadas para 2 casas decimais;
- Renda atual
- Receita total que mostra quanto dinheiro o teatro receberá se todos os ingressos forem vendidos.

# Parte 5 

## Descrição
Para facilitar o desenvolvimento vamos trocar os arrays por Coleções.


## Objetivos
Uso de coleções List, Set e Map


# Parte 6 

## Descrição
Esse codigo Precisa se tornar Orientado a Objetos para facilitar a manutenção.


## Objetivos
Identifique as Entidades e substitua no codigo


# Parte 7 

## Descrição
Use pacotes para dividir o codigo em camadas.


## Objetivos
Organizar em camadas e usar pacotes


# Parte 8 

## Descrição
Troque a camada de view que esta no console por uma interface grafica


## Objetivos
Uso de swing e Eventos, Observer etc.


# Parte 9 

## Descrição
Salve os dados de configuração das salas em arquivo


## Objetivos
Uso de Files.









