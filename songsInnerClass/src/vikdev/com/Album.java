package vikdev.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private SongList songList;

    public boolean addToPlayList(int trackNumber,LinkedList<Songs> playList){
        int index = trackNumber-1;
        if((index >= 0) && (index <=songList.songs.size())){
            playList.add(songList.songs.get(index));
            return true;
        }
        else {
            System.out.println("Track number "+trackNumber+" not present");
            return false;
        }
    }


    public boolean addToPlayList(String title,LinkedList<Songs> playList){
        Songs check = songList.find(title);
        if (check != null){
            playList.add(check);
            return true;
        }
        else {
            System.out.println("Song doesn't exists : "+title);
            return false;
        }
    }


    class SongList{
        private String name;
        private String artist;
        private ArrayList<Songs> songs = new ArrayList<Songs>();

        public SongList(String name,String artist){
            this.name = name;
            this.artist = artist;
        }

        public boolean  add(String title,double duration){
            if (find(title)== null){
                this.songs.add(new Songs(title,duration));
                return true;
            }
            return false;
        }


        public Songs find(String name){
            for (Songs checkedSong: this.songs){
                if (checkedSong.getName().equals(name)){
                    return checkedSong;
                }
            }
            return null;
        }
    }
}
