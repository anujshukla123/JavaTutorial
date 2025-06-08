package oops;

public class Student {

    //Data: datamembers instance variable
    int studentId;
    int studentAge;
    String studentName;
    String studentCity;
    String studentAddress;

    //Behaviour: member method: methods:function
    public void study()
    {
        System.out.println(studentName+" is studying");
    }
    public void showFullDetails()
    {
        System.out.println("Student Name: "+studentName+", Address is "+
                studentAddress+" "+studentCity+".\nID is--> "+studentId+" Age is==>"+studentAge);

    }
}
