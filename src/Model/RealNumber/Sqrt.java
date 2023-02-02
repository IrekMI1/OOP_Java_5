package Model.RealNumber;

/**
 * Нахождение квадратного корня
 */
public class Sqrt implements ICalc {
    /**
     * Статический метод, возвращает результат квадратного корня
     * @param args массив арументов
     * @return возвращает результат квадратного корня первого числа массива, остальные числа игнорируются
     * @param <T> обобщение типа аргументов метода
     */
    public static <T extends Number> double result(T... args) {
        return Math.sqrt(args[0].doubleValue());
    }
}
