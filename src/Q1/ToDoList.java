package Q1;

public class ToDoList {

    private int nTasks;     // 3
    private String[] toDo;  // "Watch TV", "Read Book", "Shopping"
    private boolean[] done; // false, true, false

    public ToDoList() {
        toDo = new String[1];
        done = new boolean[1];
        nTasks = 1;
    }

    public ToDoList(int nItems) {
        toDo = new String[nItems]; // null, null, null
        done = new boolean[nItems]; // false, false, false
        nTasks = nItems;
    }

    public void setTask(int taskN, String task) {
        toDo[taskN] = task;
    }

    public String getTask(int taskN) {
        return toDo[taskN];
    }

    public void setDone(int taskN) {
        done[taskN] = true;
    }

    public void displayAllTasks() {
        for (int i = 0; i < nTasks; i++) {
            System.out.println((i + 1) + " " + toDo[i] + "\t" + done[i]);
        }
    }

    public void displayAllDoneTasks() {
        for (int i = 0; i < nTasks; i++) {
            if (done[i]) {
                System.out.println(toDo[i]);
            }
        }
    }

}
