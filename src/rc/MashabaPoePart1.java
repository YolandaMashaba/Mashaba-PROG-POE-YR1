package rc;

import javax.swing.*;

/**
 *
 * @author Mashaba Yolanda Nkoka [ST10458688]
 */
public class MashabaPoePart1 {

    //Creating the login class object and the task class object 
    static Login obj_login = new Login();
    static Task obj_task = new Task();
    static boolean registration = false;

    public static void main(String[] args) {

        boolean username = false;
        boolean password = false;

        while (!registration) {
            //Get input from the user
            get_login_input();

            if (obj_login.check_username()) {
                JOptionPane.showMessageDialog(null, "Username successfully captured");
                username = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length. ");
            }

            if (obj_login.check_password_complexity()) {
                JOptionPane.showMessageDialog(null, "Password successfully captured");
                password = true;
            } else {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character. ");
            }

            if (username && password) {
                JOptionPane.showMessageDialog(null, "Username and password captured, the user has been registered successfully.");
                registration = true;
                //Calling all of my methods from login class
                return_login_status();
            } else {
                JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
            }
        }

        //Calling methods from task class
        option();

    }

    //Method to prompt the user for input
    public static void get_login_input() {
        obj_login.setfull_name(JOptionPane.showInputDialog("Enter full name: "));
        obj_login.setlast_name(JOptionPane.showInputDialog("Enter last name: "));
        obj_login.setusername(JOptionPane.showInputDialog("Enter username: "));
        obj_login.setpassword(JOptionPane.showInputDialog("Enter password: "));
    }

    public static void return_login_status() {
        String full_name = obj_login.get_full_name();
        String last_name = obj_login.get_last_name();
        JOptionPane.showMessageDialog(null, "Welcome " + full_name + " " + last_name + " it is great to see you again ");
        JOptionPane.showMessageDialog(null, "Welcome to Easy Kanban ");
    }

    //Method for user to choose an option
    public static void option() {
        int Option;
        do {
            Option = Integer.parseInt(JOptionPane.showInputDialog(null, " Enter option \n\nOption) 1 Add tasks, \nOption) 2 Show report \nOption) 3 Quit: "));

            switch (Option) {
                case 1:
                    enter_task_details();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quit");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    break;
            }
        } while (Option != 3 && Option != 2 && Option != 1);
    }

    public static void enter_task_details() {
        int number_of_tasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks: "));

        for (int i = 1; number_of_tasks >= i; i++) {
            String task_name = JOptionPane.showInputDialog("Enter the task name for task " + i + ": ");
            obj_task.settask_name(task_name);

            String task_description = JOptionPane.showInputDialog("Enter the task description: ");
            obj_task.setdescription(task_description);
            boolean check_desc = obj_task.check_description();
            while (check_desc != true) {
                task_description = JOptionPane.showInputDialog("Enter the task description: ");
                obj_task.setdescription(task_description);
                check_desc = obj_task.check_description();
            }

            String developer_name = JOptionPane.showInputDialog("Enter the developer's name: ");
            obj_task.setdeveloper_name(developer_name);

            String task_ID = obj_task.generate_task_ID(task_name, i, developer_name);
            obj_task.settask_ID(task_ID);

            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration (hours): "));
            obj_task.setduration(duration);

            String[] taskStatusOptions = {"To Do", "Doing", "Done"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task status", "Task Status", JOptionPane.QUESTION_MESSAGE, null, taskStatusOptions, taskStatusOptions[0]);
            obj_task.set_task_status(taskStatus);

            String task_details = obj_task.print_task_details();
            JOptionPane.showMessageDialog(null, task_details);
        }
        int total_hours = obj_task.return_total_hours();
        JOptionPane.showMessageDialog(null, "Total hours: " + total_hours);

    }

}
