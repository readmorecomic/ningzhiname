public class ningzhiname
{
    public static void main(String[] args){
        String wor="youtube";

        System.out.println("Ninj" + gzhi(wor) + " " + "w" + u(wor));


    }

    public static String gzhi(String w){
        String word1 = w.substring(indexOfFirstVowel(w));
        return word1;
    };

    public static String u(String w){
        
        String word2 = w.substring(indexOfFirstVowel(w));
        return word2;
    };

    public static int indexOfFirstVowel(String word){
        String loweredWord = word.toLowerCase();

        for (int index = 0; index < loweredWord.length(); index++)
        {
            if (vowels.contains(String.valueOf(loweredWord.charAt(index))))
            {
                return index;
            }
        }

        // handle cases where a vowel is not found
        return -1;
    }

    final static String vowels = "aeiou";
}