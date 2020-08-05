/**
 * Created by KPS on 8/5/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,4,5};
        boolean tag = false;
        int data = 0;
        for(int i = 0 ; i < ints.length-1;i++){
            for (int j = i ; j <ints.length-1 ; j++){
                if (ints[i] == ints[j]){
                    tag=true;
                    data = ints[i];
                }
            }
        }
        System.out.println(data);

    }
}
