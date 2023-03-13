public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[] {100, 200, 50, 10});

        long max = salesManager.max();
        System.out.println("Максимальный размер продаж: " + max);
    }
}
