package org.example;

public class Game {
    // Статическое поле для хранения состояния светофора
    private static boolean isGreenLight = true;

    // Метод для установки состояния светофора
    public static void setGreenLight(boolean greenLight) {
        isGreenLight = greenLight;
    }

    // Главный метод: проверяет, выбыл ли игрок с данной скоростью
    public static boolean isPlayerOut(int speed) {
        // Если свет зеленый - никто не выбывает (возвращаем false)
        // Если свет красный - выбывают те, у кого скорость != 0 (возвращаем true)
        return !isGreenLight && speed != 0;
    }
}