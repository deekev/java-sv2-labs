package sorting;

import java.time.LocalDateTime;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private LocalDateTime time;

    public Patient(String name, String socialSecurityNumber, LocalDateTime time) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
