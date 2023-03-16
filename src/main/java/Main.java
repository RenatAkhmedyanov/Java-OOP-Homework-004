import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<Task> tasksList = new ArrayList<>();
        Task task = new Task();
//        Task task = new Task(1,"Купить продукты", "Средний", "Петрова Светлана Николаевна", "20.03.23");
//        tasksList.add(new Task(1, "Вынести мусор", "Высокий", "Иванов Иван Иванович", "16.03.23"));
//        tasksList.add(task);

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
                if (input.equals("1")){
                    for (Task t: tasksList) {
                        t.print();
                    }
                } else if (input.equals("2")){
                    for (Task t: tasksList) {
                        if (t.getPriority().equals("Высокий")){
                            t.print();
                        }
                    }
                } else if (input.equals("3")) {
                    for (Task t : tasksList) {
                        if (t.getPriority().equals("Средний")) {
                            t.print();
                        }
                    }
                } else if (input.equals("4")) {
                    for (Task t : tasksList) {
                        if (t.getPriority().equals("Низкий")) {
                            t.print();
                        }
                    }
                }
                System.out.println("Enter для продолжения...");
                input = scn.nextLine();

            } else if (input.equals("2")){
                task.addNewTask(tasksList);

            } else if (input.equals("3")){
                taskHelper.writeToFile(tasksList);
            }
        }

//        File file = new File("tasks.txt");
//        FileReader fr = new FileReader(file);
//        BufferedReader reader = new BufferedReader(fr);
//        String line = reader.readLine();
//        while ((line = reader.readLine()) != null) {
//            tasksList.add(line);
//        }





//        try {
//            File file = new File("tasks.txt");
//            //создаем объект FileReader для объекта File
//            FileReader fr = new FileReader(file);
//            //создаем BufferedReader с существующего FileReader для построчного считывания
//            BufferedReader reader = new BufferedReader(fr);
//            // считаем сначала первую строку
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }








//        Date date = new Date();
//        System.out.println(date);
//
//
//        ArrayList<Integer> id = new ArrayList<>();
//        ArrayList<String> dateTime = new ArrayList<>();
//        ArrayList<String> priority = new ArrayList<>();
//        ArrayList<String> deadline = new ArrayList<>();
//        ArrayList<String> fio = new ArrayList<>();

    }
}
