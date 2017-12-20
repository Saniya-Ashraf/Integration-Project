package integration;

/**
 * @author Saniya Ashraf.
 */
public abstract class Sports {

  private String name = "generic Sports";

  /**
   * .
   * 
   * @return the generic sports.
   */

  String getName() {
    return name;
  }

  void getNumberOfTeamMembers() {
    System.out.println("Each team has n players in " + getName());
  }


}
