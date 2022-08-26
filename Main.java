import java.util.*;

class CountWords
{
    public static void main (String[] args)
    {

        System.out.println("Simple Java Word Count Program");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        int w = 1;

        for (int i = 0; i < str1.length(); i++)
        {
            char c=str1.charAt(i);
            if (c==' ')
            {
                w=w+1;
            }
        }

        System.out.println("Word count is = " +w);
    }
}