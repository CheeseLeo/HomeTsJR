package view;

import model.Players;
import org.w3c.dom.ls.LSOutput;

import static model.GameArea.AREA;

public class PrintClass {
    public static void drawArea(){
        for (int i = 0; i <AREA.length ; i++) {
            for (int j = 0; j <AREA.length ; j++)
            {
                if(j==2){
                    System.out.print(AREA[i][j]);
                }else {
                    System.out.print(AREA[i][j] + " "+ "|");
                }
            }
            System.out.println();
            if(i!= 2)
                for (int j = 0; j <AREA.length; j++) {
                    System.out.print("---");
                }
            System.out.println();

        }
    }

    public static void whoGoes(Players players){
        System.out.println(players.getName() + " Ваш ход");
    }


    public static void whoWins(Players players){
        System.out.println(players.getName() + " победил");
    }
}
