package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode) {
        this.name = issue.name;
        this.time = issue.time;
        this.status = issue.status;
        if (copyMode.equals(CopyMode.WITH_COMMENTS)) {
            this.comments = deepCopyComments(issue);
        }
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }

    private List<Comment> deepCopyComments(Issue issue) {
        List<Comment> result = new ArrayList<>();
        for (Comment actual : issue.comments) {
            result.add(new Comment(actual));
        }
        return result;
    }
}