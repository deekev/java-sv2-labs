package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person){
        numberOfPeople += person;
    }

    public void ride(double km){
        kms += km;
    }


    public static void main(String[] args) {

        CyclingTour cyclingTour = new CyclingTour("Eger - Poroszló", LocalDate.of(2021,10,30));
        System.out.println("Útvonal: " + cyclingTour.getDescription());
        System.out.println("Indulás: " + cyclingTour.getStartTime());
        System.out.println("Résztvevők száma: " + cyclingTour.getNumberOfPeople());
        System.out.println("Megtett út: " + cyclingTour.getKms() + "km.");
        System.out.println();

        cyclingTour.registerPerson(3);
        cyclingTour.registerPerson(2);
        cyclingTour.registerPerson(1);
        cyclingTour.ride(12.6);
        cyclingTour.ride(25.8);
        cyclingTour.ride(14.2);

        System.out.println("Útvonal: " + cyclingTour.getDescription());
        System.out.println("Indulás: " + cyclingTour.getStartTime());
        System.out.println("Résztvevők száma: " + cyclingTour.getNumberOfPeople());
        System.out.println("Megtett út: " + cyclingTour.getKms() + "km.");
    }
}