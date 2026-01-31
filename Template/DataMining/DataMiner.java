package Template.DataMining;

public abstract class DataMiner {
    
    public final void mineData() {
        openDataSource();
        extractData();
        parseData();
        analyzeData();
        sendReport();
        closeDataSource();
    }
    
    protected abstract void openDataSource();
    
    protected abstract void extractData();
    
    protected abstract void parseData();
    
    protected void analyzeData() {
        System.out.println("Analyzing data patterns");
    }
    
    protected void sendReport() {
        System.out.println("Sending analysis report");
    }
    
    protected abstract void closeDataSource();
}
