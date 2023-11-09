package ex03_tau_tambaba;
public class Song {
    private String songName, album;
    private int duration;
    
    public Song(String n, String a, int d) {
        songName = n;
        album = a;
        duration = d;
    }
    
    public String getName(){
        return songName;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public int getDuration(){
        return duration;
    }
}
