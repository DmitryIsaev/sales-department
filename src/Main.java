public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {100, 200, 50, 10});

        long max = salesManager.max();
        System.out.println("Максимальный размер продаж: " + max);

        int min = salesManager.min();
        System.out.println("Минимальный размер продаж: " + min);

        int croppedAverageValue = salesManager.croppedAverageValue();
        System.out.println("Среднее количество продаж: " + croppedAverageValue);
    }
}
