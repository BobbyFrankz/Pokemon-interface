import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";

    List<String> attacks = Arrays.asList("leechSeed", "solarBeam", "leaveBlade", "leafStorm");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


    public void leechSeed(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Leeches A Seed! " + enemy.getName() + " Gets hit by 90,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 90;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Beam Beam!!! " + enemy.getName() + " Gets hit by 60,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 60;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses LeaveBlade! " + enemy.getName() + " Gets hit by 55,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 55;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {System.out.println(name.getName() + " Uses LeafStorm! " + enemy.getName() + " Gets hit by 45,and has : " + enemy.getHp() + "HP");
        int damage = enemy.getHp() - 45;
        enemy.setHp(damage);
        System.out.println(name.getName() + " has " + enemy.getHp() + " HP left");
        System.out.println("");
    }
    List<String> getAttacks() {
        return attacks;


    }

}

