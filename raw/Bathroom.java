package raw;

import java.util.Scanner;

public class Bathroom {
    private String floor;
    private String ceil;
    private String wallType;
    private String washType;

    public Bathroom() {
        floor = "Не указан";
        ceil = "Не указан";
        wallType = "Не указан";
        washType = "Не указан";
    }

    public Bathroom(String floor, String ceil, String wallType, String washType) {
        this.floor = floor;
        this.ceil = ceil;
        this.wallType = wallType;
        this.washType = washType;
    }

    public String getFloor() {
        return floor;
    }

    public String getCeil() {
        return ceil;
    }

    public String getWallType() {
        return wallType;
    }

    public String getWashType() {
        return washType;
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите материал пола: ");
        this.floor = scanner.nextLine();
        System.out.print("Введите материал потолка: ");
        this.ceil = scanner.nextLine();
        System.out.print("Введите тип стен (1 - Плитка, 2 - Стандартные): ");
        int wallTypeInput = scanner.nextInt();
        switch (wallTypeInput) {
            case 1:
                this.wallType = "Плитка";
                break;
            case 2:
                this.wallType = "Стандартные";
                break;
            default:
                throw new IllegalArgumentException("Вы ввели что-то неправильно!");
        }
        System.out.print("Введите средство для мытья (1 - Душ, 2 - Ванна): ");
        int washTypeInput = scanner.nextInt();
        switch (washTypeInput) {
            case 1:
                this.washType = "Душ";
                break;
            case 2:
                this.washType = "Ванна";
                break;
            default:
                throw new IllegalArgumentException("Вы ввели что-то неправильно!");
        }
    }
}