package sortingalgorithms.countingsort.sortstudentages;

//Create the class name StudentAges
public class StudentAges {

    //Create the method name countingSort
    public static void countingSort(int ages[]){

        //Create the integer variable largest and store the minimum value
        int largest = Integer.MIN_VALUE;

        //Run the loop to the length of the array
        for(int i=0;i<ages.length;i++){
            // Update largest if a bigger value is found
            largest = Math.max(largest,ages[i]);
        }
        //Create a count array to store frequency of each age
        int count [] = new int[largest+1];

        //Run the loop
        for(int i=0;i<ages.length;i++){
            // Increment the count for the  age
            count[ages[i]]++;
        }

        //Create the integer variable j and store 0
        int j=0;

        //Run the loop to the length of the count array
        for(int i=0;i<count.length;i++){
            // If there are occurrences of age 'i', place them in the array
            while(count[i]>0){
                // Assign the sorted age to the array
                ages[j] = i;
                // Move to the next index
                j++;
                // Decrease the count
                count[i]--;

            }
        }
    }
}

