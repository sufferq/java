import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();

        while (true) {
            // Выводим меню
            System.out.println("\n=== МОЙ СПИСОК ЗАДАЧ ===");
            System.out.println("1. Показать все задачи");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Отметить задачу как выполненную");
            System.out.println("4. Удалить задачу");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // очистка буфера

                switch (choice) {
                    case 0:
                        // Выход из программы
                        System.out.println("Программа завершена. До свидания!");
                        scanner.close();
                        return;

                    case 1:
                        // Показать все задачи
                        todoList.printAllTasks();
                        break;

                    case 2:
                        // Добавить задачу
                        System.out.print("Введите описание задачи: ");
                        String description = scanner.nextLine();
                        if (!description.trim().isEmpty()) {
                            todoList.addTask(description);
                        } else {
                            System.out.println("Описание задачи не может быть пустым!");
                        }
                        break;

                    case 3:
                        // Отметить задачу как выполненную
                        System.out.print("Введите ID задачи для отметки: ");
                        int completeId = scanner.nextInt();
                        scanner.nextLine();
                        todoList.markAsCompleted(completeId);
                        break;

                    case 4:
                        // Удалить задачу
                        System.out.print("Введите ID задачи для удаления: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();
                        todoList.deleteTask(deleteId);
                        break;

                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }

                // Пауза для удобства чтения
                if (choice != 0) {
                    System.out.println("\nНажмите Enter, чтобы продолжить...");
                    scanner.nextLine();
                }

            } catch (Exception e) {
                System.out.println("Ошибка ввода! Пожалуйста, введите число.");
                scanner.nextLine(); // очистка буфера при ошибке
            }
        }
    }
}