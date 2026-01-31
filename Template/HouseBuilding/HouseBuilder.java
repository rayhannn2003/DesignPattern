package Template.HouseBuilding;

public abstract class HouseBuilder {
    
    public final void buildHouse() {
        layFoundation();
        buildWalls();
        installRoof();
        if (needsExtraFeatures()) {
            addExtraFeatures();
        }
        paint();
        furnish();
    }
    
    protected void layFoundation() {
        System.out.println("Laying concrete foundation");
    }
    
    protected abstract void buildWalls();
    
    protected abstract void installRoof();
    
    protected abstract void paint();
    
    protected abstract void furnish();
    
    protected boolean needsExtraFeatures() {
        return false;
    }
    
    protected void addExtraFeatures() {
        System.out.println("Adding extra features");
    }
}
