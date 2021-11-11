package meetingrooms;

public class Menu {

    private final StringBuilder menu = new StringBuilder(
            "1. Tárgyaló rögzítése\n" +
                    "2. Tárgyalók sorrendben\n" +
                    "3. Tárgyalók visszafele sorrendben\n" +
                    "4. Minden második tárgyaló\n" +
                    "5. Területek\n" +
                    "6. Keresés pontos név alapján\n" +
                    "7. Keresés névtöredék alapján\n" +
                    "8. Keresés terület alapján\n" +
                    "9. Kilépés");

    public StringBuilder getMenu() {
        return menu;
    }
}