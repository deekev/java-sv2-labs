package meetingrooms;

public class Menu {

    private final StringBuilder menu = new StringBuilder(
            "1. Tárgyaló rögzítése\n")
            .append("2. Tárgyalók sorrendben\n")
            .append("3. Tárgyalók visszafele sorrendben\n")
            .append("4. Minden második tárgyaló\n")
            .append("5. Területek\n")
            .append("6. Keresés pontos név alapján\n")
            .append("7. Keresés névtöredék alapján\n")
            .append("8. Keresés terület alapján\n")
            .append("9. Kilépés");

    public StringBuilder getMenu() {
        return menu;
    }
}