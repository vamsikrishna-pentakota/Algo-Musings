package javarefresher;

public class StackAndHeapDemo {
    public static void main(String[] args) {
        int disc = 10;
        Item item1 = new Item("001" , 10000000000L, "double sided tape");
        Item item2 = new Item("001" , 10000000000L, "double sided tape");

        System.out.println(item1.hashCode());
        System.out.println(item2.hashCode());
    }
}
