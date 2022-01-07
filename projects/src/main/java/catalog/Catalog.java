package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        if (catalogItem == null) {
            throw new IllegalArgumentException("Item can't be null.");
        }
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Reg.number can't be empty string or null.");
        }
        CatalogItem result = null;
        for (CatalogItem actual: catalogItems) {
            if (registrationNumber.equals(actual.getRegistrationNumber())) {
                result = actual;
            }
        }
        if (result != null) {
            catalogItems.remove(result);
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        if (searchCriteria == null) {
            throw new IllegalArgumentException("Criteria can't be null.");
        }
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem actual: catalogItems) {
            if (isContainsTitle(actual, searchCriteria) || isContainsContributor(actual, searchCriteria)) {
                result.add(actual);
            }
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audios = new ArrayList<>();
        for (CatalogItem actual: catalogItems) {
            if (actual.hasAudioFeature()) {
                audios.add(actual);
            }
        }
        return audios;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> prints = new ArrayList<>();
        for (CatalogItem actual: catalogItems) {
            if (actual.hasPrintedFeature()) {
                prints.add(actual);
            }
        }
        return prints;
    }

    public int getAllPageNumber() {
        int allPages = 0;
        for (CatalogItem actual: catalogItems) {
            allPages += actual.numberOfPagesAtOneItem();
        }
        return allPages;
    }

    public int getFullLength() {
        int fullLength = 0;
        for (CatalogItem actual: catalogItems) {
            fullLength += actual.fullLengthAtOneItem();
        }
        return fullLength;
    }

    public double averagePageNumberOver(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        List<CatalogItem> prints = getPrintedLibraryItems();
        int numberOfPrints = 0;
        int numberOfPages = 0;
        for (CatalogItem actual: prints) {
            numberOfPrints += countPrintedFeaturesOver(actual, pages);
            numberOfPages += countPagesOfPrintsOver(actual, pages);
        }
        if (numberOfPrints == 0) {
            throw new IllegalArgumentException("No page");
        }
        return (double) numberOfPages / numberOfPrints;
    }

    private boolean isContainsTitle(CatalogItem catalogItem, SearchCriteria searchCriteria) {
        return catalogItem.getContributors().contains(searchCriteria.getContributor());
    }

    private boolean isContainsContributor (CatalogItem catalogItem, SearchCriteria searchCriteria) {
        return catalogItem.getTitles().contains(searchCriteria.getTitle());
    }

    private int countPrintedFeaturesOver(CatalogItem print, int pages) {
        int count = 0;
        for (Feature actual: print.getFeatures()) {
            if (actual instanceof PrintedFeatures && ((PrintedFeatures) actual).getNumberOfPages() > pages) {
                count++;
            }
        }
        return count;
    }

    private int countPagesOfPrintsOver(CatalogItem print, int pages) {
        int sum = 0;
        for (Feature actual: print.getFeatures()) {
            if (actual instanceof PrintedFeatures && ((PrintedFeatures) actual).getNumberOfPages() > pages) {
                sum += ((PrintedFeatures) actual).getNumberOfPages();
            }
        }
        return sum;
    }
}