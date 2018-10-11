package Experiment4.T1;

public class BandBooster {
    public String name;
    public int boxesSold;

    public String getName() {
        return name;
    }

    public int getBoxesSold() {
        return boxesSold;
    }

    public BandBooster(String newName){
        name = newName;
        boxesSold = 0;
    }
    public void updateSales(int Sales){
        boxesSold = Sales + boxesSold;
    }

    @Override
    public String toString() {
        return name + ":" + boxesSold + "boxes\n";
    }
}
