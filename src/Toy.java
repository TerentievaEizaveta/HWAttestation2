public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double probability;

    public Toy(String name,int quantity, double probability) {
        this.name = name;
        this.probability = probability;
        this.quantity=quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name +", quantity: "+ quantity+ ", probability: " + probability;
        }
    }

