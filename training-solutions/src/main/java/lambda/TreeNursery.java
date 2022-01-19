package lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {

    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public List<Sapling> getSaplings() {
        return new ArrayList<>(saplings);
    }

    public void prune(int maxHeight) {
        saplings.forEach(sapling -> sapling.cut(maxHeight));
    }

    public void sell(String specie, int minHeight) {
        saplings.removeIf(sapling -> sapling.getSpecie().equals(specie) && sapling.getHeight() > minHeight);
    }
}