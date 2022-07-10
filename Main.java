
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Book book1= new Book("tolkien", "hobbit", 19);
        Book book2 = new Book("matrix", "waner brah", 88.1);
        CD cd2 = new CD("paavaroti", "luciano", 1777);
        CD cd1 = new CD("michael jackson", "blackand whiite", 1988);
        System.out.println(book1);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(book2);

        Box newBox = new Box(50);
        newBox.add(book1);
        newBox.add(cd1);
        newBox.add(cd2);
        Box newBox2 = new Box(15);
        newBox2.add(newBox);
        System.out.println(newBox);
        System.out.println(newBox2);
    }

}
