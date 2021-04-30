package logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {

    private final String[][] board;
    private final ArrayList<Integer[]> winnerPins = new ArrayList<>();

    public Table() {
        this.board = new String[6][7];
//        fill array with null in the beginning
        for (String[] row : board){
            Arrays.fill(row,"null");
        }
    }
    public int emptyRow(int column){
        int emptyRow = -1;
        for (int i=0; i<=5; i++){
            if (board[i][column].equals("null")){
                emptyRow = i;
            }
        }
        return emptyRow;
    }
    public void insertPin(String pinColor, int row, int column){
        board[row][column] = pinColor;
    }
    public String winnerCheck(String pinColor, int row, int column){

        for (int j=0; j<=6; j++){
            if (board[0][j].equals("null")){
                break;
            }else if(j==6){
                return "draw";
            }
        }

        if (verticalCheck(pinColor,row,column).equals(pinColor)){
            System.out.println("vertical");
            winnerPins.forEach(array -> System.out.println(Arrays.toString(array)));
            return pinColor;
        }else if (horizontalCheck(pinColor,row,column).equals(pinColor)){
            System.out.println("horizontal");
            winnerPins.forEach(array -> System.out.println(Arrays.toString(array)));
            return pinColor;
        }else if (diagonalCheckPartOne(pinColor,row,column).equals(pinColor)||diagonalCheckPartTwo(pinColor,row,column).equals(pinColor)){
            System.out.println("diagonal");
            winnerPins.forEach(array -> System.out.println(Arrays.toString(array)));
            return pinColor;
        }else {
            return "none";
        }

    }
    public String verticalCheck(String pinColor, int row, int column){
        int counter = 1;
        for (int i=row+1; i<=5; i++){
            if (board[i][column].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{i,column});
            }else {
                winnerPins.clear();
                break;
            }
        }
        if (counter >= 4){
            return pinColor;
        }else {
            return "none";
        }
    }

    public String[][] getBoard() {
        return board;
    }

    private String horizontalCheck(String pinColor, int row, int column){
        int counter = 1;
        for (int j=column+1; j<=6; j++){
            if (board[row][j].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{row,j});
            }else {
                winnerPins.clear();
                break;
            }
        }
        for (int j=column-1; j>=0; j--){
            if (board[row][j].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{row,j});
            }else {
                winnerPins.clear();
                break;
            }
        }
        if (counter >= 4){
            return pinColor;
        }else {
            return "none";
        }

    }

    private String diagonalCheckPartOne(String pinColor, int row, int column){
        int counter = 1;
        int i = row-1;
        int j = column+1;
        while (i>=0 && j<=6){
            if(board[i][j].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{i,j});
            }else {
                winnerPins.clear();
                break;
            }
            j++;
            i--;
        }
        i = row+1;
        j = column-1;
        while (i<=5 && j>=0){
            if (board[i][j].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{i,j});
            }else {
                winnerPins.clear();
                break;
            }
            j--;
            i++;
        }
        if (counter >= 4){
            return pinColor;
        }else {
            return "none";
        }
    }

    private String diagonalCheckPartTwo(String pinColor, int row, int column){
        int counter = 1;
        int i = row-1;
        int j = column-1;
        while (i>=0 && j>=0){
            if(board[i][j].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{i,j});
            }else {
                winnerPins.clear();
                break;
            }
            j--;
            i--;
        }
        i = row+1;
        j = column+1;
        while (i<=5 && j<=6){
            if (board[i][j].equals(pinColor)){
                counter++;
                winnerPins.add(new Integer[]{i,j});
            }else {
                break;
            }
            j++;
            i++;
        }
        if (counter >= 4){
            return pinColor;
        }else {
            return "none";
        }
    }

    public ArrayList<Integer[]> getWinnerPins() {
        return winnerPins;
    }
}
