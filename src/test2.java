/**
 * Created by Jordan on 04/08/2015.
 */
public class test2 {
    public static String SongDecoder (String song)
    {


        String[] parts = song.split("WUB");
        String newString = "";
        for(String s: parts){
            if(!s.isEmpty()) {
                newString += s + " ";
            }
        }

        System.out.println(newString);

        return newString;
    }

    public static void main(String[] args){
        test2 t = new test2();
        t.SongDecoder("RWUBWUBWUBLWUB");
    }
}
