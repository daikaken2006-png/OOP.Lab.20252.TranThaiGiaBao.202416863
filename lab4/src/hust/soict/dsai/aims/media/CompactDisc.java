package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc
        extends Disc
        implements Playable {

    private String artist;

    private ArrayList<Track> tracks =
            new ArrayList<Track>();

    public CompactDisc(int id,
                       String title,
                       String category,
                       float cost,
                       int length,
                       String director,
                       String artist) {

        super(id,
                title,
                category,
                cost,
                length,
                director);

        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {

        if (!tracks.contains(track)) {

            tracks.add(track);

            System.out.println("Track added");
        }
    }

    public void removeTrack(Track track) {

        if (tracks.contains(track)) {

            tracks.remove(track);

            System.out.println("Track removed");
        }
    }

    @Override
    public int getLength() {

        int sum = 0;

        for (Track track : tracks) {

            sum += track.getLength();
        }

        return sum;
    }

    @Override
    public void play() {

        if (this.getLength() <= 0) {

            System.out.println(
                    "CD cannot be played"
            );

            return;
        }

        System.out.println(
                "Playing CD: " + getTitle()
        );

        for (Track track : tracks) {

            track.play();
        }
    }

    @Override
    public String toString() {

        return "CD: "
                + getTitle()
                + " - "
                + getCost();
    }
}