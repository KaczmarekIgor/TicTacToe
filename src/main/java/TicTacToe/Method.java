package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static TicTacToe.Main.cpuPositions;
import static TicTacToe.Main.playerPositions;

public class Method {

    public static void printTable(char[][] tab) {
        for (char[] row : tab) {
            for (char x : row) {
                System.out.print(x);
            }
            System.out.println();
        }
    }


    public static void placePiece(char[][] tab, String user, int pos) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch (pos) {
            case 1:
                tab[0][0] = symbol;
                break;
            case 2:
                tab[0][2] = symbol;
                break;
            case 3:
                tab[0][4] = symbol;
                break;
            case 4:
                tab[2][0] = symbol;
                break;
            case 5:
                tab[2][2] = symbol;
                break;
            case 6:
                tab[2][4] = symbol;
                break;
            case 7:
                tab[4][0] = symbol;
                break;
            case 8:
                tab[4][2] = symbol;
                break;
            case 9:
                tab[4][4] = symbol;
                break;
            default:
                break;
        }
    }


    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 4, 8);
        List rigCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> wining = new ArrayList<List>();

        wining.add(topRow);
        wining.add(midRow);
        wining.add(botRow);
        wining.add(leftCol);
        wining.add(midCol);
        wining.add(rigCol);
        wining.add(cross1);
        wining.add(cross2);
        for (List l : wining) {
            if (playerPositions.containsAll(l)) {
                return "You win !!!";
            } else if (cpuPositions.containsAll(l)) {
                return "cpu win !!!";
            } else if (playerPositions.size() + playerPositions.size() == 9) {
                return "CAT !! ";
            }
        }
        return "";
    }
}


