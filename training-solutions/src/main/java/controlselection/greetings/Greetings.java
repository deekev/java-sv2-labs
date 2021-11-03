package controlselection.greetings;

public class Greetings {

    public String greetAccordingToTime(int hour, int minutes) {
        int timeInMinutes = hour * 60 + minutes;
        if (timeInMinutes > 300 && timeInMinutes <= 540) {
            return "Jó reggelt!";
        } else
        if (timeInMinutes > 540 && timeInMinutes <= 1110) {
            return "Jó napot!";
        } else
        if (timeInMinutes > 1110 && timeInMinutes <= 1200) {
            return "Jó estét!";
        } else {
            return "Jó éjt!";
        }
    }
}