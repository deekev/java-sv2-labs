package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendriveList) {
        Pendrive best = pendriveList.get(0);
        for (Pendrive pendrive: pendriveList) {
            if (best.comparePricePerCapacity(pendrive) == 1) {
                best = pendrive;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList) {
        Pendrive cheapest = pendriveList.get(0);
        for (Pendrive pendrive: pendriveList) {
            if (pendrive.isCheaperThan(cheapest)) {
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {
        for (Pendrive pendrive: pendriveList) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}