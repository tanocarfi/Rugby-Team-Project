/*Classe di supporto per verificare che le istanze funzionino*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Player> foundedPlayers = new ArrayList<>();
        int choice;
        Scanner scanIn = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        do{
            System.out.println("\t - - - - MENU - - - -");
            System.out.println("\t 1. Insert new team;");
            System.out.println("\t 2. Insert new player;");
            System.out.println("\t 3. Search player by name;");
            System.out.println("\t 4. Search player by role;");
            System.out.println("\t 0. Exit.");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Insert name of team: ");
                    String name = scanner.next();

                    System.out.println("Insert year of foundation: ");
                    int year = scanIn.nextInt();

                    Team team = new Team(name, year);
                    teams.add(team);
                    break;
                case 2:
                    System.out.println("Which team should I enter?");
                    String nameTeam = scanner.next();
                    for(int i = 0; i < teams.size(); i++){
                        if(teams.get(i).getName().equals(nameTeam)){
                            System.out.println("Insert name of player: ");
                            String nameP = scanIn.next();
                            System.out.println("Insert surname of player: ");
                            String surname = scanIn.next();
                            System.out.println("Insert address of player: ");
                            String address = scanIn.next();
                            System.out.println("Insert fiscal code of players: ");
                            String fiscalCode = scanIn.next();
                            System.out.println("Insert role of player: ");
                            String role = scanIn.next();
                            System.out.println("Insert number of shirt: ");
                            int number = scanIn.nextInt();
                            Player player = new Player(nameP, surname, address, fiscalCode, role, number);
                            teams.get(i).addPlayer(player);
                        }
                    }
                    break;
                case 3:
                    boolean flag = false;
                    System.out.println("Which team should I enter?");
                    String nameT = scanIn.next();
                    for (int i = 0; i < teams.size(); i++){
                        if(teams.get(i).getName().equals(nameT)){
                            System.out.println("Insert name player: ");
                            String namePl = scanIn.next();
                            foundedPlayers = teams.get(i).findPlayerByName(namePl);

                            flag = true;
                            break;
                        }
                    }
                    for (int i = 0; i < foundedPlayers.size(); i++){
                        foundedPlayers.get(i).toString();
                    }
                    if(flag == false)
                        System.out.println("\tTeam not founded!");
                    break;
                case 4:
                    boolean verify = false;
                    System.out.println("Which team should I enter?");
                    String teamName = scanIn.next();
                    for (int i = 0; i < teams.size(); i++){
                        if(teams.get(i).getName().equals(teamName)){
                            System.out.println("Insert role player: ");
                            String playerRole = scanIn.next();
                            foundedPlayers = teams.get(i).findPlayerByRole(playerRole);

                            verify = true;
                            break;
                        }
                    }
                    for (int i = 0; i < foundedPlayers.size(); i++){
                        foundedPlayers.get(i).toString();
                    }
                    if(verify == false)
                        System.out.println("\tTeam not founded!");
                    break;
                default:
                    System.out.println("Type a number between 1 and 4!");
            }
        }
        while (choice != 0);
    }
}