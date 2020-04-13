package vikdev.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;

public class StockList {
    private final Map<String,StockItem> list;

    public StockList(){
        this.list = new LinkedHashMap<>();
    }
    public int addStack(StockItem item){
        if (item != null){
            StockItem inStock = list.getOrDefault(item.getName(),item);
            if (inStock != item){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(),item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item,int quantity){
        StockItem inStock = list.getOrDefault(item,null);
        if ((inStock != null) && (inStock.getQuantityStock() >= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String,Double> prices(){
         Map<String,Double> price = new LinkedHashMap<>();
        for (Map.Entry<String,StockItem> item : list.entrySet()){
            price.put(item.getKey(),item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(price);
    }

    public Map<String,StockItem> items(){
        return Collections.unmodifiableMap(list);
    }

    public String toString(){
        String s = "\n Stock item\n";
        double total = 0.0;

        for (Map.Entry<String,StockItem> all : list.entrySet()){
            StockItem stockItem = all.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();
            s = s + stockItem + ". There are "+stockItem.getQuantityStock()+" in stock. Value of items : ";
            s = s + String.format("%.2f",itemValue) + "\n";
            total += itemValue;
        }
        return s + "Total stock value "+total;

    }
}
