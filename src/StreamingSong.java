public class StreamingSong {
    String title;
    String artist;
    int duration;

    void play(){
    System.out.println("Playing Song");
    }

    void printDetails(){
    System.out.println("This is "+title+" by "+artist);
    }
}

class StreamingSongTestDrive {
    public static void main(String[] args){

        StreamingSong song= new StreamingSong(); //song wasnt declared so fixed it with declaring song
        song.artist= "The beatles";
        song.title="Come Together";
        song.play();
        song.printDetails();

    }
}
