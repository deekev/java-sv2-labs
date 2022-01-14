package sorting;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getTime().compareTo(o2.getTime());
    }
}
