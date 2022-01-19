package lambda;

public class Sapling {

    private String specie;
    private int height;

    public Sapling(String specie, int height) {
        this.specie = specie;
        this.height = height;
    }

    public String getSpecie() {
        return this.specie;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void cut(int maxHeight) {
        if (height > maxHeight) {
            setHeight(maxHeight);
        }
    }
}
