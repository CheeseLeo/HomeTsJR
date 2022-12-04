package validarot;

import Controller.Dispatcher;
import model.GameArea;
import model.Players;

import static model.GameArea.*;
import static model.Players.playersCount;


public class Validator {


    public static boolean checkCountPlayers() {
        return playersCount != 2;
    }


    public static boolean checkCoordinate(int x, int y) {
        if (AREA[x][y] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkAreaSing(int x, int y) {
        if (AREA[x][y] != ' ') {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkSetSingPlayer() {
        return playersCount == 1;
    }


}
