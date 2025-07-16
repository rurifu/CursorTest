import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<AudioTrack> tracks = Arrays.asList(
            new AudioTrack("Song A"),
            new AudioTrack("Song B"),
            new AudioTrack("Song C"),
            new AudioTrack("Song D"),
            new AudioTrack("Song E")
        );
        List<String> podcasts = Arrays.asList("Podcast 1", "Podcast 2");

        MusicPlayer player = new MusicPlayer(tracks, podcasts);

        System.out.println("All songs: " + player.listSongs());
        System.out.println("All podcasts: " + player.listPodcasts());

        System.out.println("\nPlaying songs in order:");
        player.playSongs(false);

        System.out.println("\nPlaying songs shuffled:");
        player.playSongs(true);

        System.out.println("\nGenerating and playing random playlists:");
        for (int i = 1; i <= 3; i++) {
            PlayList pl = PlayList.generateRandomPlayList(tracks.size(), i + 1);
            System.out.println(pl);
            player.listenToPlayList(pl);
            System.out.println();
        }
    }
}