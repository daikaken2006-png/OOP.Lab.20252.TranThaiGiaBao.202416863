package hust.soict.dsai.aims;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {

    private ArrayList<Media> itemsInStore =
            new ArrayList<Media>();

    public void addMedia(Media media) {

        itemsInStore.add(media);
    }

    public void removeMedia(Media media) {

        itemsInStore.remove(media);
    }

    public void print() {

        for (Media media : itemsInStore) {

            System.out.println(media.toString());
        }
    }

    public ArrayList<Media> getItemsInStore() {

        return itemsInStore;
    }
}