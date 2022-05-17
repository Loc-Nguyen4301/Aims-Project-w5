package hust.soict.hedspi.test.disc;

public class TestPassingParameter {
    public static void main(String args[]) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("jungle dvd title:" + jungleDVD.getTitle());
        System.out.println("cinderella dvd title:" + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title:" + jungleDVD.getTitle());

        Wrapper wjungleDVD = new Wrapper(jungleDVD);
        Wrapper wcinderellaDVD = new Wrapper(cinderellaDVD);
        swap(wjungleDVD, wcinderellaDVD);
        System.out.println("jungle dvd title:" + wjungleDVD.dvd.getTitle());
        System.out.println("cinderella dvd title:" + wcinderellaDVD.dvd.getTitle());
    }

    public static void swap(Wrapper w1, Wrapper w2) {
        DigitalVideoDisc temp = w1.dvd;
        w1.dvd = w2.dvd;
        w2.dvd = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle= dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

}

class Wrapper {
    DigitalVideoDisc dvd;

    Wrapper(DigitalVideoDisc dvd) {
        this.dvd = dvd;
    }
}