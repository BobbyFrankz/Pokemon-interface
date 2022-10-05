import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";

    List<String> attacks = Arrays.asList("surf", "rainDance", "hydroPump", "hydroCanon");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " Surfs! " + enemy.getName() + " Gets hit by 70,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 70;
        enemy.setHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");

    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " Dances in the Rain! " + enemy.getName() + " Gets hit by 60,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 60;
        enemy.setHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");

    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " Pumps some Hydro! " + enemy.getName() + " Gets hit by 55,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 55;
        enemy.setHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");

    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " Uses HydroCanon! " + enemy.getName() + " Gets hit by 50,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 50;
        enemy.setHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");

    }


    List<String> getAttacks() {
        return attacks;
    }
}
