public class Armor extends Item{
    private int defense;
    private String type;
    private double weight;

    public Armor(String name, String type, int quantity, int defense, double weight){
        super(name, quantity);
        this.defense = defense;
        this.type = type;
        this.weight = weight;
    }

    public int getDefense(){
        return defense;
    }

    public String getType(){
        return type;
    }

    public double getWeight(){
        return weight;
    }


    // overriding o metodo toString para exibir informacoes do item
    // isso acontece em runtime(depois que o programa ja foi compilado e está rodando na JVM)
    @Override
    public String toString(){
        return "| Name: " + getName() + " | Quantity: " + getQuantity() +
                " | Type: " + type + " | Defense: " + defense + " | Weight: " + weight + " Kilos |";
    }
}
