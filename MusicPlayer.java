import java.util.*;

public class MusicPlayer implements ListSongs, ListPodcasts, ListenPlayList {
    private List<AudioTrack> library;
    private List<String> podcasts;

    public MusicPlayer(List<AudioTrack> library, List<String> podcasts) {
        this.library = new ArrayList<>(library);
        this.podcasts = new ArrayList<>(podcasts);
    }

    @Override
    public List<AudioTrack> listSongs() {
        return new ArrayList<>(library);
    }

    @Override
    public List<String> listPodcasts() {
        return new ArrayList<>(podcasts);
    }

    public void playSongs(boolean shuffle) {
        List<AudioTrack> toPlay = new ArrayList<>(library);
        if (shuffle) {
            Collections.shuffle(toPlay);
        }
        for (AudioTrack track : toPlay) {
            track.play();
        }
    }

    @Override
    public void listenToPlayList(PlayList playList) {
        for (int ix : playList.list) {
            if (ix >= 0 && ix < library.size()) {
                library.get(ix).play();
            } else {
                System.out.println("Invalid track index: " + ix);
            }
        }
    }
}