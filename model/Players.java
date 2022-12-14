package model;

import validarot.Validator;

import java.util.Scanner;

public class Players {
    public static Players[] players = new Players[2];
    public static int playersCount = 0;
    private final String name;
    private char singPlayer;


    public Players() {
        this.name = setName();
        singPlayer = chooseSing();
        playersCount++;
    }

    public String setName() {
        System.out.println("Введите имя");
        String name;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                name = scanner.nextLine();
                if (name.equals("") || name.contains(" ")) {
                    continue;
                } else {
                    break;
                }

            }
            scanner.close();
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public char getSingPlayer() {
        return singPlayer;
    }

    public char chooseSing() {
        Scanner scanner = new Scanner(System.in);
        String sing;
        while (true) {
            if (Validator.checkSetSingPlayer()) {
                return setSingSecondPlayer();
            } else {
                System.out.println("Выберите знак --> X или --> O");
                if (scanner.hasNextLine()) {
                    sing = scanner.nextLine();
                    if (sing.equalsIgnoreCase("X")) {
                        return singPlayer = 'X';
                    } else if (sing.equalsIgnoreCase("O")) {
                        return singPlayer = 'O';
                    } else {
                        chooseSing();
                    }
                } else {
                    chooseSing();
                }
            }
        }
    }
    public static void createdPlayer() {
        if (Validator.checkCountPlayers())
        players[playersCount] = new Players();
    }



    public char setSingSecondPlayer(){
        if (players[0].getSingPlayer() == 'X'){
           return singPlayer = 'O';
        }else {
           return singPlayer = 'X';
        }
    }
}
