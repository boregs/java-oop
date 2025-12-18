public class Weapon extends Item{
    private int damage;
    private String type;
    private int magazineCapacity;

    public Weapon(String name, String type, int quantity,int damage, int magazineCapacity){
        super(name, quantity);
        this.damage = damage;
        this.type = type;
        this.magazineCapacity = magazineCapacity;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }

    public int getMagazineCapacity(){
        return magazineCapacity;
    }

    // overriding o metodo toString para exibir informacoes do item
    // isso acontece em runtime(depois que o programa ja foi compilado e está rodando na JVM)
    @Override
    public String toString(){
        return "| Name: " + getName() + " | Quantity: " + getQuantity() + " | Type: " + type + " | Damage: " + damage + " |"
                + " Magazine Capacity: " + magazineCapacity + " |";
    }
}
