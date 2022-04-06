
package taskjava;


public class Biodata {
    private String fullName; 
    private String placeOfBirth;
    private String dateOfBirth;
    private String hobby;
    private String zodiac; 
    private String favoriteFood; 
    private String goals;
    
    // constructor w/ parameters
    Biodata(String fullName, String placeOfBirth, String dateOfBirth, String hobby,
            String zodiac, String favoriteFood, String goals){
        this.fullName = fullName;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.hobby = hobby;
        this.zodiac = zodiac;
        this.favoriteFood = favoriteFood;
        this.goals = goals;
    }

    // getter
    public String getFullName(){
        return this.fullName;
    }
    public String getPlaceOfBirth(){
        return this.placeOfBirth;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }    
    public String getHobby(){
        return this.hobby;
    }
    public String getZodiac(){
        return this.zodiac;
    }
    public String getFavoriteFood(){
        return this.favoriteFood;
    }
    public String getGoals(){
        return this.goals;
    }

    // setter
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setPlaceOfBirth(String placeOfBirth){
        this.placeOfBirth = placeOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public void setZodiac(String zodiac){
        this.zodiac = zodiac;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }
    public void setGoals(String goals){
        this.goals = goals;
    }

    void display(){
        System.out.println("==== BIODATA ====");
        System.out.println("Full Name      : " + getFullName());
        System.out.println("Place of Birth : " + getPlaceOfBirth());
        System.out.println("Date of Birth  : " + getDateOfBirth());
        System.out.println("Hobby          : " + getHobby());
        System.out.println("Zodiac         : " + getZodiac());
        System.out.println("Favorite Food  : " + getFavoriteFood());
        System.out.println("Goals          : " + getGoals());
    }

}
