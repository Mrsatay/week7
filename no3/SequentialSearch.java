package week7.no3;

public class SequentialSearch {
    
    int[][] list;
    int target;
    int row;
    int column;
    boolean result;

    public SequentialSearch(int[][] l, int t){

        list = l;
        target = t;

    }

    public boolean Sequential(){

        for(int i = 0; i < list.length; i++){
            for (int j = 0; j < list[0].length; j++){

                if (target == list[i][j]){
                    result = true;
                    row = j+1;
                    column = i+1;
                    break;
                }
                else{
                    result = false;
                }
            }
            if (result){
                break;
            }
        }
        return result;
    }
}