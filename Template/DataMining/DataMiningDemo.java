package Template.DataMining;

public class DataMiningDemo {
    public static void main(String[] args) {
        System.out.println("=== Data Mining Template Pattern ===\n");
        
        System.out.println("--- Mining CSV Data ---");
        DataMiner csvMiner = new CSVDataMiner();
        csvMiner.mineData();
        
        System.out.println("\n--- Mining Database Data ---");
        DataMiner dbMiner = new DatabaseDataMiner();
        dbMiner.mineData();
        
        System.out.println("\n--- Mining Excel Data ---");
        DataMiner excelMiner = new ExcelDataMiner();
        excelMiner.mineData();
    }
}
