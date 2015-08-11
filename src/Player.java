import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jordan on 13/06/2015.
 */
public class Player {



    String name;
    int health;
    int level;
    HashMap<item, Integer> inventory;
    int maxInv = 28;
    int invSize;


    public Player(String name) {

        level = 1;
        this.name = name;
        health = 100;
        inventory = new HashMap<item, Integer>();
        invSize = 0;

    }


    public void addItem(item item){

        if(inventory.size() >= maxInv){

            System.out.println("Inventory is full!");
        } else if (!item.stackable()) {

            inventory.put(item,invSize++);
        } else {

            inventory.put(item,inventory.get(item));
        }



    }

    public void useItem(item item){
        item.useItem();
    }

    public ArrayList<String> viewInventory(){

        ArrayList<String> tempInv = new ArrayList<>();
for(Map.Entry<item, Integer> entry : inventory.entrySet()){

    String s = entry.getKey().getName().concat(entry.getValue().toString());
    tempInv.add(s);

        }


        return tempInv;


    }

    }

