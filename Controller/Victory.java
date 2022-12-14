package Controller;

import model.Players;
import view.PrintClass;

import static model.GameArea.AREA;

public class Victory {
    public static boolean wins = true;
    public static void gorizontalVictory(Players players){
        int countOfVictory = 0;
        for (int i = 0; i < AREA.length; i++) {
            for (int j = 0; j < AREA.length; j++) {
                if (AREA[i][j] == players.getSingPlayer()) {
                    countOfVictory++;
                }
                if (countOfVictory == 3){
                    PrintClass.whoWins(players);
                    wins = false;
                }
            }
            countOfVictory = 0;
        }
    }
    public static void verticalVictory(Players players){
        int countOfVictory = 0;
        for (int i = 0; i < AREA.length; i++) {
            for (int j = 0; j < AREA.length; j++) {
                if (AREA[j][i] == players.getSingPlayer()) {
                    countOfVictory++;
                }
                if (countOfVictory == 3){
                    PrintClass.whoWins(players);
                    wins = false;
                }
            }
            countOfVictory = 0;
        }
    }
    public static void diagonalVictory(Players players){
        int countOfVictory = 0;
        for (int i = 0; i < AREA.length; i++) {
            if (AREA[i][i] == players.getSingPlayer()) {
                countOfVictory++;
            }
            if (countOfVictory == 3){
                wins = false;
                PrintClass.whoWins(players);
            }
        }
    }


    public static void victory(Players players) {
      gorizontalVictory(players);
      verticalVictory(players);
      diagonalVictory(players);
    }

}
