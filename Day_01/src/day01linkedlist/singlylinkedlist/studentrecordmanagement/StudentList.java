package day01linkedlist.singlylinkedlist.studentrecordmanagement;

//Create the class name StudentList
public class StudentList {

    public static Student head;

    //Constructor to initialize the head of the list
    public StudentList(){
        this.head = null;
    }

    //Add student at the beginning
    public  void addAtBeginning(int rollNumber,String name,int age,String grade){

        //Create the new node
        Student newStudent = new Student(rollNumber,name,age,grade);
        newStudent.next = head;
        head = newStudent;
    }

    //Add student at the end
    public void addAtEnd(int rollNumber,String name,int age,String grade){
        Student newStudent = new Student(rollNumber,name,age,grade);
        if(head == null){
            head = newStudent;
        }else{
            Student temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newStudent;
        }

    }

    //Add student at a specific position
    public void addAtPosition(int position,int rollNumber,String name,int age,String grade){
        if(position<1){
            System.out.println("Invalid Position");
            return;
        }
        Student newStudent = new Student(rollNumber,name,age,grade);
        if(position == 1){
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;

        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position exceeds list size.");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    //Delete student record by rollnumber
    public void deleteByRollNumber(int rollNumber){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if(head.rollNumber == rollNumber){
            head = head.next;
            return;
        }
        Student temp = head;
        while(temp.next!=null&& temp.rollNumber!=rollNumber){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    //Search a student by rollNumber
    public void searchRollNumber(int rollNumber){
        Student temp = head;
        while(temp!=null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Student found: "+"name: "+temp.name+ "Age: "+temp.age+"Grade: "+temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll number"+rollNumber+"Not found");
    }

    //Update a student by grade
    public void updateGrade(int rollNumber,String newGrade){
        Student temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
                temp.grade = newGrade;
                System.out.println("Grade Updated for rollNUmber: "+rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with roll number"+rollNumber+"Not found");
    }

    //Display all records of the student
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}
