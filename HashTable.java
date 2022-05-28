package Brigelab;

public class HashTable {
    static final int size = 5;

    public static int hashFunction(String str) {
        return str.hashCode() % size;
    }

    public static void sentence() {

        String sentence = "To be or not to be";
        String[] sentenceArray = sentence.split(" ");
        int i = 0;
        int j = 0;
        int count = 0;


        for (String str : sentenceArray) {
            System.out.println(str + "----" + hashFunction(str));
            //    System.out.println(sentenceArray);

        }
        System.out.println(sentenceArray.length);
        while (i != (sentenceArray.length)) {
            while (j != (sentenceArray.length)) {
                if (sentenceArray[i].equals(sentenceArray[j])) {
                    count = +1;
                }

                j++;
            }
            System.out.println("Frequency: of " + sentenceArray[i] + ": " + count);
            count = 0;
            i++;
            j = 0;
        }

    }

    public static void main(String[] args) {
        HashTable.sentence();


    }
}