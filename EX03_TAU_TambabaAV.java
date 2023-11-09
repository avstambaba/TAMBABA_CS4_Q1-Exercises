// EX03_TAU_TAMBABA
package ex03_tau_tambaba;
public class EX03_TAU_TAMBABA {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Clairo");
        singer1.getName();
        singer1.performForAudience(12);
        
        Singer singer2 = new Singer("beabadoobee");
        singer2.performForAudience(12);
        
        singer2.performForAudience(singer1, (singer1.getAudience() + singer2.getAudience()));
        System.out.println(singer1.getName() + " and " + singer2.getName() + " did a total of " + Singer.getTotalPerformances() + " performances!");
        System.out.println("They each earned $" + Singer.getEarnings() + " from this event.");
    }
}