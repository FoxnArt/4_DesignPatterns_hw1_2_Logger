import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int listSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int upperBound = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> list = generateList(listSize, upperBound);
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterThreshold = scanner.nextInt();
        Filter filter = new Filter(filterThreshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");

        scanner.close();
    }

    public static List<Integer> generateList(int listSize, int upperBound) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            result.add(random.nextInt(upperBound + 1));
        }
        return result;
    }
}