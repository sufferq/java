import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;
    private int nextId;

    // Конструктор
    public ToDoList() {
        this.tasks = new ArrayList<>();
        this.nextId = 1; // начинаем с ID = 1
    }

    // Добавляет новую задачу
    public void addTask(String description) {
        Task newTask = new Task(nextId, description);
        tasks.add(newTask);
        nextId++;
        System.out.println("Задача добавлена: " + description);
    }

    // Отмечает задачу как выполненную
    public void markAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Задача [" + id + "] отмечена как выполненная");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена");
    }

    // Удаляет задачу по ID
    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                String description = tasks.get(i).getDescription();
                tasks.remove(i);
                System.out.println("Задача [" + id + "] \"" + description + "\" удалена");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена");
    }

    // Выводит все задачи на экран
    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }

        System.out.println("\n=== ВАШИ ЗАДАЧИ ===");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("===================\n");
    }
}