package Controller;

import model.GameArea;
import model.Players;
import model.Point;
import validarot.Validator;
import view.PrintClass;

public class Move {
    public static void goGame(){
    }

    public static void move() {
        Players.createdPlayer();
        Players.createdPlayer();
            for (int i = 0; i < 9 && Victory.wins; i++) {
            if (i%2 == 0) {
                step(Players.players[0]);
                Victory.victory(Players.players[0]);
            }else {
                step(Players.players[1]);
                Victory.victory(Players.players[1]);
            }
                PrintClass.drawArea();
            }
    }

    public static void step(Players players) {
        PrintClass.whoGoes(players);
        Point point = new Point();
        int coordinateX = point.setCoordinateX();
        int coordinateY = point.setCoordinateY();
        if(Validator.checkCoordinate(coordinateX,coordinateY) && Validator.checkAreaSing(coordinateX,coordinateY)){
        GameArea.AREA[coordinateX][coordinateY] = players.getSingPlayer();
    }else {step(players);
        }
    }



}
