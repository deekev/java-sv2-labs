package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        if (present == null) {
            throw new IllegalArgumentException("Present is null.");
        }
        presents.add(present);
    }

    public List<ChristmasPresent> getPresents() {
        return new ArrayList<>(presents);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> iterator = presents.iterator();
        while (iterator.hasNext()) {
            ChristmasPresent actual = iterator.next();
            if (actual.getPrice() > maxPrice) {
                iterator.remove();
            }
        }
    }
}