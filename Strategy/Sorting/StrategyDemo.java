package Strategy.Sorting;

public class StrategyDemo {
    public static void main(String[] args) {

        int[] data = {5, 3, 8, 1};

        SortContext context = new SortContext(new BubbleSort());
        context.performSort(data);

        context.setStrategy(new QuickSort());
        context.performSort(data);
    }
}
