package sortingalgorithms.selectionsort.sortexamscores;

//Create the class name ExamScore
public class ExamScore {

    //Create the method name selectionSort
    public static void selectionSort(int scores[]){

        //Run the loop the  length -1 of the array
        for(int i=0;i<scores.length-1;i++){

            //Create the integer variable smalles and store i
            int smallest = i;

            //Run the loop the  length of the array
            for(int j=i+1;j<scores.length;j++){

                //Check the condition
                if(scores[smallest]>scores[j]){

                    // Update the index of the minimum element
                    smallest =j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = scores[smallest];
            scores[smallest] = scores[i];
            scores[i] = temp;
        }
    }
}
