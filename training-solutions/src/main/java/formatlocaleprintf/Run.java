package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {

    private String name;
    private List<Double> kms;

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double km) {
        kms.add(km);
    }

    public String printFormattedRunText() {
        String formattedRunText = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod." +
                        " Most %.1f km-t futottál. Csak így tovább!",
                name, LocalDate.now(), kms.size(), kms.get(kms.size() - 1));
        return formattedRunText;
    }



    public static void main(String[] args) {

        Run run = new Run("Kiss Balázs");
        run.addRun(25.41);
        System.out.println(run.printFormattedRunText());

        run.addRun(28.54);
        System.out.println(run.printFormattedRunText());

        run.addRun(19.78);
        System.out.println(run.printFormattedRunText());
    }
}