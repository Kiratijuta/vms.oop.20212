package Q1;

public class TestToDoList {

    public static void main(String[] args) {

        // Creation
        ToDoList myJobs = new ToDoList(3);

        // Set up the tasks
        myJobs.setTask(0, "Watch TV");
        myJobs.setTask(1, "Read Book");
        myJobs.setTask(2, "Shopping");

        // Get the task
        String item = myJobs.getTask(1);
        System.out.println(item);

        // Set some task to complete
        myJobs.setDone(1);

        // Display all tasks
        System.out.println();
        myJobs.displayAllTasks();

        // Display all complete tasks
        System.out.println();
        myJobs.displayAllDoneTasks();
    }

}
