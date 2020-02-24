package TicTacToe;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static TicTacToe.Method.*;


public class Main {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        char[][] tab = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printTable(tab);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number 1-9");
            int playerPos = scanner.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("position is taken");
                playerPos = scanner.nextInt();
            }

            placePiece(tab, "player", playerPos);
            String result = checkWinner();
            if (result.length()>0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int cpuPos = random.nextInt(9) + 1;
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                System.out.println("is taken");
                cpuPos = random.nextInt(9) + 1;
            }
            placePiece(tab, "cpu", cpuPos);
            printTable(tab);


            result  = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
        }
    }
}

