package Template.DataMining;

public class CSVDataMiner extends DataMiner {
    
    @Override
    protected void openDataSource() {
        System.out.println("Opening CSV file");
    }
    
    @Override
    protected void extractData() {
        System.out.println("Reading CSV rows");
    }
    
    @Override
    protected void parseData() {
        System.out.println("Parsing comma-separated values");
    }
    
    @Override
    protected void closeDataSource() {
        System.out.println("Closing CSV file");
    }
}
