/**
 * Created by Cheryl on 2016/7/19.
 */
public class Bonds extends Character {
    public Bonds(String defined){
        name = defined;
        weapon = new Gun();
    }
    public void ShowIdentity(){
        System.out.println("I am " + name + "; ");
        weapon.IdentifyWeapon();
    }
}
