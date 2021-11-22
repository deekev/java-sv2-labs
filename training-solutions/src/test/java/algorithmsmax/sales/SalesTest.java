package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    Sales sales = new Sales();
    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("John", 600, 500),
            new Salesperson("Bill", 200, 300),
            new Salesperson("Kate", 700, 100),
            new Salesperson("Mary", 700, 300),
            new Salesperson("Karl", 200, 50));

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        Salesperson salespersonWithMaxSales = sales.selectSalesPersonWithMaxSalesAmount(salespersons);
        assertEquals("Kate", salespersonWithMaxSales.getName());
        assertEquals(700, salespersonWithMaxSales.getAmount());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        Salesperson salespersonWithFurthestAboveTarget = sales.selectSalesPersonWithFurthestAboveTarget(salespersons);
        assertEquals("Kate", salespersonWithFurthestAboveTarget.getName());
        assertEquals(600, salespersonWithFurthestAboveTarget.getDifferenceFromTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestBeloweTarget() {
        Salesperson salespersonWithFurthestBeloweTarget = sales.selectSalesPersonWithFurthestBelowTarget(salespersons);
        assertEquals("Bill", salespersonWithFurthestBeloweTarget.getName());
        assertEquals(-100, salespersonWithFurthestBeloweTarget.getDifferenceFromTarget());
    }
}