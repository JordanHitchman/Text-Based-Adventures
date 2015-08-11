import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Jordan on 31/07/2015.
 */
public class enemy {

    String type;
    int health;
    int damage;
    HashMap<item, Integer> loot;


    public enemy(){
        type = createType();
        loot = new HashMap<item, Integer>();

    }


    public String createType(){
        String[] enemies = new String[]{"Orc, Troll, Goblin, Skeleton"};
        int random = new Random().nextInt(enemies.length);
        return enemies[random];
    }

    public static void setHealth(){


    }

}
