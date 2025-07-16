public class AudioTrack {
    private String title;

    public AudioTrack(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing: " + title);
    }

    @Override
    public String toString() {
        return title;
    }
}