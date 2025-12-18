public class Magazine extends Item{
    private int capacity;
    private String caliber;
    private String type;

    public Magazine(String name, String type, int quantity,int capacity, String caliber){
        super(name, quantity);
        this.capacity = capacity;
        this.caliber = caliber;
        this.type = type;
    }
    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
    public String getCaliber() {
        return caliber;
    }

    // overriding o metodo toString para exibir informacoes do item
    // isso acontece em runtime(depois que o programa ja foi compilado e está rodando na JVM)
    @Override
    public String toString(){
        return "| Name: " + getName() + " | Quantity: " + getQuantity() +
                "| Type: " + type + " | Capacity: " + capacity + " | Caliber: " + caliber + " |";
    }
}
