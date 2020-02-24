// edu.ysu.student.tschauer

public class WinCounter {
    
    private final static Integer boardDimension = 3;
    
    public WinCounter(String[][] board){
        this.horizontalWin(board);
        this.verticalWin(board);
    }
    
    // Checks for a horizontal win
    public void horizontalWin(String[][] board){
        for(int i = 0; i < boardDimension - 1; i++){
            if(board[i][1] == board[i][0]){
                if(board[i][2] == board[i][0]){
                    System.out.println("");
                    System.out.println(board[i][0] + "won on row" + i);
                }
            }   
        }
    }
    
    // Checks for a vertical win
    public void verticalWin(String[][] board){
        for(int i = 0; i < boardDimension - 1; i++){
            if(board[1][i] == board[0][i]){
                if(board[2][i] == board[0][i]){
                    System.out.println("");
                    System.out.println(board[0][i] + "won on column" + i);
                }
            }   
        }
    }
    
    // Checks for diagonal win
    public void diagonalWin(String[][] board){
        Integer row = 1;
        Integer column = 1;
        
        // Considers left top, to bottom right 
        if(board[0][0] == board [row][column]){
            row++;
            column++;
            if(board[0][0] == board [row][column]){
                System.out.println("");
                System.out.println(board[0][0] + "won on top left to bottom right diagonal");
            }
        }
        
        // Rests for next win check
        row = 1;
        column = 1;
        
        // Considers left bottom, to top right
        if(board[0][2] == board [row][column]){
            row--;
            column++;
            if(board[0][2] == board [row][column]){
                System.out.println("");
                System.out.println(board[0][0] + "won on left bottom, to top right diagonal");
            }
        }
        
      
        
    }
}
