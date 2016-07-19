import java.util.Calendar;

/**
 * Created by Cheryl on 2016/7/19.
 */
abstract public class Character {
    public Character(){};
    String name;
    WeaponBehavior weapon;
    abstract void ShowIdentity();
    public void ChangeWeapon(WeaponBehavior newWeapon){
        weapon = newWeapon;
    }
}
