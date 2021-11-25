package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Woman {

    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Woman(String name) {
        this.name = name;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}