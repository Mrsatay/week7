package week7.no4;

public class jobsheetno4 {
    
    int[] list;
    int target;
    int biggest_value;
    int total_biggest_value;
    int index;

    public jobsheetno4(int[] l, int t){

        list = l;
        target = t;
        total_biggest_value = 0;

    }

    public void sort(){
        // insertion_sort
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j+ 1] = list[j];
                j--;
            }
            list[j+ 1] = key;
        }
    }

    public void search(){

        sort();
        for (int i = 0; i < list.length; i++){

            if (target == list[i]){
                index = i;
                break;
            }

        }

        biggest_value = list[list.length - 1]; //After sorting, the biggest value must
                                              // be in the last position

    }

    public void amount_biggest_value(){

        for (int i = 0; i < list.length; i++){

            if (biggest_value == list[i]){
                total_biggest_value++;
            }
        }

    }



}
