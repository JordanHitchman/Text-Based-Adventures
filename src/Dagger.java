/**
 * Created by Jordan on 13/06/2015.
 */
public class Dagger extends weapon{

    boolean poisoned = false;
    int damage = 5;


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void useItem() {

    }

    @Override
    public String getDescription() {
        return poisoned? "It looks sharp!": "It looks sharp and poisonous!";
    }

    @Override
    public void useWeapon() {

    }

    @Override
    public void equipWeapon() {

    }

    @Override
    public void dropWeapon() {

    }


    @Override
    public boolean stackable(){
        return false;
    }

    public void usePoison(){
        poisoned = true;
    }

}
