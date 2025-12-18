public abstract class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }


    // Getter methods deixam voce acessar valores privados fora da classe, sem permitir que voce modifique esses valores diretamente.
    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

}
