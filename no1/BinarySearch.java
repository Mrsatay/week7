package week7.no1;

public class BinarySearch {
    
    int[] score;
    int mid;
    int begin;
    int end;
    int target;

    public BinarySearch(int[] s,int t){
        score = s;
        begin = 0;
        end = score.length - 1;
        target = t;

        // insertion_sort
        for (int i = 1; i < score.length; i++) {
            int key = score[i];
            int j = i - 1;
            while (j >= 0 && score[j] > key) {
                score[j+ 1] = score[j];
                j--;
            }
            score[j+ 1] = key;
        }

    }


    public int Binary_method(){

        while (begin <= end){
            mid = (begin + end)/2;

            if(score[mid] == target){
                return mid;
            }
            else if (target > score[mid]){
                begin = mid+1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
        
    }

}
