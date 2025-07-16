import java.util.*;

public class PlayList {
    List<Integer> list;

    public PlayList(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public String toString() {
        return "Play-list: " + list;
    }

    public static PlayList generateRandomPlayList(int numberOfTracksInLibrary, int playListSize) {
        ArrayList<Integer> libraryIndexes = new ArrayList<>();
        for (int i = 0; i < numberOfTracksInLibrary; i++) {
            libraryIndexes.add(i);
        }
        Collections.shuffle(libraryIndexes);
        List<Integer> playListIndexes = libraryIndexes.subList(0, playListSize);
        return new PlayList(playListIndexes);
    }
}