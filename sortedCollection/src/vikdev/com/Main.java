package vikdev.com;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	StockItem stockItem = new StockItem("Bread",35,100);
	stockList.addStack(stockItem);

	stockItem = new StockItem("Cheese",90,250);
    stockList.addStack(stockItem);

        stockItem = new StockItem("Noodle",20,150);
        stockList.addStack(stockItem);

        stockItem = new StockItem("Pasta",25,100);
        stockList.addStack(stockItem);

        stockItem = new StockItem("Tomato",30,50);
        stockList.addStack(stockItem);

        stockItem = new StockItem("Butter",700,100);
        stockList.addStack(stockItem);

        stockItem = new StockItem("Cake",50,170);
        stockList.addStack(stockItem);
        stockItem = new StockItem("Cake",60,10);
        stockList.addStack(stockItem);

        System.out.println(stockList);

        for (String s : stockList.items().keySet()){
            System.out.println(s);
        }

        Basket vikas = new Basket("Vikas's Basket");
        sellItem(vikas,"Cake",150);
        System.out.println(vikas);

        sellItem(vikas,"Cake",40);
        System.out.println(vikas);


        sellItem(vikas,"Bread",50);
        System.out.println(vikas);

        Basket ansh = new Basket("Ansh's Basket");
        sellItem(ansh,"Tomato",10);
        sellItem(ansh,"Bread",10);


        System.out.println(ansh);
        System.out.println(stockList);

        for (Map.Entry<String,Double> price : stockList.prices().entrySet()){
            System.out.println(price.getKey() + " cost's : "+price.getValue());
        }
    }



    public static int sellItem(Basket basket,String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("Sorry we don't sell "+item);
            return 0;
        }
        if(stockList.sellStock(item,quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }


}
