package LinkedListChallenge.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        Song temp = new Song(title, duration);
        if(songs.contains(temp)){
            return false;
        }

        songs.add(new Song(title, duration));
        return true;

    }

    private Song findSongs(String title){
        for(Song song : songs){
            if(song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }
        return null;
    }
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> list){

        if(trackNumber >= 1 && trackNumber <= songs.size()){
            Song songToAdd = songs.get(trackNumber-1);
            if(!list.contains(songToAdd)){
                list.add(songToAdd);
                return true;
            }
        }
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                if (!playlist.contains(song)) {
                    playlist.add(song);
                    return true;
                }
            }
        }
        return false;
    }
}