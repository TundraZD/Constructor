import java.util.Date;
import java.util.Objects;

public class DeadlineTask extends Task {
    private Date deadline;

    public DeadlineTask(String name, String description, Date creationDate, Date deadline) {
        super(name, description, creationDate);
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        DeadlineTask that = (DeadlineTask) obj;
        return Objects.equals(deadline, that.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deadline);
    }
}
