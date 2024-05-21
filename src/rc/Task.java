package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class Task {

    //Instance variables for full name, last name, username and password
    private String developer;
    private String task_name;
    private int task_number;
    private String description;
    private String task_status;
    private int duration;
    private String task_ID;
    private static int total_hours = 0;
    private int number_of_tasks;

    //Default constructors for each instance variable 
    public Task() {
        this.developer = "";
        this.task_name = "";
        this.task_number = 0;
        this.description = "";
        this.duration = 0;
        this.task_ID = "";
        this.task_status = "";
        this.number_of_tasks = 0;
    }

    //Accessor methods/ getters for each instance variable
    public String get_developer_name() {
        return this.developer;
    }

    public String get_task_name() {
        return this.task_name;
    }

    public String get_description() {
        return this.description;
    }

    public int get_duration() {
        return this.duration;
    }

    public String get_task_ID() {
        return this.task_ID;
    }

    public int get_number_of_tasks() {
        return this.number_of_tasks;
    }

    public String get_task_status() {
        return this.task_status;
    }

    //Mutator methods/setters for each instance variable
    public void setdeveloper_name(String developer) {
        this.developer = developer;
    }

    public void settask_name(String task_name) {
        this.task_name = task_name;
    }

    public void settask_number(int task_number) {
        this.task_number = task_number;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public void setduration(int duration) {
        this.duration = duration;
        total_hours += duration;
    }

    public void settask_ID(String task_ID) {
        this.task_ID = task_ID;
    }

    public void setnumber_of_tasks(int number_of_tasks) {
        this.number_of_tasks = number_of_tasks;
    }

    public void set_task_status(String task_status) {
        this.task_status = task_status;
    }

    //Create method to check task description
    public boolean check_description() {
        if (description.length() <= 50) {
            return true;
        } else {

            return false;
        }
    }

    //Method to input task details
    // happens in the main
    public void enter_task_details() {
        String task_name = JOptionPane.showInputDialog("Enter the task name: ");
        int task_number = Integer.parseInt(JOptionPane.showInputDialog("Enter the task number: "));

        String developer_name = JOptionPane.showInputDialog("Enter the developer's name: ");

        String task_ID = generate_task_ID(task_name, task_number, developer_name);

        JOptionPane.showMessageDialog(null, "Generate Task ID: " + task_ID);

    }

    //A Method to autogenerate task ID
    public static String generate_task_ID(String task_name, int task_number, String developer_name) {
        String first_two_letters = task_name.substring(0, Math.min(task_name.length(), 2)).toUpperCase();
        String last_three_letters = developer_name.substring(Math.max(0, developer_name.length() - 3)).toUpperCase();

        return first_two_letters + ":" + task_number + ":" + last_three_letters;
    }

    //Method to print task details
    public String print_task_details() {
        return "Task ID: " + task_ID
                + "\nTask Name: " + task_name
                + "\nTask description: " + description
                + "\nDeveloper: " + developer
                + "\nTask Status: " + task_status
                + "\nTask duration (hours): " + duration;
    }

    //Method for return total hours
    public static int return_total_hours() {
        return total_hours;
    }

    //Method to check task description
    public static void check_task_description() {
        String continue_input;

        do {
            String task_description = JOptionPane.showInputDialog(null, " Enter task description: ");

            if (task_description.length() < 50) {
                JOptionPane.showMessageDialog(null, "Task description successfully captured");
                continue;
            } else {
                JOptionPane.showInputDialog(null, "Please enter a task description of 50 characters or less. ");
            }

            
        } while (true);

    }
}
