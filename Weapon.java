package kg.ksucta;

/**
 * Created by limmar on 15.11.16.
 */
public class Weapon implements Item{
    private String name;
    private String description;
    private Player player=new Player();


    @Override
    public void aboutHealth() {
        Integer health=player.getHealth();
        health-=20;
    }
}
