package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> colors =new ArrayList<>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        System.out.println(colors);
        colors.add("white");
        colors.add("pink");
        colors.add("yellow");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println("sorted");
        System.out.println(colors);
        System.out.println("reversed");
        Collections.reverse(colors);
        System.out.println(colors);
        System.out.println("shuffled");
        Collections.shuffle(colors);
        System.out.println(colors);

        ArrayList<Player> players =new ArrayList<>();
        Player player1 = new Player(95,"Jake");
        Player player2 = new Player(83,"Jay");
        Player player3 = new Player(14,"Kai");
        Player player4 = new Player(7,"Terry");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        System.out.println(players);
        players.sort(Comparator.comparing(Player::getNumber));
        System.out.println(players);


    }
}
