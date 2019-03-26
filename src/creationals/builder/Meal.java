package creationals.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chamikara
 */
public class Meal {
    
    private List<Item> items = new ArrayList<>();
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public float getCost(){
        return (float) items.stream().mapToDouble(Item::price).sum();
    }
    
    public void showItems(){
        items.forEach((item) -> {
            System.out.print("Item : "+ item.name()+"\t");
            System.out.print("| Packing : "+ item.packing().pack()+"\t");
            System.out.println("| Price : "+ item.price());
        });
    }
    
}
