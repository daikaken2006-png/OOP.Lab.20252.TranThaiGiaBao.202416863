package hust.soict.dsai.aims;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {

    private ArrayList<Media> itemsOrdered =
            new ArrayList<Media>();

    public void addMedia(Media media) {

        itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {

        itemsOrdered.remove(media);
    }

    public float totalCost() {

        float sum = 0;

        for (Media media : itemsOrdered) {

            sum += media.getCost();
        }

        return sum;
    }

    public void print() {

        for (Media media : itemsOrdered) {

            System.out.println(media.toString());
        }
    }

    public ArrayList<Media> getItemsOrdered() {

        return itemsOrdered;
    }
}