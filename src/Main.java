import java.util.*;

public class Main {
    public static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album eminem = new Album("M&M","Eminem");
        eminem.addSongsToAlbum("Lose yourself",5.5,"Eminem");
        eminem.addSongsToAlbum("Not afraid",4,"Eminem");

        Album ani = new Album("Aniruth hits","Aniruth");
        ani.addSongsToAlbum("Arabic kuthu",5,"Aniruth");
        ani.addSongsToAlbum("Porkanda singam",6,"Aniruth");


        albums.add(eminem);
        albums.add(ani);


        LinkedList<Song> myPlayList = new LinkedList<>();
        eminem.addToPlaylist("Lose yourself",myPlayList);
        ani.addToPlaylist(1,myPlayList);

        play(myPlayList);

    }

    public static void printMenu(){
        System.out.println("1 - play next");
        System.out.println("2 - play previous");
        System.out.println("3 - repeat");
        System.out.println("4 - printMenu");
        System.out.println("5 - delete current song");
        System.out.println("6 - print all songs");
        System.out.println("7 - exit");
    }
    public static void play(LinkedList<Song> playlist){
        ListIterator<Song> itr = playlist.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean isForward = false;
        if (playlist.size() > 0){
            System.out.println("Currently Playing " + itr.next());
            isForward = true;
        }
        else{
            System.out.println("Playlist is empty");
        }
        System.out.println("Enter your choice");
        printMenu();

        boolean exit = false;
        while(exit == false){
            int input = sc.nextInt();
            switch (input){
                case 1:
                    if (!isForward) {
                        itr.next();
                    }
                    if (itr.hasNext()){
                        System.out.println(itr.next());
                        isForward = true;
                    }
                    else{
                        System.out.println("You are at the end of the playlist");
                    }
                    break;
                case 2:
                    if (isForward){
                        itr.previous();
                    }
                    if (itr.hasPrevious()){
                        System.out.println(itr.previous());
                        isForward = false;
                    }
                    else{
                        System.out.println("You are at the start");
                    }
                    break;

                case 3:
                    if (isForward){
                        System.out.println(itr.previous());
                        isForward = false;
                    }
                    else{
                        System.out.println(itr.next());
                        isForward = true;
                    }
                    break;

                case 4:
                    printMenu();
                    break;
                case 5:
                    Song temp;
                    if (isForward){
                        temp = itr.previous();
                    }
                    else{
                        temp = itr.next();
                    }
                    itr.remove();
                    System.out.println("Removed "+ temp + " from playlist");
                    break;
                case 6:
                    printsongs(playlist);
                    break;
                case 7:
                    exit = true;
                    break;
            }
        }
    }
    public static void printsongs(LinkedList<Song> playlist){
        for (Song s : playlist){
            System.out.println(s);
        }
    }
}