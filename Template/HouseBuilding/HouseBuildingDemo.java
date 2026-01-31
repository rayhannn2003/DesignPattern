package Template.HouseBuilding;

public class HouseBuildingDemo {
    public static void main(String[] args) {
        System.out.println("=== House Building Template Pattern ===\n");
        
        System.out.println("--- Building Wooden House ---");
        HouseBuilder woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();
        
        System.out.println("\n--- Building Stone House ---");
        HouseBuilder stoneHouse = new StoneHouse();
        stoneHouse.buildHouse();
        
        System.out.println("\n--- Building Glass House ---");
        HouseBuilder glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
