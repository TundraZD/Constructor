import java.util.Date;
import java.util.Objects;

public class RecurringTask extends Task {
    private String interval;
    private Date startDate;

    public RecurringTask(String name, String description, Date creationDate, String interval, Date startDate) {
        super(name, description, creationDate);
        this.interval = interval;
        this.startDate = startDate;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        RecurringTask that = (RecurringTask) obj;
        return Objects.equals(interval, that.interval) &&
                Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), interval, startDate);
    }
}
