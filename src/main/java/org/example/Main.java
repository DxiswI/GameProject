package org.example;
class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        // Допишите здесь логику так, что будет подсчитано и выведено количество
        // игроков, которые выбывают. (с 13 строки ответ)
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.

        int countOfEliminatedPlayers = 0;

        if (isGreenLight == true) {
            countOfEliminatedPlayers = 0;
        } else {
            if (speedOfPlayer1 != 0) {
                countOfEliminatedPlayers = countOfEliminatedPlayers + 1;
            }
            if (speedOfPlayer2 != 0) {
                countOfEliminatedPlayers = countOfEliminatedPlayers + 1;
            }
            if (speedOfPlayer3 != 0) {
                countOfEliminatedPlayers = countOfEliminatedPlayers + 1;
            }
        }

        System.out.println(countOfEliminatedPlayers);
    }
}