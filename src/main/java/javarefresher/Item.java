package javarefresher;

public class Item {
    private String itemId;
    private long item_code;
    private String item_description;

    public Item(String itemId, long item_code, String item_description) {
        this.itemId = itemId;
        this.item_code = item_code;
        this.item_description = item_description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", item_code=" + item_code +
                ", item_description='" + item_description + '\'' +
                '}';
    }
}
