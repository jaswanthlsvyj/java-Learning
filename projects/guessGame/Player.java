package projects.guessGame;

public class Player {
    public String name;
    private int guess;

    Player(String name){
        this.name = name;
    }

    int getGuess(){
        return this.guess;
    }

    public void  makeGuess(){
        this.guess = (int)(Math.random()*9)+1;
        System.out.println(this.name + " Guessed "+ this.guess);
    }

}
