public class numberofwords {
    public static void main(String[] args) {
mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
    }

    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i=0;i<sentences.length;i++){
            char[] array = sentences[i].toCharArray();
            for(int j=0;j<array.length;j++){
                if(array.equals(" ")){

                    count++;

                }





            }

        }
        return 0;
    }
}
