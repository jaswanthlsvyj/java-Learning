package projects.guessGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    int machineGuess;
    ArrayList<Player> playersList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int numPlayers;

    Game(){
        createPlayers();
    }
    
    void createPlayers(){
        
        this.numPlayers = input.nextInt();

        for ( int i=0; i < this.numPlayers; i++){
            System.out.printf("Enter the Player "+(i+1)+" Name : ");
            playersList.add(new Player(input.next()));
        }
    }

    void play(){
        this.machineGuess = (int)(Math.random()*9)+1;
        System.out.println("Machine guessed "+ machineGuess);

        while (true) {
            
            for ( int i=0; i < this.numPlayers; i++){
                playersList.get(i).makeGuess();
            }
            if (checkWinner()){
                System.out.println("Game over");
                break;
            }
        }
    }

    private boolean checkWinner(){

        for ( int i=0; i < this.numPlayers; i++){
            if (playersList.get(i).getGuess() == this.machineGuess){
                System.out.println(playersList.get(i).name + " Won!");
                return true;
            }
        }
        return false;
        
    }
}
