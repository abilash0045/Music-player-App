import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String Artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        Artist = artist;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public List<Song> getList() {
        return songs;
    }

    public void setList(List<Song> list) {
        this.songs = list;
    }

    public void addSongsToAlbum(String title,double duration,String artist){
        Song song = new Song(title,duration,artist);
        songs.add(song);
        System.out.println("Song added to Album: " + title);
    }
    public void addToPlaylist(String title, LinkedList<Song> playlist){
        Song s = findSong(title,songs);
        if (s == null){
            System.out.println("Song not found");
        }
        else{
            playlist.add(s);
            System.out.println("Song added successfully");
        }
    }
    public void addToPlaylist(int trackNo, LinkedList<Song> playlist){
        int index = trackNo-1;
        if (index >= 0 && index < songs.size()){
            playlist.add(songs.get(index));
            System.out.println("Song added to playlist");
        }
        else{
            System.out.println("Invalid track number");
        }
    }

    private Song findSong(String title, List<Song> songs) {
        for (Song s : songs){
            if (s.getTitle().equals(title))
                return s;
        }
        return null;
    }
}
