package raw;

import java.util.Scanner;

public class Kitchen {
    private String floor;
    private String ceil;
    public Kitchen() {
        floor = "Не указан";
        ceil = "Не указан";
    }

    public Kitchen(String floor, String ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }

    public String getFloor() {
        return floor;
    }

    public String getCeil() {
        return ceil;
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите материал пола: ");
        floor = scanner.nextLine();
        System.out.print("Введите материал потолка: ");
        ceil = scanner.nextLine();
    }