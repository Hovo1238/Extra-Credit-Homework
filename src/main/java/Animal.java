public class Animal {
    private String name;
    private boolean isPet;
    public Animal(String name, boolean isPet){
        setName(name);
        setPet(isPet);
    }
    public String getName() {
        return name;
    }
    public boolean isPet() {
        return isPet;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPet(boolean pet) {
        isPet = pet;
    }
}
