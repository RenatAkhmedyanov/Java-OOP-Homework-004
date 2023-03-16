import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskHelper implements Choosable, Writing {
    public TaskHelper() {
    }

    @Override
    public void chooseMenu() {
        System.out.println("=".repeat(21) + "\n" +
                           "| Планировщик задач | \n" +
                           "=".repeat(21));
        System.out.println("Выберите необходимый пункт меню: \n" +
                           "1 - Вывести список задач\n" +
                           "2 - Добавить новую задачу\n" +
                           "3 - Записать данные в файл\n" +
                           "q - Выход из программы");

    }

    public void choosePriority(){
        System.out.println("Выберите необходимый пункт меню: \n" +
                           "1 - Вывести весь список задач\n" +
                           "2 - Вывести задачи с высоким приоритетом\n" +
                           "3 - Вывести задачи со средним приоритетом\n" +
                           "4 - Вывести задачи с низким приоритетом\n" +
                           "q - Выход из программы");
    }

    @Override
    public void writeToFile(ArrayList<Task> tasksList) throws IOException {
        FileWriter writer = new FileWriter("tasks.txt", false);
        for(Task t  : tasksList) {
            writer.write("-".repeat(10) + "\n" +
                    "ID: " + t.getId() +"\n" +
                    "Дата создания: " + t.getDate() +"\n" +
                    "Задача: " + t.getName() +"\n" +
                    "Приоритет: " + t.getPriority() + "\n" +
                    "ФИО автора задачи: " + t.getAuthorFIO() + "\n" +
                    "Дедлайн: " + t.getDeadline() + "\n");
        }
        writer.close();
    }
}
