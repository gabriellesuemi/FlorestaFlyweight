# Simulação de Árvores 2D com Flyweight

Alunas:
Gabrielle Suemi Iquejiri Alencar
Lívia Costa da Silva

Projeto em Java que simula a distribuição de milhares de árvores em um terreno 2D utilizando o padrão de projeto Flyweight, com foco na redução do consumo de memória.

## Objetivo

Representar grandes quantidades de árvores de forma eficiente, compartilhando informações repetidas entre objetos.

## Aplicação do Flyweight

As características das árvores foram divididas em:

### Estado Imutável (compartilhado)
Dados da espécie reutilizados entre várias árvores:

- Nome da espécie
- Cor das folhas
- Textura do tronco

Foram criados apenas 50 objetos compartilhados, um para cada espécie.

### Estado Mutável (individual)

Cada árvore possui características próprias:

- Posição X e Y
- Altura
- Diâmetro
- Número de galhos

## Resultado da simulação

Foram distribuídas:

- 10.000 árvores
- 50 espécies diferentes

Com Flyweight:

- 10.000 objetos árvore
- 50 objetos compartilhados
- Total: 10.050 objetos

Sem Flyweight:

- Aproximadamente 20.000 objetos

O uso do padrão reduziu a duplicação de dados e o consumo de memória.

## Economia de memória

Foi realizada uma estimativa de memória comparando os cenários com e sem Flyweight. A simulação mostrou redução significativa no armazenamento de dados repetidos ao reutilizar objetos de espécie compartilhados.