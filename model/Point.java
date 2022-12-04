package model;

import java.util.Scanner;

public class Point {
    private char singPlayer;
    private int coordinateX;
    private int coordinateY;
    private boolean valueCoordinate;
    Scanner scanner = new Scanner(System.in);

    public int getCoordinateX() {
        return coordinateX;
    }

    public int setCoordinateX() {
        System.out.println("Введите горизонталь от 1 до 3");
        int coordinateX = scanner.nextInt();
        valueCoordinate = coordinateX > 0 && coordinateX < 4;
        if (valueCoordinate) {
            this.coordinateX = coordinateX - 1;
        } else {
            setCoordinateX();
        }
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int setCoordinateY() {
        System.out.println("Введите вертикаль от 1 до 3");
        int coordinateY = scanner.nextInt();
        valueCoordinate = coordinateY > 0 && coordinateY < 4;
        if (valueCoordinate) {
            this.coordinateY = coordinateY - 1;
        } else {
            setCoordinateY();
        }
        return this.coordinateY;
    }
}

