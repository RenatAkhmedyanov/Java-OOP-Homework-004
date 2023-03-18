import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Task implements Printable, Addable {
    private Integer id;
    private Date date;
    private String name;
    private String priority;
    private String authorFIO;
    private String deadline;

    public Task(Integer id, Date date, String name, String priority, String authorFIO, String deadline) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.priority = priority;
        this.authorFIO = authorFIO;
        this.deadline = deadline;
    }
    public Task(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getAuthorFIO() {
        return authorFIO;
    }

    public void setAuthorFIO(String authorFIO) {
        this.authorFIO = authorFIO;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println("-".repeat(10) + "\n" +
                           "ID: " + this.id +"\n" +
                           "Дата создания: " + this.date +"\n" +
                           "Задача: " + this.name +"\n" +
                           "Приоритет: " + this.priority + "\n" +
                           "ФИО автора задачи: " + this.authorFIO + "\n" +
                           "Дедлайн: " + this.deadline);
    }


    @Override
    public void addNewTask(ArrayList list) {
        System.out.println("Добавить новую запись?");
        System.out.println("q - Выход, Enter - продолжение");
        Scanner scn = new Scanner(System.in);
        while (true) {
            String input = scn.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                id = list.size() + 1;
                System.out.println("Введите задачу:");
                String inputName = scn.nextLine();
                System.out.println("Задайте приоритет (Низкий/Средний/Высокий): ");
                String inputPriority = scn.nextLine();
                System.out.println("Введите ФИО:");
                String inputFIO = scn.nextLine();
                System.out.println("Введите дедлайн:");
                String inputDeadline = scn.nextLine();
                System.out.println("q - Выход, Enter - продолжение");
                list.add(new Task(id, new Date(), inputName, inputPriority, inputFIO, inputDeadline));
            }
        }
    }


}
