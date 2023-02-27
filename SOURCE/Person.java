public class Person {
    //Declare variables
    private String name;
    private int age;
    private String gender;

    //create a class constructor
    Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //name mutator method
    public void setName(String name) {
        this.name = name;
    }

    //name accessor method
    public String getName() {
        return "Their name is " + name;
    }

    //age mutator method
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }

        else {
            System.exit(-1);
        }
    }

    //age accessor method
    public int getAge() {
        System.out.println("Their name is " + name);
        return age;
    }

    //gender mutator method
    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male")) {
            this.gender = gender;
        }

        else {
            System.exit(-1);
        }
    }

    //gender accessor method
    public String getGender() {
        return "Their gender is " + gender;
    }

    public void setPerson(String name, int age, String gender) {
        this.name = name;
        if (age>0) {
            this.age = age;

            if(gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male")) {
                this.gender = gender;
            }
        }

        else {
            System.exit(-1);
        }
    }

    public void getPerson() {
        System.out.println("The person is called " + name);
        System.out.println("Their age is " + age);
        System.out.println("Their gender is " + gender);
    }

}
