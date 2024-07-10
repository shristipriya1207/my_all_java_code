import java.util.*;

public class ticTacToe {
 public static void main(String args[]){
    char[][] board = new char[3][3];
    for(int row =0;row<board.length;row++){
        for(int col=0;col < board[row].length;col++){
            board[row][col]=' ';
        }
     }
     char player = 'X';
     boolean gameOver= false;
     
     Scanner sc = new Scanner(System.in);
     while(!gameOver){
       printBoard(board);
       System.out.println("player "+player+" enter : ");
       int row = sc.nextInt();
       int col = sc.nextInt();

       if(board[row][col]==' '){
        board[row][col]= player;
        gameOver = YouWon(board,player);
        if(gameOver){
            System.out.println("player " + player + " has won");
        }
        else{
            if(player=='X'){
                player ='O';
            }
            else{
                player = 'X';
            }

        }

       }
       else{
        System.out.println("invalid input ... try again!!");
       }
       if (isBoardFull(board) && !gameOver) {
        System.out.println("The game ends in a draw!");
        gameOver = true;
    }


     }
     printBoard(board);

 } 
 
 public static  void printBoard(char[][] board){
    for(int row =0;row<board.length;row++){
        for(int col=0;col < board[row].length;col++){
            System.out.print(board[row][col]+" | ");

        }
        System.out.println();
     }
 }

 public static boolean YouWon(char[][] board, char player){
    //check the rows
    for(int row=0;row<board.length;row++){
        if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
            return true;
        }

    }
    //check for column
    for(int col=0;col<board[0].length;col++){
        if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
            return true;
        }

    }
    //check fo diagonal
    
            if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
                return true;
            }
            if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
                return true;
            }
            return false;
        }
        public static boolean isBoardFull(char[][] board) {
            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    if (board[row][col] == ' ') {
                        return false; // There is an empty cell
                    }
                }
            }
            return true; // Board is full
        }
}
