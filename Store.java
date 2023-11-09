package ex05_tau_tambabaav;
import java.util.*;
public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
        this.name = name;
        earnings = 0;
        itemList = new ArrayList<>();
        storeList.add(this);
    }

    public String getName(){
        return name;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public void sellItem(int index){
        if (itemList.size() >= index) {
            Item itemSale = itemList.remove(index);
            earnings += itemSale.getCost();
            System.out.println("You have bought " + itemSale.getName());
        }
      
        else { System.out.println("Purchase invalid. There are only " + itemList.size() + " items in the store"); }
    }
    
    public void sellItem(String name){
        for (Item item: itemList) {
            if (item.getName().equals(name)) {
                earnings += item.getCost();
                itemList.remove(item);
                System.out.println("You have bought " + item.getName() + ".");
            }
            
            else { System.out.println(name + " is unavailable at this store."); }
        }
    }
    
    public void sellItem(Item i){
        if (itemList.contains(i)) {
            earnings += i.getCost();
            itemList.remove(i);
            System.out.println("You have bought " + i.getName() + ".");
        }
        
        else { System.out.println(i.getName() + " is unavailable at this store."); }
    }
    
    public void addItem(Item i){
        itemList.add(i);
    }
    
    public void filterType(String type){
        for (Item item: itemList) {
            if (item.getType().equals(item.getType())) {
                System.out.println("Item: " + item.getName() + "\t  Type: " + item.getType());
            }
        }
    }
    
    public void filterCheap(double maxCost){
        for (Item item: itemList) {
            if (maxCost >= item.getCost()) {
                System.out.println("Item: " + item.getName() + "\t  Cost: " + item.getCost());
            }
        }
    }
    
    public void filterExpensive(double minCost){
        for (Item item: itemList) {
            if (minCost <= item.getCost()) {
                System.out.println("Item: " + item.getName() + "\t  Cost: " + item.getCost());
            }
        }
    }
    
    public static void printStats(){
        for (Store store: storeList) {
            System.out.println("Store: " + store.getName() + "\t  Earnings: " + store.getEarnings());
        }
    }
}