package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students){
        List<String> groupOne = new ArrayList<>();
        List<String> groupTwo = new ArrayList<>();
        for (String name: students){
            if(name.length() <= 10){
                groupOne.add(name);
            } else {
                groupTwo.add(name);
            }
        }
        System.out.print("1. csoport: ");
        for(String i: groupOne){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.print("2. csoport: ");
        for(String j: groupTwo) {
            System.out.print(j + ", ");
        }
    }


    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add(students.size(), "Lippai Júlia");
        students.add(students.size(), "Milecz Attila");
        students.add(students.size(), "Dobó Lívia");
        students.add(students.size(), "Bakó Béla");
        students.add(students.size(), "Róka Dorka");
        students.add(students.size(), "Karóczkai Dávid");
        students.add(students.size(), "Katona Janka");

        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}