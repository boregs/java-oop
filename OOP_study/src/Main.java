public class Main {
    public static void main(String[] args){
        // criando um inventario | objeto inventario com o nome inventario, com o valor de um inventario vazio
        inventory inventory = new inventory();

        // criando os itens
        Item item1 = new Item("Sword", 1);
        Item item2 = new Item("Golden Apples", 4);

        //adicionando os itens no inventario
        inventory.additem(item1);
        inventory.additem(item2);
        inventory.displayInventory();
    }
}
