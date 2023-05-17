package AdventureGame;

import java.util.Scanner;

public class Player {

  private Scanner scan = new Scanner(System.in);

  private int damage;
  private int health;
  private int money;
  private String charName;
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public void selectChar() {
    Samurai samurai = new Samurai();
    Knight knight = new Knight();
    Archer archer = new Archer();

    GameCharacter[] characterList = {
      new Samurai(),
      new Knight(),
      new Archer(),
    };

    System.out.println("-------------------------------");

    for (GameCharacter character : characterList) {
      System.out.println(
        "Karakter: " +
        character.getName() +
        "\tHasar: " +
        character.getDamage() +
        "\tSağlık: " +
        character.getHealth() +
        "\tPara: " +
        character.getMoney()
      );
    }
    System.out.println("-------------------------------");
    System.out.print("Karakter seçiminiz: ");
    int selectChar = scan.nextInt();
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public String getCharName() {
    return charName;
  }

  public void setCharName(String charName) {
    this.charName = charName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
