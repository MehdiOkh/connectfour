package logic;

import java.util.concurrent.ThreadLocalRandom;

public class ComputerMove {
    private final Table table;
    private int previousPinCol = -1;

    public ComputerMove(Table table) {
        this.table = table;
    }

    public int move(int playerRow,int playerCol){
        return verticalCheck("red",playerRow,playerCol);
    }
    public int winMove(){
        if (previousPinCol>=0){
            if (table.getBoard()[table.emptyRow(previousPinCol)+1][previousPinCol].equals("yellow")){
                if (table.emptyRow(previousPinCol)<0){
                    while (table.emptyRow(previousPinCol)<0){
                        previousPinCol = ThreadLocalRandom.current().nextInt(0, 7);
                    }
                    table.insertPin("yellow",table.emptyRow(previousPinCol),previousPinCol);
                    return previousPinCol;
                }else{
                    table.insertPin("yellow",table.emptyRow(previousPinCol),previousPinCol);
                    return previousPinCol;
                }
            }else {
                previousPinCol = ThreadLocalRandom.current().nextInt(0, 7);
                while (table.emptyRow(previousPinCol)<0){
                    previousPinCol = ThreadLocalRandom.current().nextInt(0, 7);
                }
                table.insertPin("yellow",table.emptyRow(previousPinCol),previousPinCol);
                return previousPinCol;
            }
        }else {
            previousPinCol = ThreadLocalRandom.current().nextInt(0, 7);
            while (table.emptyRow(previousPinCol)<0){
                previousPinCol = ThreadLocalRandom.current().nextInt(0, 7);
            }
            table.insertPin("yellow",table.emptyRow(previousPinCol),previousPinCol);
            return previousPinCol;
        }
    }
    public int verticalCheck(String pinColor, int row, int column){
        int counter = 1;
        for (int i=row+1; i<=5; i++){
            if (table.getBoard()[i][column].equals(pinColor)){
                counter++;
            }else {
                break;
            }
        }
        if (counter == 3){
            if(row-1>=0){
                table.insertPin("yellow",row-1,column);
                return column;
            }else {
//                random insert
                return winMove();
            }
        }else {
            return horizontalCheck(pinColor,row,column);
        }
    }
    private int horizontalCheck(String pinColor, int row, int column){
        int counter = 1;
        for (int j=column+1; j<=6; j++){
            if (table.getBoard()[row][j].equals(pinColor)){
                counter++;
            }else {
                break;
            }
        }
        for (int j=column-1; j>=0; j--){
            if (table.getBoard()[row][j].equals(pinColor)){
                counter++;
            }else {
                break;
            }
        }
        if (counter == 3){
            if (table.getBoard()[row][column-1].equals("null")){
                table.insertPin("yellow",row,column-1);
                return column-1;
            }else if (table.getBoard()[row][column+1].equals("null")){
                table.insertPin("yellow",row,column+1);
                return column+1;
            }else {
//                random insert
                return winMove();
            }
        }else {
//            random insert
            return winMove();
        }

    }
}
