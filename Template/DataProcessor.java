package Template;

abstract class DataProcessor {

    // Template method
    public final void process() {
        readData();
        processData();
        saveData();
    }

    protected void readData() {
        System.out.println("Reading common data...");
    }

    protected abstract void processData();

    protected void saveData() {
        System.out.println("Saving processed data...");
    }
}
