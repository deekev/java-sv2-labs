package controlselection.month;

public class DayInMonth {

    public int getNumberOfDaysInMonth (int year, String month) {
        boolean leapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        int numberOfDays;
        switch (month.toLowerCase()) {
            case "január" :
            case "március" :
            case "május" :
            case "július" :
            case "augusztus" :
            case "október" :
            case "december" :
                numberOfDays = 31;
                break;
            case "április" :
            case "június" :
            case "szeptember" :
            case "november" :
                numberOfDays = 30;
                break;
            case "február" :
                if (leapYear) {
                    numberOfDays = 29;
                    break;
                } else {
                    numberOfDays = 28;
                    break;
                }
            default:
                numberOfDays = 0;
        }
        return numberOfDays;
    }
}