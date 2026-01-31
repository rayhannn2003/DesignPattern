package Template.HouseBuilding;

public class WoodenHouse extends HouseBuilder {
    
    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls with timber");
    }
    
    @Override
    protected void installRoof() {
        System.out.println("Installing wooden shingle roof");
    }
    
    @Override
    protected void paint() {
        System.out.println("Painting with wood stain");
    }
    
    @Override
    protected void furnish() {
        System.out.println("Adding rustic wooden furniture");
    }
}
