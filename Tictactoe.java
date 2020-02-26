/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Arrays;

/**
 *
 * @author Aaron
 */
public class Tictactoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void start(){
        
        char [][] gameBoard = {{' ','|',' ','|',' '},
            {'_','+','_','+','_'},
            {' ','|',' ','|',' '},
            {'_','+','_','+','_'},
            {' ','|',' ','|',' '}};
        
        printGameBoard(gameBoard);
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your move:1-9");
        int pos = scan.nextInt();
        
        System.out.print(pos);
        
        switch (pos){
            case 1:
                gameBoard[0][0]='x';
        }
        public static void printGameBoard(char[][]gameBoard){
            for(char [] row: gameBoard){
            for (char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
            
        }
                
        }
    }

