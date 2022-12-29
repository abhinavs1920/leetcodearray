public class returnvaluex {
    public static void main(String[] args) {
      finalValueAfterOperations(new String[]{"--X", "X++", "X++"});
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;

      for(int i=0;i<operations.length;i++){
          if(operations[i].equals("--X")){
             x--;
  }
          else {
              x++;
          }

      }
        System.out.printf(operations[0]);
       //l System.out.printf(str);
        System.out.println(x);
        return x;
    }
}
