import java.util.Date;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();

        Task task1 = new Task("Task 1", "Description 1", today);
        DeadlineTask deadlineTask1 = new DeadlineTask("Deadline Task 1", "Description 2", today, new Date(today.getTime() + 86400000));
        RecurringTask recurringTask1 = new RecurringTask("Recurring Task 1", "Description 3", today, "daily", today);

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(deadlineTask1);
        taskManager.addTask(recurringTask1);

        List<Task> allTasks = taskManager.getAllTasks();
        for (Task task : allTasks) {
            if (task instanceof DeadlineTask) {
                DeadlineTask deadlineTask = (DeadlineTask) task;
                System.out.println(deadlineTask.getName() + " - " + deadlineTask.getDescription() + " - " + deadlineTask.getCreationDate() + " - " + deadlineTask.getDeadline());
            } else if (task instanceof RecurringTask) {
                RecurringTask recurringTask = (RecurringTask) task;
                System.out.println(recurringTask.getName() + " - " + recurringTask.getDescription() + " - " + recurringTask.getCreationDate() + " - " + recurringTask.getInterval() + " - " + recurringTask.getStartDate());
            } else {
                System.out.println(task.getName() + " - " + task.getDescription() + " - " + task.getCreationDate());
            }
        }

        System.out.println("Total tasks: " + TaskManager.getTaskCount());

        task1.setName("Updated Task 1");
        System.out.println(task1.getName());
    }
}