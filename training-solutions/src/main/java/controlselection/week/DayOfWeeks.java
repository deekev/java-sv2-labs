package controlselection.week;

public class DayOfWeeks {

    public String getTypeOfDay(String day) {
        String typeOfDay;
        switch (day.toLowerCase()) {
            case "hétfő" :
                typeOfDay = "hét eleje";
                break;
            case "kedd" :
            case "szerda" :
            case "csütörtök" :
                typeOfDay = "hét közepe";
                break;
            case "péntek" :
                typeOfDay = "majdnem hétvége";
                break;
            case "szombat" :
            case "vasárnap" :
                typeOfDay = "hét vége";
                break;
            default:
                typeOfDay = "ismeretlen nap";
        }
        return typeOfDay;
    }
}