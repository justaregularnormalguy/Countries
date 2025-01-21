

  // add private instance variables for the name, capital, language, and image file.
  public class Country {

    private String countryName;
    private String capital;
    private String language;
    private String imageFile;
  
    // Default constructor
    public Country() {
      this.countryName = "";
      this.capital = "";
      this.language = "";
      this.imageFile = "";
    }
  
    // Constructor with arguments
    public Country(String countryName, String capital, String language, String imageFile) {
      this.countryName = countryName;
      this.capital = capital;
      this.language = language;
      this.imageFile = imageFile;
    }
  
    // Getters (Accessor methods)
    public String getCountryName() {
      return countryName;
    }
  
    public String getCountryCapital() {
      return capital;
    }
  
    public String getLanguage() {
      return language;
    }
  
    public String getImage() {
      return imageFile;
    }
  
    // toString method
    @Override
    public String toString() {
      return String.format(countryName+ "'s capital is " + capital + " and its primary language is "+ language);
    }
  }
  // Write accessor/get methods for each instance variable that returns it.

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 


  
