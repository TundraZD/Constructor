import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private static int taskCount = 0;
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        taskCount++;
    }

    public void removeTaskById(int id) {
        for (Task task : tasks) {
            if (task.hashCode() == id) {
                tasks.remove(task);
                taskCount--;
                break;
            }
        }
    }

    public List<Task> getAllTasks() {
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getCreationDate().compareTo(t2.getCreationDate());
            }
        });

        return tasks;
    }

    public static int getTaskCount() {
        return taskCount;
    }
}
