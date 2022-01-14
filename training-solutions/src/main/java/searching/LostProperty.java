package searching;

import java.time.LocalDate;

public class LostProperty implements Comparable<LostProperty> {

    private String regNumber;
    private String description;
    private LocalDate dateOfFind;

    public LostProperty(String regNumber, String description, LocalDate dateOfFind) {
        this.regNumber = regNumber;
        this.description = description;
        this.dateOfFind = dateOfFind;
    }

    public LostProperty(String description, LocalDate dateOfFind) {
        this.description = description;
        this.dateOfFind = dateOfFind;
    }

    public LostProperty(String description) {
        this.description = description;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfFind() {
        return dateOfFind;
    }

    @Override
    public int compareTo(LostProperty o) {
        if (this.description.compareTo(o.description) == 0) {
            return this.dateOfFind.compareTo(o.dateOfFind);
        }
        return this.description.compareTo(o.description);
    }
}
