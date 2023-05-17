package AdventureGame;

import java.util.Scanner;

public class Game {

  private Scanner scan = new Scanner(System.in);

  public void start() {
    System.out.println("Macera Oyunu Başladı.");
    System.out.print("Bir isim girin : ");

    // String playerName = scan.nextLine();
    String playerName = "Azad";

    Player player = new Player(playerName);
    System.out.println("Oyuna Hoşgeldin " + player.getName());
    System.out.println("Lütfen bir karakter seçin;");
    player.selectChar();
  }
}
