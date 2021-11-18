package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("blackout.txt");
        System.out.println(path);
        new Electricity().writeStreets(path);
        List<String> result = Files.readAllLines(path);

        assertEquals(5, result.size());
        assertEquals("Cifrakapu utca", result.get(2));
    }
}