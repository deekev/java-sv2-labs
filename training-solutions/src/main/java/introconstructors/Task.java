package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    /* Task.class fájlban a konstruktor:
    public Task() {
    }
     */

    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }
    // Task.class fájlban már ez a konstruktor szerepel


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start(){
        startDateTime = LocalDateTime.now();
    }



    public static void main(String[] args) {

        Task task = new Task("fogadóóra", "matematika, 1.em. 12-es terem");
        task.setDuration(30);
        task.start();
        System.out.println("Esemény: " + task.getTitle());
        System.out.println("Leírás: " + task.getDescription());
        System.out.println("Kezdete: " + task.getStartDateTime());
        System.out.println("Időtartam: " + task.getDuration() + " perc");
    }
}