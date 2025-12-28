package org.example;
class Main {
    public static void main(String[] args) {
        boolean isGreenLight = true;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        // Никто не выбывает в этой ветке

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