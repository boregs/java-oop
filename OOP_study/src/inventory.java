import java.util.ArrayList;

public class inventory {

    private ArrayList<Item> items;  //diferente de um array comum, esse pode guardar objetos

    public inventory(){
        items = new ArrayList<>();
    }

    //metodo para adicionar itens no ArrayList items || adicionando os itens no inventario
    public void additem(Item item){
        items.add(item);
    }

    public void displayInventory(){
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
        }
    }
}


