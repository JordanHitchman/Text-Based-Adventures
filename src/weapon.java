/**
 * Created by Jordan on 13/06/2015.
 */
public abstract class weapon extends item{


    @Override
    public abstract String getName();



    @Override
    public abstract void useItem();

    @Override
    public abstract boolean stackable();

    @Override
    public abstract String getDescription();

    public abstract void useWeapon();


public abstract void equipWeapon();

public abstract void dropWeapon();




}
