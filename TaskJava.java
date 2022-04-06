
package taskjava;

public class TaskJava {

    public static void main(String[] args) {
    // read
    Biodata biodata = new Biodata("Kanira", "Jakarta", "27 August 2003", 
        "Scrolling my phone", "Virgo", "Katsu Toji", "hmm apaya");
        
        biodata.display();

    System.out.println(" ");
    
    // write
    biodata.setFullName("Ucup");
    biodata.setPlaceOfBirth("Bogor");
    biodata.setDateOfBirth("1 January 2000");
    biodata.setHobby("Coding");
    biodata.setZodiac("Capricorn");
    biodata.setFavoriteFood("Cireng");
    biodata.setGoals("Soccer Player");
        
        biodata.display();

    }
    
}
