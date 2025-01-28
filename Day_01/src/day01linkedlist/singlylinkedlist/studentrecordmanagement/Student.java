package day01linkedlist.singlylinkedlist.studentrecordmanagement;

//Create the class name student
public class Student {

       //Attributes
        int rollNumber;
        String name;
        int age;
        String grade;
        Student next;

        //Constructor to initialize the student record
        public Student(int rollNumber, String name ,int age,String grade){
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;

        }
}

