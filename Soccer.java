package integration;

/**
 * . class Soccer is a derived class from the class sports
 * inheritance. is when an object or class is based on another object
 * or class, using the same implementation
 * 
 * @author Saniya Ashraf
 */
class Soccer extends Sports {
  @Override
  String getName() {
    return "Soccer Class";
  }

  String getName(String countryName) {
    if (countryName.toLowerCase().equals("US")
        || countryName.toLowerCase().equals("USA")) {
      return "Soccer";

    } else {
      return "football";
    }
  }


  /**
   * . inheritance is when an object or class is based on another object
   * or class, using the same implementation Method Overriding is a
   * great example of run time polymorphism ( dynamic binding)
   */
  @Override
  void getNumberOfTeamMembers() {
    System.out.println("Each team has 11 players in " + getName());
  }

  /**
   * . Method Overloading is a great example of Compile time
   * polymorphism (static binding)
   * 
   * @param countryName for other countries
   * @return Name of the sport
   */
}
