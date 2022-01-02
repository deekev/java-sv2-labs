package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        validateMarkType(markType.toString());
        validateSubjectAndTutor(subject, tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        validateMarkType(markType);
        validateSubjectAndTutor(subject, tutor);
        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(markType.getInterpretation()).append("(")
                .append(markType.getMarkNumber()).append(")");
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isSubjectNull(Subject subject) {
        return subject == null;
    }

    private boolean isTutorNull(Tutor tutor) {
        return tutor == null;
    }

    private void validateMarkType(String markType) {
        if (isEmpty(markType)) {
            throw new IllegalArgumentException("Mark type can't be empty!");
        }
    }

    private void validateSubjectAndTutor(Subject subject, Tutor tutor) {
        if (isSubjectNull(subject) || isTutorNull(tutor)) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
    }
}