package sortingalgorithms.selectionsort.sortexamscores;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 66, 88, 79};

        ExamScore.selectionSort(examScores);

        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}
