import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.data();
        logger.log(" Запускаем программу!");

        logger.data();
        logger.log(" Введите размер списка: ");
        int sizeList = scanner.nextInt();
        logger.data();
        logger.log(" Введите верхнюю границу для значений: ");
        int maxNamber = scanner.nextInt();
        // list
        Random random = new Random();
        List<Integer> startResult = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            startResult.add(random.nextInt(maxNamber));
        }
        logger.data();
        logger.log(" Создаём и наполняем список\nВот случайный список:  " + startResult);

        logger.data();
        logger.log("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        logger.data();
        logger.log("Запускаем фильтрацию ");
        Filter filter = new Filter(treshold);
        System.out.println(filter.filterOut(startResult));

        logger.data();
        logger.log("Завершаем программу!");
    }
}