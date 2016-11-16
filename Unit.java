package kg.ksucta;

/**
 * Created by Aibek on 12.11.2016.
 */
public interface Unit {

    void onAttack(Unit unit);

    Integer getHealth();

    void setHealth();

}
