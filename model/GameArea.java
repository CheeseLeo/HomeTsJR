package model;

import java.util.Arrays;

public class GameArea {
    private final static char SPACE = ' ';
    public static final char [][] AREA = new char[3][3];



    public static void fillSpaceArea(){
        for (int i = 0; i <AREA.length ; i++) {
            for (int j = 0; j <AREA[0].length ; j++) {
                if(AREA[i][j] == 0){
                    AREA[i][j] = SPACE;
                }
            }
        }
    }
}
