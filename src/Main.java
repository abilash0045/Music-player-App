import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    }
}