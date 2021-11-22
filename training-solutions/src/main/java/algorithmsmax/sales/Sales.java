package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson withMaxSalesAmount = null;
        for (Salesperson actual: sales) {
            if (withMaxSalesAmount == null || actual.getAmount() > withMaxSalesAmount.getAmount()) {
                withMaxSalesAmount = actual;
            }
        }
        return withMaxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson withFurthestAboveTarget = null;
        for (Salesperson actual: sales) {
            if (withFurthestAboveTarget == null || actual.getDifferenceFromTarget() > withFurthestAboveTarget.getDifferenceFromTarget()) {
                withFurthestAboveTarget = actual;
            }
        }
        return withFurthestAboveTarget;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson withFurthestBeloweTarget = null;
        for (Salesperson actual: sales) {
            if (withFurthestBeloweTarget == null || actual.getDifferenceFromTarget() < withFurthestBeloweTarget.getDifferenceFromTarget()) {
                withFurthestBeloweTarget = actual;
            }
        }
        return withFurthestBeloweTarget;
    }
}