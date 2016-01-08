package com.lakecjl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Player> players = new ArrayList<Player>();

    public static void main(String[] args) {
        String input = "";
        Scanner scan = new Scanner(System.in);

        while (input.isEmpty()) {
            System.out.println("Please enter how many players (2-5):");
            System.out.println("Or type 'help' for the instructions.");
            input = scan.nextLine();
            if (input.equalsIgnoreCase("help")) {
                printInstructions();
                input = "";
            }
        }

        int numPlayers = Integer.parseInt(input);
        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player();
            player.setPlayerNumber(i + 1);
            System.out.println("Please enter Player " + (i + 1) + " name: ");
            player.setPlayerName(scan.nextLine());
            //add player object to players List
            players.add(player);
        }

        printOutPlayers();
    }

    private static void printOutPlayers() {
        Iterator<Player> PlayerIterator = players.iterator();
        while (PlayerIterator.hasNext()) {
            System.out.println(PlayerIterator.next().toString());
        }
    }

    public static void printInstructions() {
        System.out.println("This is a Math Trivia Game.");
        System.out.println("There are four rounds - Addition, Subtraction, Multiplication, and the Final Round.");
        System.out.println("In each of the first three rounds, you'll get three questions.");
        System.out.println("The players each answer a question based on the theme of the round.");
        System.out.println("You can Bank the possible points with 'bank'");
        System.out.println("The possible points go up by 10 with each correct answer given by a player.");
        System.out.println("Whoever has the most correct answers at the end of the round gets the points.");
        System.out.println("At this point, you vote for a player to be out.");
        System.out.println("Whoever has the most votes against them is out");
        System.out.println("Whoever has the most points at the end of the game wins!\n");
    }
}
