package AnimalRescue;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void producer(){
        System.out.println("Producing..");}
    public void distribute(){
        System.out.println("Distributing..");
    }


}

