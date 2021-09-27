/*
(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens on a
chessboard such that no two queens can attack each other (i.e., no two queens are on
the same row, same column, or same diagonal). There are many possible solutions.
Write a program that displays one such solution. A sample output is shown below:
|Q| | | | | | | |
| | | | |Q| | | |
| | | | | | | |Q|
| | | | | |Q| | |
| | |Q| | | | | |
| | | | | | |Q| |
| |Q| | | | | | |
| | | |Q| | | | |
*/
package chapter07.arrays1d.exercises;


public class Exercise_07_36 {
    public static void main(String[] args) {

        final int BOARD_SIZE = 8;
        final char QUEEN_CHAR = 'Q';
        char[] chessboard = new char[BOARD_SIZE * BOARD_SIZE];
        fillChessboard(chessboard);
        placeQueens(chessboard, BOARD_SIZE, QUEEN_CHAR);


    }

    public static void placeQueens(char[] chessboard, int boardSize, char QUEEN_CHAR) {
        int numberOfQueen = 0;
        int tries = 0;
        int totalTries = 0;
        while (numberOfQueen != boardSize) {
            tries++;
            if (tries > boardSize * 5) {
                fillChessboard(chessboard);
                numberOfQueen = 0;
                tries = 0;
            }

            int randomCol = (int) (Math.random() * boardSize);
            int queenIndex = numberOfQueen * boardSize + randomCol;
            if (isColSafe(chessboard, queenIndex, boardSize, QUEEN_CHAR) &&
                    isDiagonalSafe(chessboard, queenIndex, boardSize, QUEEN_CHAR)) {
                chessboard[queenIndex] = QUEEN_CHAR;
                numberOfQueen++;
            }

            totalTries++;

        }
        System.out.println("Total tries: " + totalTries);
        displayChessboard(chessboard, boardSize);


    }

    public static boolean isColSafe(char[] chessboard, int queenIndex, int boardSize, char QUEEN_CHAR) {
        int queenCol = queenIndex % boardSize;
        for (int i = queenCol; i < chessboard.length; i += boardSize) {
            if (chessboard[i] == QUEEN_CHAR)
                return false;
        }
        return true;
    }

    public static boolean isDiagonalSafe(char[] chessboard, int queenIndex, int boardSize, char QUEEN_CHAR) {
        int queenRow = queenIndex / boardSize;
        int queenCol = queenIndex % boardSize;
        boolean diagonalLR = true;
        boolean diagonalRL = true;
        int startIndex = queenCol - queenRow < 0 ? (Math.abs(queenCol - queenRow)) * boardSize : (Math.abs(queenCol - queenRow));
        for (int i = startIndex; i <= (boardSize * (boardSize - 1)); i += (boardSize + 1)) {
            if (chessboard[i] == QUEEN_CHAR) {
                diagonalLR = false;
            }
        }
        startIndex = queenCol + queenRow >= (boardSize - 1) ? (boardSize * (boardSize - 1)) + (Math.abs(queenCol + queenRow) % (boardSize - 1)) : ((queenRow + queenCol) % (boardSize - 1)) * boardSize;

        for (int i = startIndex; i >= (boardSize - 1); i -= (boardSize - 1)) {
            if (chessboard[i] == QUEEN_CHAR)
                diagonalRL = false;
        }

        return diagonalLR && diagonalRL;

    }


    public static void fillChessboard(char[] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            chessboard[i] = ' ';
        }
    }

    public static void displayChessboard(char[] chessboard, int boardSize) {
        for (int i = 0; i < chessboard.length; i++) {
            if (i % boardSize == boardSize - 1)
                System.out.print(chessboard[i] + "|\n");
            else if (i % boardSize == 0)
                System.out.print("|" + chessboard[i] + "|");
            else
                System.out.print(chessboard[i] + "|");
        }
    }

}

/* OUTPUT
Total tries: 4133
|Q| | | | | | | |
| | | | |Q| | | |
| | | | | | | |Q|
| | | | | |Q| | |
| | |Q| | | | | |
| | | | | | |Q| |
| |Q| | | | | | |
| | | |Q| | | | |
 */