package analysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PokerTournament {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество игроков от 300 до 600: ");
        int numPlayers = sc.nextInt();

         System.out.print("Введите байин: ");
         double buyIn = sc.nextDouble();

         System.out.print("Введите количество игроков команды : ");
         int myPlayers = sc.nextInt();

        System.out.print("Введите количество турниров : ");
        int numberOfTournaments = sc.nextInt();


        System.out.println(winningCalculation(players(numPlayers,"winners.txt"),numberOfTournaments,myPlayers, (int) buyIn));

    }




    public static List<Integer> players(int numPlayers, String filename) throws FileNotFoundException {
        List<Integer> listPlayers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            for (int i = 1; i <= numPlayers; i++) {
                if ((line = br.readLine()) != null) {
                    int gift = Integer.parseInt(line);
                    listPlayers.add(gift);
                } else {
                    listPlayers.add((int) 0);
                    Collections.shuffle(listPlayers);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listPlayers;
    }
    public static Integer winningCalculation(List<Integer> list,int numberOfTournaments,int  myPlayers, int buyIn){
        int sum = 0;
        int totalPrizeTournament = 0;
        for (int i = 0; i < numberOfTournaments - 1 ; i++) {
            //System.out.println(list);
            Collections.shuffle(list);
            //System.out.println(list.subList(0,myPlayers));
            for (int j = 0; j < myPlayers; j++) {
                totalPrizeTournament += list.get(j);
            }

           // System.out.println(totalPrizeTournament);


        }
        //System.out.println(buyIn * myPlayers * numberOfTournaments);
        return (totalPrizeTournament)- (buyIn * myPlayers * numberOfTournaments);
    }

}

