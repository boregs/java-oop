public class Fruit extends Item {
    private String type;

    public Fruit(String name, String type, int quantity) {
        super(name, quantity); // assim chamamos os atrubutos da classe pai para o construtor da classe filha
        this.type = type;
    }

    public String getType(){
        return type;
    }

    // overriding o metodo toString para exibir informacoes do item
    // isso acontece em runtime(depois que o programa ja foi compilado e está rodando na JVM)
    @Override
    public String toString(){
        return "| Name: " + getName() + " | Quantity: " + getQuantity() + " | Type: " + type + " |";
    }
}
