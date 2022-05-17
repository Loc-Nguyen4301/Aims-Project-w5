package hust.soict.hedspi.aims.order;

import javax.sound.sampled.SourceDataLine;


public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    public DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("ERROR!!! Vuot qua so luong MAX_NUMBER_ORDERED");
            System.out.println("Can't add item have title \"" + disc.getTitle() + "\" in Order");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered < MAX_NUMBER_ORDERED) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            } else {
                System.out.print("ERROR!!! Vuot qua so luong MAX_NUMBER_ORDERED\n"
                        + "So luong cac item khong duoc them vao Order List:");
                System.out.println(dvdList.length - i);
                for (int j = i; j < dvdList.length; j++) {
                    System.out.println("Can't add item have title \"" + dvdList[j].getTitle() + "\" in Order");
                }
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("Can't add item have title \"" + disc1.getTitle() + "\" in Order");
        }

        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The disc has been added");

        } else {
            System.out.println("Can't add item have title \"" + disc2.getTitle() + "\" in Order");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int index;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                index = i;
                for (int j = index; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
            }
        }
    }

    public float totalCost() {
        float total = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public static final int MAX_LIMITED_ORDERS = 2;
    private static int nbOrders = 0;

    public Order() {
            nbOrders++; 
    }

    public void printListItemOfOrder() {
        System.out.println("***********************Order***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + ". DVD -" + itemsOrdered[i].getTitle() + "-" + itemsOrdered[i].getCategory() + "-"
                    + itemsOrdered[i].getDirector() + "-" + itemsOrdered[i].getLength() + ":"
                    + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost:" + totalCost());
    }

    public static int getNumOfInstances() {
        return nbOrders;
    }

    public DigitalVideoDisc getALuckyItem(){
        int randomNum = (int)(Math.random() * (qtyOrdered));  // 0 to qtyOrdered-1
        return itemsOrdered[randomNum];
    }
}
