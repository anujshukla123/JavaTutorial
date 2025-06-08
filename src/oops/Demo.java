package oops;

public class Demo {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.studentAge=25;
        st1.studentName="Rajesh";
        st1.studentCity="Ghazibad";
        st1.studentId=16383;
        st1.studentAddress="Vijay Nagar Ghaziabad,UP";
        st1.study();

        st1.showFullDetails();
    }
}
