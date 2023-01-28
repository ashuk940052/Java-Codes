
import java.util.*;

class Task {
    private String empName;
    private String taskName;

    public Task(String empName, String taskName) {
        this.empName = empName;
        this.taskName = taskName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}

class Company {
    final ArrayList<Task> taskList = new ArrayList<>();

    public ArrayList<String> uniqueTask() {
        ArrayList<String> uniqueTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (!uniqueTasks.contains(task.getTaskName())) {
                uniqueTasks.add(task.getTaskName());
            }
        }
        Collections.sort(uniqueTasks);
        return uniqueTasks;
    }

    public int maximumEmployee() {
        HashMap<String, Integer> taskCounts = new HashMap<>();
        for (Task task : taskList) {
            if (taskCounts.containsKey(task.getTaskName())) {
                taskCounts.put(task.getTaskName(), taskCounts.get(task.getTaskName()) + 1);
            } else {
                taskCounts.put(task.getTaskName(), 1);
            }
        }
        int maxEmployee = 0;
        for (int count : taskCounts.values()) {
            maxEmployee = Math.max(maxEmployee, count);
        }
        return maxEmployee;
    }
}


public class Sourse {
    public static void main(String[] args) {
        Company obj = new Company();
        obj.taskList.add(new Task("emp1", "task1"));
        obj.taskList.add(new Task("emp2", "task2"));
        obj.taskList.add(new Task("emp3", "task1"));
        System.out.println(obj.uniqueTask());
        System.out.println(obj.maximumEmployee());
    }
}