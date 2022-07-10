public class Book implements Packable {
    private String author;
    private String name;
    private double weight;
    //private double sumOfWeight;
    public Book(String author,String name,double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return this.author+": "+this.name;//+"weight:"+this.weight;
    }
    public double weight(){
        //this.weight+=sumOfWeight;
        return this.weight;
    }

}
