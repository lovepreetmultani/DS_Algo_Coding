package src;

import java.util.HashSet;

public class ValidSudoku {


    private static boolean isValidConfig(char[][] board) {

        HashSet<String> hs = new HashSet<>();
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                char number = board[i][j];
                if(number!='.'){
                    if(!hs.add(number + "in row"+ i)||
                        !hs.add(number + "in column"+ j)||
                          !hs.add(number +"found sub box"+ i/3 + "-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String s[]){
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(
                (isValidConfig(board) ? "YES" : "NO"));
        }
    }

