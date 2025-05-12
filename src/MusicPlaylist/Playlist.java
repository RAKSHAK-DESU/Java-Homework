package MusicPlaylist;

import java.util.LinkedList;

public class Playlist {
    public static void main(String[] args){
        LinkedList<String > upNextPlayList = new LinkedList<String>();

        upNextPlayList.add("Song A");
        upNextPlayList.add("Song B");
        upNextPlayList.add("Song C");
        System.out.println(upNextPlayList);

        upNextPlayList.add(0,"Song X");
        System.out.println(upNextPlayList);

        int lastIndex= upNextPlayList.size();
        upNextPlayList.add(lastIndex,"Song Y");
        System.out.println(upNextPlayList);


        int l= upNextPlayList.size();
        for (int i = 0; i <l ; i++) {
           //Play Next Song
            System.out.println("now Playing : "+upNextPlayList.get(0));
            upNextPlayList.remove(0);
            //updated playlist
            System.out.println("");
            System.out.println(upNextPlayList);
        }
    }
}
