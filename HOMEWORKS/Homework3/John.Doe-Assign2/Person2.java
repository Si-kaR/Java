
  /**
 * A class to model a person, who has a name and an age.
 **/
public class Person1() {
  private String name;
  private int age;
  private String gender;


/*For good reasons I feel use a
 * public static final age = 18; so it 
 * runs through the entire code*/


  /*Adding a votingAge as 
   * static variable to represent
   * the age at which a person is
   * allowed to vote.
   */
  private static int votingAge;//~~~~~~~~~~~~~~~1

  /*Adding drivingAge as a
   * static variable to represent
   * age of the person allowed to
   * drive
   */
  private static int drivingAge;//~~~~~~~~~~~~~~~~~~~~2
  

  /*Adding marriageAge as a
   * static variable to represent 
   * age at which a person is
   * allowed to marry.
   */
  private static int marriageAge;//~~~~~~~~~~~~~~~~~~~~~~3
 

  /*Creating constants for age thresholds
   * */

  /*Creating constant for the 
   * age that describes 
   * infancy*/
  public static final int INFANT_AGE = 2;

  /*Creating constants for the 
   * age that describes a
   * toddler*/
  public static final int MIN_TODDLER_AGE = 1;
  public static final int MAX_TODDLER_AGE = 3;

  /*Creating constant for the 
   * age that describes a 
   * teenager*/ 
  public static final int MIN_TEENAGER_AGE = 13;
  public static final int MAX_TEENAGER_AGE = 19;

  /*Creating constant for the
   * age that describes a 
   * child*/
  public static final int CHILD_AGE = 15;

  /*Creating a constant for the 
   * age that describes a 
   * youth
   **/
   public static final int MIN_YOUTH_AGE = 15; 
   public static final int MAX_YOUTH_AGE = 24;
   // Okay at this point I think I've made a mistake. Maybe I'm only supposed to initialise
   // here and then declare them in a method somewhere
   // correct me if I'm wrong. 

  
  /*Writing set method for static
   * variable votingAge
   */
  public static void setvotingAge(int age){//~~~~~~~~~~~~~~~~~~~~~~~~~
	  votingAge = age;
  }

  /*Writing get method for the static
   * variable votingAge
   * */
  public static int getvotingAge(){//~~~~~~~~~~~~~~~~~~~~~~~~
	  return votingAge;
  }

  /*Adding a method canVote
   * to indicate whether a person 
   * can vote or not, given their age*/
  public static boolean canVote(){//~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  if (age >= getvotingAge()){
		  return true;
	  }else{
		  return false;
	  }
  }

   /*Writing set method for 
    * static variable 
    *  drivingAge*/
   public static void setdrivingAge(int age){//~~~~~~~~~~~~~~~~~~~~~
	   drivingAge = age;
   }

  /*Writing get method for
   * static variable 
   * drivingAge
   */
   public static int getdrivingAge(){//~~~~~~~~~~~~~~~~~~~~~~~
	   return drivingAge;
   }

   /*Adding a method canDrive
    * to indicate whether a person 
    * can drive or not, given their age*/
   public static boolean canDrive(){//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   if (age >= getdrivingAge()){
		   return true;
	   }else{
		   return false;
	   }
   }

   /*Writing set method for 
    * static variable 
    * marriageAge*/
   public static void setmarriageAge(){//~~~~~~~~~~~~~~~
	   marriageAge = age;
   }

   /*Writing get method for
    * static variable
    * marriageAge
    */
   public static int getmarriageAge(){//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   return marriageAge = age;
   }

   /*Adding a method canMarry
    * o indicate whether a person 
    * can marry or not, given their age*/
   public static boolean canMarry(){//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   if (age >= getmarriageAge()){
		   return true;
	   }else{
		   return false;
	   }
   }

  /*Adding a method isAdult
   * to indicate whether a person
   * is an adult or not*/
  public static boolean isAdult(){//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  if (canDrive() && canVote() && canMarry()){
		  return true;
	  }else{
		  return false;
	  }
  }

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /*Writing a static method
   * createAdult for the Person class 
   */

   public static Person createAdult(String name, String gender){

	   /*using if and else statement to determine minimum age
	    * the age where anyone can do anything...therefore 18-ish
	    */

	  int minimumAge = Math.min(getdrivingAge(), Math.min(getvotingAge(), getmarriageAge()));
	  //I don't kow but maybe the question wanted us to find the maximum age at which all 
	  //things could be done; the rather said minimum age. 
	  //
	  //Correct me if i'm wrong~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	

	   //returning instance of this class~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   return new Person(name, minimumAge, gender);
   }

  /*Methods to constants that have been declared*/

  /*Method for the infant
   * constant*/
  public static boolean isInfant{
	  if(age<INFANT_AGE){
		  return true;
	  }else{
		  return false;
	  }
  }

  /*Method for the toddler
   * constant*/
  public static boolean isToddler{
	  if(age>=MIN_TODDLER_AGE && age<=MAX_TODDLER_AGE){
		  return true;
	  }else{
		  return false;
	  }
  }

  /*Method for the child
   * constant*/
  public static boolean isChild{
	  if(age<CHILD_AGE){
		  return true;
	  }else{
		  return false;
	  }
  }

  /*Method for the teenager
   * constant*/
  public static boolean isTeenager{
	  if(age>=MIN_TEENAGER_AGE && age <= MAX_TEENAGER_AGE){
		  return true;
	  }else{
		  return false;
	  }
  }

  /*Method for the youth
   * constant*/
  public static boolean isYouth{
	  if(age>=MIN_YOUTH_AGE && age<=MAX_YOUTH_AGE){
		  return true;
	  }else{
		  return false;
	  }
  }

  // default constructor
  public Person() {
    this("No name yet", 0, "female");
    //setPerson("No name yet", 0);
  }

  // constructor that takes a name and an age
  public Person(String n, int a, String g) {
    setPerson(n, a);
    gender = g;
  }

  // accessor method for name
  public String getName() {
    return name;
  }

  // accessor method for age
  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getGenderAsString() {
    return this.gender;
  }

  // mutator method for name
  public void setName(String n) {
    name = n;
  }

  // mutator method for age
  public void setAge(int a) {
    if (a < 0) {
      System.out.println("Age cannot be negative.");
      System.exit(0);
    } else
      age = a;
  }

  // method to set both the name and the age
  public void setPerson(String n, int a) {
    setName(n);
    setAge(a);
  }

  // tests whether this person is equal to another
  public boolean equals(Person otherP) {
    return (name.equals(otherP.name) && age == otherP.age);
  }

  // tests whether this person has the same name as another
  public boolean hasSameNameAs(Person otherP) {
    return name.equals(otherP.name);
  }

  // tests whether this person has the same age as another
  public boolean hasSameAgeAs(Person otherP) {
    return age == otherP.age;
  }

  // tests whether this person is older than another
  public boolean isOlderThan(Person otherP) {
    return age > otherP.age;
  }

  // tests whether this person is younger than another
  public boolean isYoungerThan(Person otherP) {
    return age < otherP.age;
  }
}
