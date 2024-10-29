public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered;
    private int qtyOrdered;


    public Cart() {
        itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        qtyOrdered = 0;
    }


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Nguyen Do Viet Hung -20225848 The disc \"" + disc.getTitle() + "\" has been added.");
            if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
                System.out.println("Nguyen Do Viet Hung -20225848 The cart is almost full!");
            }
        } else {
            System.out.println("Nguyen Do Viet Hung -20225848 The cart is full! Cannot add more discs.");
        }
    }

    // Phương thức xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {

                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Nguyen Do Viet Hung -20225848 The disc \"" + disc.getTitle() + "\" has been removed.");
                return; // Thoát khỏi phương thức
            }
        }
        System.out.println("Nguyen Do Viet Hung -20225848 The disc is not in the cart.");
    }

    // Phương thức tính tổng giá
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }


    public void printCart() {
        System.out.println("Nguyen Do Viet Hung -20225848 Cart contains:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + itemsOrdered[i].getTitle());
        }
    }
}
