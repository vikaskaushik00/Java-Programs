package vikdev.com;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        if (quantityStock >= 0) {
            this.quantityStock = quantityStock;
        } else {
            this.quantityStock = 0;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String names = ((StockItem) obj).getName();
        return this.name.equals(names);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering compareTo");

        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    public String toString(){
        return this.name +" price : "+this.price;
    }
}