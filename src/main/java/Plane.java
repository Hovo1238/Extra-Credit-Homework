public class Plane {
    private String model;
    private int capacity;
    public Plane(String model, int capacity){
        setCapacity(capacity);
        setModel(model);
    }
    public int getCapacity() {
        return capacity;
    }
    public String getModel() {
        return model;
    }
    public void setCapacity(int capacity) {
        // some validation
        this.capacity = capacity;
    }
    public void setModel(String model) {
        // some validation
        this.model = model;
    }
}
