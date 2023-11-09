package ex02_ta30_tambabaav;
public class Singer {
    String name;
    int noOfPerformances, audience;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int a) {
        audience = a;
        noOfPerformances++;
        earnings = audience*100;
    }
    
    public void changeFavSong(Song s) {
        favoriteSong = s;
    }
    
    public Singer(String a, int b, double c) {
        name = a;
        noOfPerformances = b;
        earnings = c;
    }
}
