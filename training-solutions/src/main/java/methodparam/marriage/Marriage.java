package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    private static final String DESCRIPTION = "házasságkötés ideje";

    public void getMarried(Woman woman, Man man) {
        setMarriedName(woman, man);
        woman.addRegisterDate(createMarriageRegistry());
        man.addRegisterDate(createMarriageRegistry());
    }

    private RegisterDate createMarriageRegistry() {
        return new RegisterDate(DESCRIPTION, LocalDate.now());
    }

    private void setMarriedName(Woman woman, Man man) {
        woman.setName(changeWomanName(woman, man));
    }

    private String changeWomanName(Woman woman, Man man) {
        String[] manName = man.getName().split(" ");
        String[] womanName = woman.getName().split(" ");
        return manName[0] + " " + womanName[1];
    }
}