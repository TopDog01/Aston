import java.io.*;
import java.util.Scanner;

/**
 * Пользовательское исключение для операций с файлами.
 */
class FileOperationException extends Exception {
    /**
     * Конструктор исключения.
     *
     * @param message Сообщение об ошибке.
     */
    public FileOperationException(String message) {
        super(message);
    }
}

/**
 * Пример работы с чтением и записью данных в файл.
 */
public class FileReadWriteExample {

    /**
     * Записывает данные в указанный файл.
     *
     * @param filename Имя файла, в который будут записаны данные.
     * @param data     Данные для записи.
     * @throws FileOperationException Если возникает ошибка при записи в файл.
     */
    public static void writeToFile(String filename, String data) throws FileOperationException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(data);
            writer.newLine(); // Добавляем новую строку после записи
        } catch (IOException e) {
            throw new FileOperationException("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    /**
     * Читает данные из указанного файла и выводит их на консоль.
     *
     * @param filename Имя файла, из которого будут считываться данные.
     * @throws FileOperationException Если возникает ошибка при чтении из файла.
     */
    public static void readFromFile(String filename) throws FileOperationException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new FileOperationException("Ошибка при чтении из файла: " + e.getMessage());
        }
    }

    /**
     * Главный метод программы. Позволяет пользователю вводить данные для записи в файл
     * и затем считывает и выводит содержимое файла.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "data.txt";

        // Запись данных в файл
        System.out.println("Введите данные для записи в файл (введите 'exit' для завершения):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                writeToFile(filename, input);
            } catch (FileOperationException e) {
                System.err.println(e.getMessage());
            }
        }

        // Чтение данных из файла
        System.out.println("\\nСодержимое файла:");
        try {
            readFromFile(filename);
        } catch (FileOperationException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}