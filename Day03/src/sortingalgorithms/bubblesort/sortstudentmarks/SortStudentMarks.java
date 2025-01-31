package sortingalgorithms.bubblesort.sortstudentmarks;

//Create the class name SortStudentMarks
public class SortStudentMarks {

        //Create the method name bubbleSort
        public static void buubleSort(int marks[]){

            boolean swapped;
            //Run the loop from the 0 index to the index length -1
            for(int i =0; i< marks.length-1;i++){
                swapped = false;
                //Run the loop from the 0 index to the index length -i
                for(int j=0;j<marks.length-1-i;j++){

                    //Check the condition if marks[i]>marks[i+1]
                    if(marks[j]>marks[j+1]){

                        //Swap marks[j] and marks[j+1]
                        int temp = marks[j];
                        marks[j] = marks[j+1];
                        marks[j+1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped)
                    break;
            }
        }
    }



