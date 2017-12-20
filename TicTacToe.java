package integration;

/**
 * @author Saniya Ashraf.
 */
public class TicTacToe {

  private char[][] board;
  private char currentPlayer;

  /**
   * main constructor.
   */
  public TicTacToe() {
    board = new char[3][3];
    currentPlayer = 'x';
    initializeBoard();
  }

  /**
   * initial setup.
   */
  public void initializeBoard() {


    for (int i = 0; i < 3; i++) {


      for (int j = 0; j < 3; j++) {
        board[i][j] = '-';
      }
    }
  }

  /**
   * prints the empty board on screen.
   */
  public void printBoard() {
    System.out.println("-------------");

    for (int i = 0; i < 3; i++) {
      System.out.print("| ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  /**
   * to check if the board is full.
   * 
   * @return true or false .
   */

  public boolean isBoardFull() {
    boolean isFull = true;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == '-') {
          isFull = false;
        }
      }
    }

    return isFull;
  }

  /**
   * calls two 3 later defined functions. to check if a player has won.
   * 
   * @return true or false.
   */
  public boolean checkForWin() {
    return (checkRowsForWin() || checkColumnsForWin()
        || checkDiagonalsForWin());
  }

  /**
   * checks rows to find a win.
   * 
   * @return true or false.
   */
  private boolean checkRowsForWin() {
    for (int i = 0; i < 3; i++) {
      if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
        return true;
      }
    }
    return false;
  }

  /**
   * checks columns to find a win.
   * 
   * @return true or false.
   */
  private boolean checkColumnsForWin() {
    for (int i = 0; i < 3; i++) {
      if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
        return true;
      }
    }
    return false;
  }

  /**
   * @return true or false.
   */
  private boolean checkRowCol(char c1, char c2, char c3) {
    return ((c1 != '-') && (c1 == c2) && (c2 == c3));
  }

  /**
   * @return true or false.
   */
  private boolean checkDiagonalsForWin() {
    return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
        || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
  }

  /**
   * to change the player in the game.
   */
  public void changePlayer() {
    if (currentPlayer == 'x') {
      currentPlayer = 'o';
    } else {
      currentPlayer = 'x';
    }
  }

  /**
   * @param row for rows.
   * @param col for column.
   * @return true to say it has exited right.
   */
  public boolean placeMark(int row, int col) {

    // Make sure that row and column are in bounds of the board.
    if ((row >= 0) && (row < 3)) {
      if ((col >= 0) && (col < 3)) {
        if (board[row][col] == '-') {
          board[row][col] = currentPlayer;
          return true;
        }
      }
    }

    return false;
  }
}
