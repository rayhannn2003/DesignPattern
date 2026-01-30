package Strategy.Sorting;

class SortContext {
    private SortStrategy strategy;

    SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    void performSort(int[] arr) {
        strategy.sort(arr);
    }
}

