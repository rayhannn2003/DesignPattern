package Template.DataMining;

public class ExcelDataMiner extends DataMiner {
    
    @Override
    protected void openDataSource() {
        System.out.println("Opening Excel file");
    }
    
    @Override
    protected void extractData() {
        System.out.println("Reading Excel sheets");
    }
    
    @Override
    protected void parseData() {
        System.out.println("Parsing spreadsheet cells");
    }
    
    @Override
    protected void closeDataSource() {
        System.out.println("Closing Excel file");
    }
}
