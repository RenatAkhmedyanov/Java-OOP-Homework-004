import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<Task> tasksList = new ArrayList<>();
        Task task = new Task();
        tasksList.add(new Task(1, new Date(), "Купить продукты", "Средний", "Петрова Светлана Николаевна", "20.03.23"));
        tasksList.add(new Task(2, new Date(), "Вынести мусор", "Высокий", "Иванов Иван Иванович", "16.03.23"));
        tasksList.add(new Task(3, new Date(), "Убраться в квартире", "Низкий", "Петрова Светлана Николаевна", "22.03.23"));

        TaskHelper taskHelper = new TaskHelper();
        while (true){
            taskHelper.chooseMenu();
            Scanner scn = new Scanner(System.in);
            String input = scn.nextLine();
            if (input.equals("q")){
                break;
            } else if (input.equals("1")){
                taskHelper.choosePriority();
                input = scn.nextLine();
                switch (input) {
                    case "1":
                        for (Task t : tasksList) {
                            t.print();
                        }
                        break;
                    case "2":
                        for (Task t : tasksList) {
                            if (t.getPriority().equals("Высокий")) {
                                t.print();
                            }
                        }
                        break;
                    case "3":
                        for (Task t : tasksList) {
                            if (t.getPriority().equals("Средний")) {
                                t.print();
                            }
                        }
                        break;
                    case "4":
                        for (Task t : tasksList) {
                            if (t.getPriority().equals("Низкий")) {
                                t.print();
                            }
                        }
                        break;
                }
                System.out.println("Enter для продолжения...");
                input = scn.nextLine();

            } else if (input.equals("2")){
                task.addNewTask(tasksList);
            }
        }

    }
}
