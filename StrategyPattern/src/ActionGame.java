/**
 * Created by Cheryl on 2016/7/19.
 */
public class ActionGame {
    public static void main(String... argv){
        Character bonds1 = new Bonds("bonds1");
        bonds1.ShowIdentity();
        bonds1.ChangeWeapon(new Axe());
        bonds1.ShowIdentity();
    }
}
