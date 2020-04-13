package vikdev.com;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;
    public Basket(String name){
        this.name = name;
        this.list = new TreeMap<>();
    }
    public int addToBasket(StockItem item, int quantity){
        if ((item != null) && (quantity > 0)){
            int inBasket = list.getOrDefault(item,0);
            list.put(item,inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem,Integer> Items(){
        return Collections.unmodifiableMap(list);
    }

    public String toString(){
        String s = "\nShopping Basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items ")+"\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem,Integer> all : list.entrySet()){
            s = s + all.getKey() + ". " +all.getValue() + " purchased\n";
            totalCost += all.getKey().getPrice() * all.getValue();
        }
        return s +"Total cost " + totalCost;
    }
}
