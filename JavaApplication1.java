package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        String song1 = "Selfless";
        String artist1 = "The Strokes";
        int duration1 = 222;
        System.out.println("Song 1 \nSong Name: " + song1 + "\nArtist: " + artist1 + "\nDuration: " + duration1 + " seconds\n");
        
        String song2 = "The Adults Are Talking";
        String artist2 = "The Strokes";
        int duration2 = 309;
        System.out.println("Song 2 \nSong Name: " + song2 + "\nArtist: " + artist2 + "\nDuration: " + duration2 + " seconds\n");
        
        String song3 = "Is This It";
        String artist3 = "The Strokes";
        int duration3 = 151;
        System.out.println("Song 3 \nSong Name: " + song3 + "\nArtist: " + artist3 + "\nDuration: " + duration3 + " seconds\n");
        
        int durationTotal = duration1 + duration2 + duration3;
        boolean sameArtist = (artist1 == artist2) && (artist1 == artist3) && (artist2 == artist3);
        boolean song1IsLongest = (duration1 > duration2) && (duration1 > duration3);
        System.out.println("Total duration: " + durationTotal + " seconds");
        System.out.println("All three songs have the same artist: " + sameArtist);
        System.out.println("'Selfless' has the longest duration: " + song1IsLongest);
    }
    
}
