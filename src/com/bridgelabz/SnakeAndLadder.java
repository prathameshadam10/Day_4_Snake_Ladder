package com.bridgelabz;
import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Start the Snake and Ladder Game");
        System.out.println("Player 1 at Start Position 0");
        int RollDice = (int) (Math.random() * 6 + 1);
        System.out.println("dice rolls by: " + RollDice);
        Scanner InputValue = new Scanner(System.in);
        System.out.println("enter Option");
        int Option = InputValue.nextInt();
        int position = 0;
        switch (Option) {
            case 1:
                System.out.println("NO PLAY: " + position);
                System.out.println("Player stays in the same position");
                break;
            case 2:
                System.out.println("LADDER: " + (RollDice + position));
                System.out.println("Player moves ahead by: " + RollDice);
                break;
            case 3:
                System.out.println("SNAKE: " + (RollDice + position));
                System.out.println("Player moves behind by: " + RollDice);

        }
    }
}

