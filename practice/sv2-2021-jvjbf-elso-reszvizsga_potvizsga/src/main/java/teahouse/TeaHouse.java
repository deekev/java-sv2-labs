package teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeaHouse {

    private String name;
    private LocalTime openTime;
    private LocalTime closeTime;
    private List<Tea> teas = new ArrayList<>(Arrays.asList(
            new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA),
            new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA)));

    public TeaHouse(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public void addTea(Tea tea) {
        teas.add(tea);
    }

    public String getName() {
        return name;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public List<Tea> getTeas() {
        return teas;
    }

    public void setActionPrices(Sort sort, int percent) {
        for (int i = 0; i < teas.size(); i++) {
            if (sort.equals(teas.get(i).getSort())) {
                int decreasedPrice = (int) (teas.get(i).getPrice() * (1 - percent / 100D));
                teas.get(i).setPrice(decreasedPrice);
            }
        }
    }

    public double getAveragePrice() {
        double sum = 0.0;
        for (Tea actual: teas) {
            sum += actual.getPrice();
        }
        return sum / teas.size();
    }
}