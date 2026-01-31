package Template.HouseBuilding;

public class GlassHouse extends HouseBuilder {
    
    @Override
    protected void buildWalls() {
        System.out.println("Installing glass panel walls with steel frame");
    }
    
    @Override
    protected void installRoof() {
        System.out.println("Installing transparent glass roof");
    }
    
    @Override
    protected void paint() {
        System.out.println("No painting needed - transparent design");
    }
    
    @Override
    protected void furnish() {
        System.out.println("Adding modern minimalist furniture");
    }
    
    @Override
    protected boolean needsExtraFeatures() {
        return true;
    }
    
    @Override
    protected void addExtraFeatures() {
        System.out.println("Installing smart home automation");
        System.out.println("Adding climate control system");
    }
}
