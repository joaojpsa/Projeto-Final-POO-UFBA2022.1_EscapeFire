# Escape Fire

Projeto final da disciplina MATA55 2022.1 - UFBA

| Disciplina      | MATA55 - PROGRAMAÇÃO ORIENTADA A OBJETOS                          |
| --------------- | ----------------------------------------------------------------- |
| **Equipe**      | 04                                                                |
| **Componentes** | Raimon, joaojpsa, Lílian, Mateus Moura, Rafael Casaes, uandersonD |
| **Professor**   | Rodrigo Rocha                                                     |
| **Semestre**    | 2022.1                                                            |

### Descrição do projeto

O projeto consiste em um jogo chamado Escape Fire.

Plataforma: Web / Greenfoot

Linguagem de Programação utilizada: Java

Objetivo do jogo: Voar e comer cogumelos, evitar treta com os urubus e passar bem longe do fogo que ameaça a floresta amazônica.



### Introdução ao jogo

Conheça o papagaio guloso Parrot, que adora voar e comer cogumelos (muitos). Porém na sua querida floresta está ocorrendo uma terrivel queimada e há diversos urubus na localidade que não gostam dele. Ajude-o a se alimentar com cuidado, evitando o fogo e esses urubus.

##### Jogabilidade

Teclado: Seta para Cima - Parrot vai para cima

Seta para esquerda - Parrot vai para esquerda

Seta para direita - Parrot vai para direita



##### Personagens

![parrot.png](https://github.com/joaojpsa/Projeto-Final-POO-UFBA2022.1_EscapeFire/blob/main/doc/images-docs/parrot.png)

Parrot - O papagaio guloso e o protagonista



![urubu.png](https://github.com/joaojpsa/Projeto-Final-POO-UFBA2022.1_EscapeFire/blob/main/doc/images-docs/urubu.png)

Urubu - Antagonistas, não gostam do Parrot



![fogo.png](https://github.com/joaojpsa/Projeto-Final-POO-UFBA2022.1_EscapeFire/blob/main/doc/images-docs/fogo.png)

Fogo Místico - Não se importam com nada a não ser queimar tudo o que tiver no seu caminho. **Cuidado!**



![cogumelo.png](https://github.com/joaojpsa/Projeto-Final-POO-UFBA2022.1_EscapeFire/blob/main/doc/images-docs/cogumelo.png)

Cogumelo - A comida favorita do Parrot (**tente comer todas!**)



#### Estrutura geral do Jogo

![estrutura.png](https://github.com/joaojpsa/Projeto-Final-POO-UFBA2022.1_EscapeFire/blob/main/doc/images-docs/estrutura.png)

### **World**

Classe World que faz parte do Package Greenfoot.

Utilizada para criar o "mundo"  do jogo onde podemos adicionar os elementos/objetos (chamado de Actors)

### Florest

Classe para a criação do nosso cenário. (tamanho da tela, background, elementos etc.)

```java
public class Florest extends World {
   
    public Florest() {
        super(700, 500, 1);
        addObject(new Score(), 25, 476);
        addObject(new Parrot(), 151, 196);
        setBackground("images/Fdia.png");
        playloop();       
    }
```

Criação da classe Florest que herda as propriedades da classe World. E criação da classe construtora de Florest

```java
     public Florest() {
        //codigo aqui      
   }
```

Instanciando os metodos ao Florest

*public Florest()*

```java
super(700, 500, 1);
addObject(new Score(), 25, 476);
addObject(new Parrot(), 151, 196);
setBackground("images/Fdia.png");
playloop(); 
```

| Tipo   | Método                             | Descrição                                                                             |
| ------ | ---------------------------------- | ------------------------------------------------------------------------------------- |
| Classe | super(700, 500,1);                 | Constroi o mundo do jogo, definindo o tamanho em largura e altura e tamanho da célula |
| void   | addObject(new Score(), 25, 476 );  | Adiciona o objeto Score nas posições de largura e altura definida                     |
| void   | addObject(new Parrot(), 25, 476 ); | Adiciona o objeto Parrot nas posições de largura e altura definida                    |
| void   | setBackground("images/Fdia.png");  | Adiciona a imagem de fundo do jogo por meio de um arquivo de imagem (PNG)             |

---

*public void act()*

```java
public void act() {
              
        if (Greenfoot.getRandomNumber(500) < 1) {
            addObject(new Cloud(), 536, Greenfoot.getRandomNumber(91));
            addObject(new Fire(), 637, 331);
            addObject(new Vulture(), 570, 15);
            addObject(new Mushroom(), 470, 47);
                       
        }
        if (Greenfoot.getRandomNumber(600) < 1) {
            addObject(new Fire(), 606, 445);
            addObject(new Mushroom(), 250, 47);
            addObject(new Vulture(), 552, Greenfoot.getRandomNumber(91));

        }
        if (Greenfoot.getRandomNumber(700) < 2) {
            addObject(new Fire(), 615, 400);
            addObject(new Vulture(), 552, Greenfoot.getRandomNumber(90));
        }
        if (Greenfoot.getRandomNumber(700) < 1) {
            addObject(new Vulture(), 552, Greenfoot.getRandomNumber(95));
        }

    }
```

Metodo para atualizar as ações do jogo, instanciando as classes. utilizando o metodo getRandomNumber para alocar o personagem na altura aleatoria dentro de um limite

| Tipo       | Método               | Descrição                                                              |
| ---------- | -------------------- | ---------------------------------------------------------------------- |
| static int | getRandomNumber(500) | Alocar o objeto na altura aleatoria dentro de um limite, neste caso 91 |

---

*public void playloop()*

```java
public void playloop(){
        Greenfoot.playSound("sounds/theme.mp3");
    }
```

Método para tocar a musica do jogo em loop

| Tipo        | Método    | Descrição                                |
| ----------- | --------- | ---------------------------------------- |
| static void | playSound | Toca som por meio de um arquivo de audio |

---

*public void gameOver()*

```java
public void gameOver() {
        addObject(new GameOver("Game Over!"), getWidth() / 2, getHeight() / 2);
        Greenfoot.playSound("sounds/end.wav");
        Greenfoot.stop();
        
    }
```

Método para chamar a classe GameOver

| Tipo        | Método | Descrição                |
| ----------- | ------ | ------------------------ |
| static void | stop   | Pausa a execução do jogo |


