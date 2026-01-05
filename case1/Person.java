package case1;

/**
 * Represents a general person in the hospital system.
 */
public class Person {

    protected String personID;
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
    protected String contactDetails;

    public Person(String personID, String name, int age, String gender,
                  String address, String contactDetails) {

        this.personID = personID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    /**
     * Displays the personal details of the person.
     */
    public void viewPersonalDetails() {
        System.out.println("ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactDetails);
    }
}
