public class TaskHelper implements Choosable {
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
                "4 - Прочитать данные из файла\n" +
                "q - Выход из программы");

    }

    @Override
    public void choosePriority() {
        System.out.println("Выберите необходимый пункт меню: \n" +
                "1 - Вывести весь список задач\n" +
                "2 - Вывести задачи с высоким приоритетом\n" +
                "3 - Вывести задачи со средним приоритетом\n" +
                "4 - Вывести задачи с низким приоритетом\n" +
                "q - Выход из программы");
    }
}

