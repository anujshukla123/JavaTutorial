package oops;

public class Student {

    //Data: datamembers instance variable
    int studentId;
    int studentAge;
    String studentName = "this is Anuj Shukla";
    String studentCity;
    String studentAddress;

    public Student() {
        this(1221, "Mayank", "Noida");
        System.out.println("Crating object");

    }

    public Student(int in) {
        System.out.println("this is a parameterized cons... " + in);
    }

    public Student(int a, String studentName, String studentCity) {
        System.out.println("A value is- " + a + "\nB value is "
                + studentName);
        System.out.println("C value is " + studentCity);
        this.studentId = a;
        studentName = studentName;
        studentCity = studentCity;
        System.out.println("value " + studentName);
        System.out.println("this value " + this.studentName);

    }

    //Behaviour: member method: methods:function
    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails() {
        System.out.println("Student Name: " + studentName + ", Address is " +
                studentAddress + " " + studentCity + ".\nID is--> " + studentId + " Age is==>" + studentAge);

    }
}
