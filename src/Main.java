public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {100, 200, 50, 10});

        int max = salesManager.max();
        System.out.println("Максимальный размер продаж: " + max);
    }
}
