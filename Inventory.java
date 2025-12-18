import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    // constructors servem para criar novos objetos da classe
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    // --- Oveloading ---
    // basicamente, overloading é quando voce cria varios metodos com o mesmo nome, mas com parametros diferentes
    // isso permite que voce chame o metodo de diferentes maneiras, dependendo dos parametros que voce passa
    // overloading diferentee de Oveerriding acontece em compile time (antes da execucao do programa)
    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, type, quantity));
    }

    // outro exemplo de overloading, agora com a classe Armor
    public void addItem(String name, String type, int quantity, int defense, double weight){
        items.add(new Armor(name, type, quantity, defense, weight));
    }

    public void displayInventory(){
        for (Item item : items){
            System.out.println(item.toString());
        }
    }
}
