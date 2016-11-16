package kg.ksucta;

import java.util.List;

/**
 * Created by Aibek on 12.11.2016.
 */
public class Player implements Unit {
    private Unit underAttackUnit;
    private List<Item> items;

    private Item itemOnHand;

    @Override
    public void onAttack(Unit unit) {
        this.underAttackUnit = unit;
        evaluateWeaponForUnit();
        underAttackUnit.setHealth(underAttackUnit.getHealth() - itemOnHand.);
    }

    private void setPassWeapon(Integer health){
        for (Item item : items) {

        }
        itemOnHand = null;
    }

    private void evaluateWeaponForUnit(){
        Integer health = underAttackUnit.getHealth();
        setPassWeapon(health);
    }
}
