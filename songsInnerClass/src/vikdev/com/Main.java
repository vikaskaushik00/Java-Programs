package vikdev.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

    Album album = new Album();
    Album.SongList songList = album.new SongList("Punjabi","Karan aujla");
    songList.add("Hint",03.45);
        albums.add(songList.add("Don't Look",04.25));
        songList.add("Na Na Na",04.35);
        songList.add("Ink",04.00);
    albums.add(songList);

    songList = album.new SongList("BollyWood ","Arijit");
        songList.add("Pachtaoge",03.45);
        songList.add("Tera fitoor",04.45);
        songList.add("Sanam re",04.45);
    albums.add(songList);

    LinkedList<Songs> playList = new LinkedList<Songs>();
    albums.get(0).addToPlayList("Hint",playList);
        albums.get(0).addToPlayList("Don't Look",playList);
        albums.get(0).addToPlayList("Na Na Na",playList);


        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(3,playList);
        play(playList);

    }


    public static void play(LinkedList<Songs> playlist){
        ListIterator<Songs> playSong = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println("There are no songs in the playlist");
        }else {
            System.out.println("Now Playing  : "+playSong.next().toString());
        }

        Scanner scan = new Scanner(System.in);
        boolean quit = true;
        boolean forward = true;
        menu();

        while (quit){
            System.out.println("Enter your choice");
            int choose = scan.nextInt();
            scan.nextLine();

            switch (choose){
                case 0:
                    System.out.println("Shutting down application...");
                    quit = false;
                    break;
                case 1:
                    if (playSong.hasNext()){
                    System.out.println("Now playing "+playSong.next().toString());
                }else {
                    System.out.println("Reached end of the list");
                }
                break;
                case 2:
                    if (playSong.hasPrevious()){
                    System.out.println("Now playing "+playSong.previous().toString());
                }else {
                    System.out.println("Reached start of the list ");
                }
                    break;
                case 3:
                    if (forward){
                        if (playSong.hasPrevious()){
                            System.out.println("Now replaying "+playSong.previous().toString());
                            forward = false;

                        }else {
                            System.out.println("Reached start of the list ");
                        }
                    }


                    else {
                            if (playSong.hasNext()) {
                                System.out.println("Now replaying " + playSong.next().toString());
                                forward = true;

                            } else {
                                System.out.println("Reached end of the list");
                            }
                        }

                    break;
                case 4:
                    playListPrint(playlist);
                    break;
                case 5:
                    menu();
                    break;
            }
        }
    }

    public static void menu(){
        System.out.println("Available Options \n"+"Press\n"+
                "0 : To shut down application\n"+
                "1 : To play next song\n"+
                "2 : To play previous song\n"+
                "3 : To replay current song\n"+
                "4 : To show all song of play list\n"+
                "5 : To print available action");
    }

    public static void playListPrint(LinkedList<Songs> playList){
        ListIterator<Songs> i = playList.listIterator();
        System.out.println("All songs \n");
        System.out.println("========================================");
        while (i.hasNext()){
            System.out.println("->  "+i.next().toString());
        }
        System.out.println("========================================");

    }

}
