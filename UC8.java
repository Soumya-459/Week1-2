import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Method to create HashMap of character patterns
    public static Map<Character, String[]> createPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        map.put('P', new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        });

        map.put('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ***** ",
                "      **",
                "       **",
                "       **",
                "**     **",
                " ***** "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String word, Map<Character,String[]> map){

        int height = map.get('O').length;

        for(int i=0;i<height;i++){

            StringBuilder line = new StringBuilder();

            for(char c : word.toCharArray()){

                String[] pattern = map.get(c);

                if(pattern!=null){
                    line.append(pattern[i]).append("   ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character,String[]> patterns = createPatterns();

        String word = "OOPS";

        printBanner(word,patterns);
    }
}