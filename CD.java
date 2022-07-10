public class CD extends Book implements Packable{
    private int year;
    public CD(String author,String name,int year){
        super(author, name, 0.1);
        this.year=year;
    }
    public String toString(){
        return super.toString()+" ("+this.year+")";
    }
    public double weight(){
        return super.weight();
    }
}
