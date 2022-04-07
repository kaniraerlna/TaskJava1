
package taskjava;

public class TaskJava {

    public static void main(String[] args) {
    Biodata biodata = new Biodata("Kanira", "Jakarta", "27 August 2003", 
        "Scrolling my phone", "Virgo", "Katsu Toji", "hmm apaya");
        
        biodata.display();     // read

    System.out.println(" ");

    // gabs bkin obj lg krn constructor dibuat didlm biodata class, krn atributnya dlm bentuk private
//    Biodata biodata2 = new Biodata("Ucup", "Bogor", "1 January 2000", 
//        "Coding", "Capricorn", "Cireng", "Soccer Player");
    
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
