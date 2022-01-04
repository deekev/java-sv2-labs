package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement = new Measurement();

    @Test
    void testReadFromFile() {
        Path path = Paths.get("src/test/resources/measurementdata.csv");
        List<String> result = measurement.readFromFile(path);

        assertEquals(11, result.size());
        assertEquals("6,12.4,John Doe", result.get(6));
    }

    @Test
    void testReadFromFileWithWrongPath() {
        Path path = Paths.get("src/test/resources/measurementdata_csv");

        Exception exception = assertThrows(IllegalStateException.class, ()-> measurement.readFromFile(path));
        assertEquals("Can't read file!", exception.getMessage());
    }

    @Test
    void testValidate() {
        List<String> datas = measurement.readFromFile(Paths.get("src/test/resources/measurementdata.csv"));
        List<String> result = measurement.validate(datas);

        assertEquals(8, result.size());
        assertEquals("2,12.4,John Doe,a", result.get(0));
        assertEquals("9,12.4,", result.get(7));
    }
}