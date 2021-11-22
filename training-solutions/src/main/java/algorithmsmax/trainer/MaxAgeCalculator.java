package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainerWithMaxAge = null;
        for (Trainer actual: trainers) {
            if (trainerWithMaxAge == null || actual.getAge() > trainerWithMaxAge.getAge()) {
                trainerWithMaxAge = actual;
            }
        }
        return trainerWithMaxAge;
    }
}