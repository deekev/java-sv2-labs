package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private String registrationNumber;
    private int price;
    private List<Feature> features;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        checkConstructorParameters(registrationNumber, price, features);
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = new ArrayList<>(Arrays.asList(features));
    }

    public int fullLengthAtOneItem() {
        int fullLength = 0;
        for (Feature actual: features) {
            if (actual instanceof AudioFeatures) {
                fullLength += ((AudioFeatures) actual).getLength();
            }
        }
        return fullLength;
    }

    public int numberOfPagesAtOneItem() {
        int allPages = 0;
        for (Feature actual : features) {
            if (actual instanceof PrintedFeatures) {
                allPages += ((PrintedFeatures) actual).getNumberOfPages();
            }
        }
        return allPages;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature actual: features) {
            contributors.addAll(actual.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature actual: features) {
            titles.add(actual.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature actual: features) {
            if (actual instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature actual: features) {
            if (actual instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    private void checkConstructorParameters(String registrationNumber, int price, Feature... features) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Reg.number can't be empty string or null.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        for (Feature actual: features) {
            if (actual == null) {
                throw new IllegalArgumentException("Feature can't be null.");
            }
        }
    }
}
