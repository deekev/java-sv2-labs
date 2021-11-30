package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testAddVehicle() {
        PublicVehicle bus = new Bus(45896, 11.25, "Ikarus");
        PublicVehicle tram = new Tram(12345, 53.99, 6);
        PublicVehicle metro = new Metro(12345, 102.34, 15);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());
    }
}