package TicTactoe;

public  class gameBoard {
    static char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    public static void printGameBoard() {
        for (char[] row : gameBoard) {
            for (char x : row) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}






