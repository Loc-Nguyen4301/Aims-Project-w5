public class Aims {
    public static void main(String args[]) {

        Order anOrder1 = new Order();
        // add dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setCost(19.95f);
        dvd1.setLength(87);
        anOrder1.addDigitalVideoDisc(dvd1);

        // add dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction ");
        dvd2.setDirector("Geogre Lucas");
        dvd2.setCost(24.95f);
        dvd2.setLength(124);
        anOrder1.addDigitalVideoDisc(dvd2);

        // add dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setDirector("John Masker");
        dvd3.setCost(18.99f);
        dvd3.setLength(89);
        anOrder1.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tam quoc dien nghia");
        dvd4.setCategory("Tieu Thuyet");
        dvd4.setDirector("La Quan Trung");
        dvd4.setCost(15.00f);
        dvd4.setLength(150);
        anOrder1.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Tieu Ngao Giang Ho");
        dvd5.setCategory("Kiem Hiep");
        dvd5.setDirector("Kim Dung");
        dvd5.setCost(12.99f);
        dvd5.setLength(89);
        anOrder1.addDigitalVideoDisc(dvd5);

        anOrder1.printListItemOfOrder();

        anOrder1.removeDigitalVideoDisc(anOrder1.getALuckyItem());
        anOrder1.printListItemOfOrder();

    }
}
