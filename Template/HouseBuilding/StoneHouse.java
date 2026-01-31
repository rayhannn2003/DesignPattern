package Template.HouseBuilding;

public class StoneHouse extends HouseBuilder {
    
    @Override
    protected void buildWalls() {
        System.out.println("Building stone/brick walls");
    }
    
    @Override
    protected void installRoof() {
        System.out.println("Installing tile roof");
    }
    
    @Override
    protected void paint() {
        System.out.println("Painting exterior with weather-resistant paint");
    }
    
    @Override
    protected void furnish() {
        System.out.println("Adding classic furniture");
    }
}
