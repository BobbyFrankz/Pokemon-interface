import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire";

    List<String> attacks = Arrays.asList("flameThrower","fireLash","inferno","pyroBall");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


    void flameThrower(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses FlameThrower! " + enemy.getName() + " Gets hit by 90,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 90;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");

    }

    void fireLash(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Lashes Fire! " + enemy.getName() + " Gets hit by 80,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 800;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }

    void inferno(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses Inferno! " + enemy.getName() + " Gets hit by 50,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 50;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses PyroBall " + enemy.getName() + " Gets hit by 55,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 55;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }


    List<String> getAttacks() {
        return attacks;


    }

}


