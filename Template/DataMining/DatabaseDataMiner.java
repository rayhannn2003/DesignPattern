package Template.DataMining;

public class DatabaseDataMiner extends DataMiner {
    
    @Override
    protected void openDataSource() {
        System.out.println("Opening database connection");
    }
    
    @Override
    protected void extractData() {
        System.out.println("Executing SQL query");
    }
    
    @Override
    protected void parseData() {
        System.out.println("Parsing result set");
    }
    
    @Override
    protected void closeDataSource() {
        System.out.println("Closing database connection");
    }
}
