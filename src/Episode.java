public class Episode {
    int seriesNumber;
    int episodeNumber;

    void skipIntro() {
        System.out.println("Skipping Intro.......");
    }

    void play(){
        System.out.println("Playing Episode.......");
    }
    void skipToNext() {
        System.out.println("Loading Next Episode......");
    }
}

class EpisodeTestDrive {
    public static void main(String[] args){
        Episode episode = new Episode();
        episode.seriesNumber=4;
        episode.play();
        episode.skipIntro();
    }
}