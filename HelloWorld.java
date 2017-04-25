public class HelloWorld {
int age = 30;
String name;
int victories = 0;
int health = 100;
int g = 3;

class Weapon {
  String name;
  int damage;
}


  public static void main(String[] args) {

    HelloWorld john = new HelloWorld;

    System.out.println("Hello Person");

    if (args.length > 0) {
      System.out.println("There is args");
    } else {
      System.out.println("There is no args");
    }

    john.local;

    for (int x = 3; x < 5; x++) {
      System.out.println("Loop" + x);
      System.out.println("you have " + this.health + "HP");
    }

  }

  public void field() {
    System.out.println(this.g);
  }

  public void shadow(String name) {
    name = this.name;
    System.out.println("Hello " + name);
  }

  public void local() {
    int g = 5;
    int j;
    System.out.println(g);
    if (true) {
      int t = 8;
      j = j + t;
      System.out.println(j);
    }
  }

  public void fight(int enemyHealth, int enemyDamage) {
    Weapon sword = new Weapon;
    sword.damage = 100;
    this.health = this.health - enemyDamage;
    enemyHealth = enemyHealth - this.Weapon.damage;
    if (enemyHealth <= 0) {
      this.victories++;
      System.out.println("You defeated the enemy, you have " + this.victories + " many victories in battle");
    } else {
      System.out.println("You fought valiently but the enemy still remains on " + enemyHealth + "HP");
    }

    if (this.health <= 0) {

      System.out.println("You were defeated by the enemy, better luck next time");
      //other code for death
    }
  }


}
