package kg.ksucta;

/**
 * Created by limmar on 15.11.16.
 */
public class Elk implements Unit{
    private String name;
    private String description;

    @Override
    public Integer getHealth() {
        return null;
    }
    public void setHealth() {

    }
    public void onAttack(Unit unit) {
        this.underAttackUnit = unit;
        evaluateWeaponForUnit();
        underAttackUnit.setHealth(underAttackUnit.getHealth() - itemOnHand.);
    }
}
