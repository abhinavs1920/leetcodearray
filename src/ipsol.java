import java.util.ArrayList;

public class ipsol {
    public static void main(String[] args) {
        defangIPaddr("1.1.1.1");

    }

    public static String defangIPaddr(String address) {
        char[] array = address.toCharArray() ;
       String str = "";
        ArrayList<Character> answer = new ArrayList<>() ;
       // array=address.toCharArray();
        for (int i =0 ; i<array.length;i++){

            if(array[i]=='.'){
                answer.add( '[');
                i++;
                answer.add( '.');
                i++;
                answer.add(']');
                i--;
                i--;

            }
            else
                answer.add( array[i]);


        }
        for(int i=0;i<answer.size();i++){
            System.out.printf(String.valueOf(answer.get(i)));
            str = str + answer.get(i);
        }

        return str;
    }
}
