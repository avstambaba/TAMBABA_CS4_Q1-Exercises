package ex03_tau_tambaba;
public class Singer {
    private String name;
    private int noOfPerformances, audience;
    private static double earnings;
    private Song favoriteSong;
    private static int totalPerformances;
    
    public void performForAudience(int a) {
        audience = a;
        noOfPerformances++;
        setTotalPerformances(getTotalPerformances() + 1);
        setEarnings(getAudience() * 100);
    }
    
    public void performForAudience(Singer singer2, int people) {
        singer2.setNoOfPerformances(singer2.getNoOfPerformances() + 1);
        singer2.earnings = (people*100)/2;
        setTotalPerformances(getTotalPerformances() + 2);
    }
    
    public void changeFavSong(Song s) {
        setFavoriteSong(s);
    }
    
    public Singer(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNoOfPerformances(){
        return noOfPerformances;
    }
    
    public int getAudience(){
        return audience;
    }
    
    public static double getEarnings(){
        return earnings;
    }
    
    public Song getFavoriteSong(){
        return favoriteSong;
    }
    
    public static int getTotalPerformances(){
        return totalPerformances;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param noOfPerformances the noOfPerformances to set
     */
    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    /**
     * @param audience the audience to set
     */
    public void setAudience(int audience) {
        this.audience = audience;
    }

    /**
     * @param earnings the earnings to set
     */
    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    /**
     * @param favoriteSong the favoriteSong to set
     */
    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    /**
     * @param aTotalPerformances the totalPerformances to set
     */
    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }
}