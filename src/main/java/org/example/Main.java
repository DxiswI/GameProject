package org.example;

public class Main {
    public static void main(String[] args) {
        // Устанавливаем красный свет (можно изменить на true для зеленого)
        Game.setGreenLight(false);

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int countOfEliminatedPlayers = 0;

        // Используем метод isPlayerOut из класса Game
        if (Game.isPlayerOut(speedOfPlayer1)) {
            countOfEliminatedPlayers++;
        }
        if (Game.isPlayerOut(speedOfPlayer2)) {
            countOfEliminatedPlayers++;
        }
        if (Game.isPlayerOut(speedOfPlayer3)) {
            countOfEliminatedPlayers++;
        }

        System.out.println(countOfEliminatedPlayers);
    }
}