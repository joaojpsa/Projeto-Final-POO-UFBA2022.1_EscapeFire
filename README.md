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

### Actor

Classe construtora que faz parte do Package Greenfoot.

Utilizada para instanciar os objetos do jogo no mundo

### Cloud, Fire e Vulture

Classe para criação das núvens

```java
public class Cloud extends Actor
{
   
    public Cloud(){
          setImage("nuvem.png");
    }
  
    public void act(){
            setLocation(getX() -1, getY());
       
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }

}
```

Criação da classe Cloud que herda as propriedades da classe Actor. E criação da classe construtora de Cloud



```java
public Cloud(){
          setImage("nuvem.png");
    }
```

Utilizado para referênciar a imagem por meio de arquivo (PNG) utilizando setter

```java
public void act(){
            setLocation(getX() -1, getY());
       
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }
```

Método em que será usado para movimentar o objeto (cloud) horizontalmente (eixo X), sentido Direita para Esquerda.

É utilizado uma condicional para remover a núvem na posição menor ou igual a 12px (da tela do jogo)

***As classes Fire e Vulture utilizam a mesmas estruturas da classe Cloud***

```java
public class Fire extends Actor
{
    
    public Fire(){
        
        setImage("fogo.png");
    }
    
    public void act(){
        
        setLocation(getX() -1, getY());
        
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }
}
```

```java
public class Vulture extends Actor
{
    
    public Vulture(){
        
        setImage("urubu.png");
    }
    
    public void act(){
        
        setLocation(getX() -1, getY());
        
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }
}
```

| Tipo | Método                 | Descrição                                                     |
| ---- | ---------------------- | ------------------------------------------------------------- |
| void | act();                 | Utilizado para o objeto realizar alguma ação                  |
| void | setImage("nuvem.png"); | Utilizado para referênciar a imagem por meio de arquivo (PNG) |

### Game Over

Criação da classe GameOver que herda as propriedades da classe Actor. E criação da classe construtora de GameOver em que recebe como parametro uma String

```java
public class GameOver extends Actor
{
    
    public static final float SIZE_FONT = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    public GameOver(String message){
        makeImage(message);
    }
    private void makeImage(String message){
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(5, 5, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH, HEIGHT);
        
        Font font = image.getFont();
        font = font.deriveFont(SIZE_FONT);
        
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(message, 60, 100);
        setImage(image);
    }
    
}
```

```java
    public static final float SIZE_FONT = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
```

Constantes utilizadas para definir o tamanho a fonte, a largura e altura da tela Game Over

```java
public GameOver(String message){
        makeImage(message);
    }
```

Método utilizado para instanciar a mensagem de GameOver

```java
private void makeImage(String message){
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(5, 5, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH, HEIGHT);
        
        Font font = image.getFont();
        font = font.deriveFont(SIZE_FONT);
        
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(message, 60, 100);
        setImage(image);
    }
```

Método para criar a imagem do GameOver

```java
GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
```

Criado um novo objeto retangulo, utilizando a classe GreenfootImage, com o tamanho de largura e altura definidos anteriormente. 400px e 300px respectivamente.

Sendo utilizado varios métodos dessa classe:

| Tipo | Método                             | Descrição                                                                                                                         |
| ---- | ---------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| void | setColor(new Color(0, 0, 0, 160)); | Especifica a cor que será utilizada, passando os parâmetros de RGB e Alpha                                                        |
| void | fillRect(5, 5, WIDTH, HEIGHT);     | Especifica como será o preenchimento do retangulo, passando as coordenadas do eixo X e Y e também os tamanhos de largura e altura |

Fonte do texto

```java
        Font font = image.getFont();
        font = font.deriveFont(SIZE_FONT);
```

Criando um novo bjeto fonte utilizando os métodos:

| Tipo | Método                        | Descrição                                            |
| ---- | ----------------------------- | ---------------------------------------------------- |
| void | getFont();                    | Obtém a fonte atual do projeto                       |
| void | deriveFont(SIZE_FONT);        | Define o tamanho da fonte (tipo float)               |
| void | setFont(font);                | Especifica a fonte atual                             |
| void | drawString(message, 60, 100); | Desenha a string utilizando cor e fonte especificada |

### Mushroom

Criação da classe Mushroom que herda as propriedades da classe Actor. E criação da classe construtora de Mushroom.

```java
public class Mushroom extends Actor
{
    
    public Mushroom(){
        setImage("cogumelo.png");
    }
   
    private int velDown = 1;
    
    public void act()
    {
        
        fall();
        
    }
    public void fall(){
       
        setLocation(getX(), getY() + velDown);
      
        if(getY() >= 499){
            ((Florest) getWorld()).removeObject(this);
        }
        else if(isTouching(Parrot.class)){
            
            Greenfoot.playSound("sounds/eat.mp3");
           
            Score.add();
            
            ((Florest) getWorld()).removeObject(this);
        }
        
    }
    
}
```

Nesta classe é criado um método para fazer com que o cogumelo caia do céu durante o runtime do jogo

```java

private int velDown = 1;

public void fall(){
       
        setLocation(getX(), getY() + velDown);
      
        if(getY() >= 499){
            ((Florest) getWorld()).removeObject(this);
        }
        else if(isTouching(Parrot.class)){
            
            Greenfoot.playSound("sounds/eat.mp3");
           
            Score.add();
            
            ((Florest) getWorld()).removeObject(this);
        }
        
    }
```

Neste método é definido a localização nos eixos X e Y com a variavel VelDown = 1 para xxxxxxxx (joão)

É criado uma condicional para remover o objeto (cogumelo) na posição que seja maior ou igual a 499px. Senão quando o Parrot toca no cogumento, entra na condição para remover o cogumelo e tocar a mídia de som. 

| Tipo              | Método                                 | Descrição                                                                                                      |
| ----------------- | -------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| void              | setLocation(getX(), getY() + velDown); | Atribui a localização do objeto com os valores de Eixo X e Y + a variavel VelDown, que atualmente representa 1 |
| World             | getWorld();                            | Retorna o mundo que o actor (objeto) está                                                                      |
| void              | removeObject(this);                    | Remove o objeto específico do mundo                                                                            |
| protected boolean | isTouching(Parrot.class);              | Verifica se o objeto está tocando outro objeto de uma classe                                                   |
