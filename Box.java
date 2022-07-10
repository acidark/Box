import java.util.ArrayList;
public class Box implements Packable {
    private double maxCap;
    private ArrayList<Packable> itemsInBox;
    public Box(double maxCap){
        this.maxCap = maxCap;
        this.itemsInBox = new ArrayList<>();
    }
    public void add(Packable item){
        if(item.weight()+this.weight() <= this.maxCap){
            this.itemsInBox.add(item);
        }
        return;
    }
    public String toString(){
        return "Box: "+this.itemsInBox.size()+" items, "+"total weight "+this.weight()+" kg";
    }
    public double weight(){
        double sumOfWeight=0;
        for(Packable item : itemsInBox){
            sumOfWeight+=item.weight();
        }
        return sumOfWeight;
    }
}
