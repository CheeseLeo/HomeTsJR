package Controller;

import model.GameArea;
import model.Players;
import view.PrintClass;

public class Dispatcher {
    public static boolean loop = true;

    public static void start() {
        GameArea.fillSpaceArea();
        PrintClass.drawArea();
        Move.move();
    }
}
