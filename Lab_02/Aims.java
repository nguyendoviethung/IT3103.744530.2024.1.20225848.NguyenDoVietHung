public class Aims {
    public static void main(String[] args) {

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("VeNom", "One Piece", "Roger Allers", 87, 19.95f);
            anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("King Kong", "Doraemon", "George Lucas", 87, 24.95f);
            anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Your Name", "Animation", 18.99f);
            anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Nguyen Do Viet Hung 20225848 Total Cost is: ");

        System.out.println(anOrder.totalCost());
            anOrder.removeDigitalVideoDisc(dvd1);
            anOrder.printCart();

    }
}
