package oops;

public class Demo {
    public static void main(String[] args) {
        Student st1=new Student();
        st1=new Student();//Non-parameterized constructor
        Student str2=new Student(123);
        Student str3=new Student(123,"Anuj","Shukla");//parameterized constructor
        st1.studentAge=25;
        st1.studentName="Rajesh";
        st1.studentCity="Ghaziabad";
        st1.studentId=16383;
        st1.studentAddress="Vijay Nagar Ghaziabad,UP";
        st1.study();


        st1.showFullDetails();
        //this Key word: It refers current invoking object
        /*
        * this()--> for calling current class constructor from inside
        * different constructor of same class.
        *
        * Class Test(){
        *
        * this.a
        * }
        * */

        /*****************Inheritance
        *It is the mechanism in java by which
         *  one class is allowed to inherit the features of another
         * class
        *
        *Animal class
         *
         * Dog extends
        *
         *
         * class Dog extends Animal{
         *     Eat();
         *
         * }
        * */

    }
}
