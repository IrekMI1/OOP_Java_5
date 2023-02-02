package Model.RealNumber;

/**
 * Умножение, реализует интерфейс Математическая операция
 */
public class Multiplication implements ICalc {
    /**
     * Статический метод, возвращает результат умножения
     * @param args массив арументов
     * @return возвращает результат последовательных умножний чисел в массиве
     * @param <T> обобщение типа аргументов метода
     */
    public static <T extends Number> double result(T... args) {
        double res = args[0].doubleValue();
        for (int i = 1; i < args.length; i++) {
            res *= args[i].doubleValue();
        }
        return res;
    }
}
