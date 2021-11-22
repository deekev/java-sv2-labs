package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        List<Trainer> trainers = Arrays.asList(new Trainer("John", 42),
                new Trainer("Jack", 55),
                new Trainer("Jane", 36),
                new Trainer("Jill", 56));
        Trainer trainerWithMaxAge = maxAgeCalculator.getTrainerWithMaxAge(trainers);

        assertEquals("Jill", trainerWithMaxAge.getName());
        assertEquals(56, trainerWithMaxAge.getAge());
    }
}