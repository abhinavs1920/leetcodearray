import java.util.ArrayList;

public class leetgemsolu {
    public static void main(String[] args) {
        numJewelsInStones("aA", "aAAbbbb");


    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsarray = jewels.toCharArray();
        char[] stonesarray = jewels.toCharArray();
        ArrayList<Character> uniquejewels = new ArrayList<>();
        uniquejewels.add(jewelsarray[0]);
        ArrayList<Character> uniquestones = new ArrayList<>();
        for(int i=1;i<jewelsarray.length;i++){
            if(jewelsarray[i]==jewelsarray[i-1]){


            }
            else {
                uniquejewels.add(jewelsarray[i]);

            }
        }
        System.out.println(uniquestones);
        return 0;
    }
}
