package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testGetNumberOfSeats() {

        Car car = new Car("Trabant", 4);
        FamilyCar familyCar = new FamilyCar();
        SportsCar sportsCar = new SportsCar();

        assertEquals(4, car.getNumberOfSeats());
        assertEquals(5, familyCar.getNumberOfSeats());
        assertEquals(2, sportsCar.getNumberOfSeats());
    }
}