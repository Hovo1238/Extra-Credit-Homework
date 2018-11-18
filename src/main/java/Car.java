public class Car {
    private String model;
    private int seatCount;
    public Car(String model, int seatCount){
        setModel(model);
        setSeatCount(seatCount);
    }
    public String getModel() {
        return model;
    }
    public int getSeatCount() {
        return seatCount;
    }

    public void setModel(String model) {
        // some validation here
        this.model = model;
    }
    public void setSeatCount(int seatCount) {
        // some validation here
        this.seatCount = seatCount;
    }
}
