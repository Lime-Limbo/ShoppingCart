public class ItemToPurchase{
    //private Fields
    private String name = "none";
    private int price = 0;
    private int quantity = 0;
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public Integer getPrice(){
        return this.price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public void printTotalCost() {
        int cost;
        cost = getPrice()*getQuantity();
        System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $" + cost );
    }

    
}