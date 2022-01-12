package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson) {
        int index = lessons.size();
        for (int i = 0; i < lessons.size() - 1; i++) {
            LocalDateTime startTimeOfLessonBefore = lessons.get(i).getStartTime();
            LocalDateTime startTimeOfLessonAfter = lessons.get(i + 1).getStartTime();
            if (startTimeOfLessonBefore.isBefore(lesson.getStartTime()) && startTimeOfLessonAfter.isAfter(lesson.getStartTime())) {
                index = i + 1;
            } else if (lessons.get(0).getStartTime().isAfter(lesson.getStartTime())) {
                index = 0;
            }
        }
        lessons.add(index, lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        for (Iterator<OnlineLesson> i = lessons.iterator(); i.hasNext(); ) {
            OnlineLesson actual = i.next();
            if (title.equals(actual.getLessonTitle())) {
                result.add(actual);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        for (Iterator<OnlineLesson> i = lessons.iterator(); i.hasNext(); ) {
            OnlineLesson actual = i.next();
            if (actual.getStartTime().equals(startTime)) {
                i.remove();
            }
        }
    }
}