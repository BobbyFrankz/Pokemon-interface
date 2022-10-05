import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {



    private static final String type = "electric";

    List<String> attacks = Arrays.asList("thunderPunch","electroBall","thunder","voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


    void thunderPunch(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses thunderPunch " + enemy.getName() + " Gets hit by 80, and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 80;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }

     void electroBall(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses electroBall! " + enemy.getName() + " Gets hit by 60,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 60;
         enemy.setHp(damage);
         System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
         System.out.println("");
     }

     void thunder(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Strikes Thunder! " + enemy.getName() + " Gets hit by 50,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 50;
         enemy.setHp(damage);
         System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
         System.out.println("");

     }

     void voltTackle(Pokemon name, Pokemon enemy){System.out.println(name.getName() + " Uses VoltTackle! " + enemy.getName() + " Gets hit by 45,and has : " + enemy.getHp() + "HP");
         int damage = enemy.getHp() - 45;
         enemy.setHp(damage);
         System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
         System.out.println("");

     }
    List<String> getAttacks() {
        return attacks;


    }

}




