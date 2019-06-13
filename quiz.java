import java.util.Scanner;
import java.io. *;
public class quiz
{
    
    public static void main(String[] args){
        File f = new File("quizresponses.csv");
        try{
            Scanner input = new Scanner(f);
            input.nextLine();
            String[] ans = input.nextLine().split(",");
            while(input.hasNext()){
                String str = input.nextLine();
                String[] s = str.split(",");
                int i = 1;
                int score = 0;
                while(i<s.length){
                    if(s[i].equals(ans[i])){
                        score++;
                    }
                    i++;
                }
                System.out.println(s[0] + " " + score + "/8");
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
