package week7.no2;

public class SequentialSearch {
    
    String[] list;
    boolean result;
    String target;

    public SequentialSearch(String[] l,String t){

        list = l;
        target = t;

    }

    public boolean Sequential(){

        for (int i = 0; i < list.length;i++){

            if (list[i].equalsIgnoreCase(target)){
                result = true;
                break;
            }
            else {
                result = false;
            }

        }
        return result; 
    }

}
