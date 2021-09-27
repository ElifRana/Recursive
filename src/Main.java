public class Main {

    public static void main(String[] args){

        String sentence = "Elif Rana Yılancı";
        String reversing = reverse(sentence);
        System.out.println("Ters çevrilmiş hali: " + reversing);
    }
    public static String reverse(String sentence){
        if(sentence.isEmpty())
            return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0) ;
        // substring istenilen karakter kadar verinin geri döndürülmesini sağlar
        // charAt belirtilen indeksdeki değeri verir
    }
}
