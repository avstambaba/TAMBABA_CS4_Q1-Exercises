package ex02_ta30_tambabaav;
public class EX02_TA30_TambabaAV {
    public static void main(String[] args) {
        Penguin pengu1 = new Penguin("Alex", "Humboldt", 3, 3.4);
        Penguin pengu2 = new Penguin("Bob", "Magellanic", 17, 5.7);
        Penguin pengu3 = new Penguin("Christopher", "Gentoo", 7, 4.9);
        
        Song song1 = new Song("Selfless", "The New Abnormal", 222);
        Song song2 = new Song("Reptilia", "Room On Fire", 219);
        
        Singer singer = new Singer("The Strokes", 0, 0);
        
        singer.favoriteSong = song1;
        singer.performForAudience(12);
        
        System.out.println(singer.name + " performed to " + singer.audience + " people today at a private concert!");
        System.out.println("They performed their favorite song '" + singer.favoriteSong.songName + "', from their album " + singer.favoriteSong.album + ".\n");
        
        singer.changeFavSong(song2);
        
        System.out.println("For their last performance, their favorite song changed to '" + singer.favoriteSong.songName + "' from " + singer.favoriteSong.album + "!");
        System.out.println("They earned a total of $" + singer.earnings + " for this show.");
    }
}
