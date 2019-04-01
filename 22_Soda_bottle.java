import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int emptyNum = scanner.nextInt();
            if(emptyNum != 0)
            {
                System.out.println(cal(emptyNum));
            }
        }
    }

    public static int cal(int emptyNum)
    {
        int water = 0;

        if(emptyNum < 2)
        {
            return 0;
        }
        else if(emptyNum == 2)
        {
            return 1;
        }
        else
        {
            water = emptyNum / 3;
            emptyNum = water + emptyNum % 3;
            water += cal(emptyNum);
            return water;
        }

    }
}
