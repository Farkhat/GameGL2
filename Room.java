package kg.ksucta;

import kg.ksucta.services.DefaultConsoleIOService;
import kg.ksucta.services.IOService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aibek on 12.11.2016.
 */
public class Room {

    private String name;
    private String description;
    private List<Item> items;
    private List<Room> availableRooms;
    private List<Tip> tips;
    private List<Unit> units;

    public Room(String name, String description) {
        items = new ArrayList<>();
        availableRooms = new ArrayList<>();
        tips = new ArrayList<>();
    }

    public List<Room> getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(List<Room> availableRooms) {
        this.availableRooms = availableRooms;
    }

    public List<Item> getItems() {
        //TODO: rewrite logic
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Tip> getTips() {
        //TODO: rewrite logic
        return tips;
    }

    public void setTips(List<Tip> tips) {
        this.tips = tips;
    }

    public String getWelcomeMessage(){
       return description + " ble bla bnla";
    }


    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
