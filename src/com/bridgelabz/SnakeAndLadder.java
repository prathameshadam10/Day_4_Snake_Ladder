package com.bridgelabz;
import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Start the Snake and Ladder Game");
        System.out.println("Single Player at Start Position 0");
        int positionFirstPlayer = 0;
        boolean currentTurn = true;
        while(positionFirstPlayer != 100){
            if(currentTurn == true){
                System.out.println("Player 1 currently at Position "+ positionFirstPlayer);
                int RollDice=(int)(Math.random()*6+1);
                System.out.println("dice rolls by: "+RollDice);
                int currentOption = (int)(Math.random()*3+1);
                switch(currentOption)
                {
                    case 1:
                        System.out.println("NO PLAY: "+positionFirstPlayer);
                        System.out.println("Player stays in the same position");
                        break;
                    case 2:
                        System.out.println("LADDER: "+(RollDice+positionFirstPlayer));
                        System.out.println("Player moves ahead by: "+RollDice);
                        positionFirstPlayer = positionFirstPlayer + RollDice;
                        break;
                    case 3:
                        System.out.println("SNAKE: "+(-RollDice+positionFirstPlayer));
                        System.out.println("Player moves behind by: "+RollDice);
                        positionFirstPlayer = positionFirstPlayer - RollDice;
                        break;
                }
                if(positionFirstPlayer < 0){
                    positionFirstPlayer = 0;
                }
                System.out.println();
            }
        }
        System.out.println("Player 1 reached the winnning Position 100");
    }
}
