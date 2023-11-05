package Plane_Class;

public enum PlaneType {
    AIRBUS380(10, 50),
    BOEING747(20, 100),
    BOEING787DREAMLINER(30 ,150),
    BOEING777(40 ,200);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
