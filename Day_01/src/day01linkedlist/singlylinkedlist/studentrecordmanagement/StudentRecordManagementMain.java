package day01linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagementMain {

    public static void main(String args[]){

        //Create the StudentList object
        StudentList studentList = new StudentList();

        //Add student record
        // Add some student records
        studentList.addAtEnd(101, "Riya", 20, "A");
        studentList.addAtEnd(102, "Ram", 21, "B");
        studentList.addAtBeginning(100, "Shreya", 19, "A+");

        // Display all records
        System.out.println("All Students:");
        studentList.displayAllRecords();

        // Search for a student by Roll Number
        System.out.println("\nSearching for Roll Number 101:");
        studentList.searchRollNumber(101);

        // Update grade for a student
        System.out.println("\nUpdating grade for Roll Number 102:");
        studentList.updateGrade(102, "A");

        // Display all records again
        System.out.println("\nAll Students After Update:");
        studentList.displayAllRecords();

        // Delete a student by Roll Number
        System.out.println("\nDeleting student with Roll Number 100:");
        studentList.deleteByRollNumber(100);

        // Display all records again
        System.out.println("\nAll Students After Deletion:");
        studentList.displayAllRecords();
    }
}
