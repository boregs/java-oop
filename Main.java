public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        System.out.println("------ Inventory ------");
        //Item item1 = new Item("Sword", 1);
        //Item item2 = new Item("Health Potion", 5);
        Fruit apple = new Fruit("Apple", "Food", 10);
        Fruit mango = new Fruit("Mango", "Food", 2);
        Weapon glock19 = new Weapon("Glock-19", "Firearm",1,15, 15);
        Magazine magGlock19 = new Magazine("Glock-19 Magazine", "Item", 3,15,"9mm");
        inventory.addItem(apple);
        inventory.addItem(mango);
        inventory.addItem(glock19);
        inventory.addItem(magGlock19);

        // Usando o metodo que fizemos o Overload para adicionar um item diretamente
        inventory.addItem("Banana", 7, "Food");
        inventory.addItem("Steel Armor", "Heavy", 1, 50, 30.5);
        inventory.addItem("Kevlar Vest", "Light", 1, 25, 10.0);
        inventory.displayInventory();
    }
}