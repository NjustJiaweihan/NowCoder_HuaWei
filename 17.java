import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
            String[] cmds = scanner.nextLine().split(";");

            int x = 0;
            int y = 0;
            int length = 0;
            char cmd = 'q';

            for (int i=0; i<cmds.length; i++)
            {
                if(cmds[i].length() == 2)
                {
                    cmd = cmds[i].charAt(0);
                    if(cmd == 'A' || cmd == 'D' || cmd == 'W' || cmd == 'S')
                    {
                        if(cmds[i].charAt(1)>='0' && cmds[i].charAt(1)<='9')
                        {
                            length = Integer.parseInt(cmds[i].charAt(1) + "");
                        }
                    }
                }
                else if(cmds[i].length() == 3)
                {
                    cmd = cmds[i].charAt(0);
                    if(cmd == 'A' || cmd == 'D' || cmd == 'W' || cmd == 'S')
                    {
                        if(cmds[i].charAt(1)>='0' && cmds[i].charAt(1)<='9')
                        {
                            length = Integer.parseInt(cmds[i].charAt(1)+"");
                            if(cmds[i].charAt(2)>='0' && cmds[i].charAt(2)<='9')
                            {
                                length = length * 10 + Integer.parseInt(cmds[i].charAt(2) + "");
                            }
                            else
                            {
                                continue;
                            }
                        }
                    }
                }
                else
                {
                    continue;
                }

                switch (cmd)
                {
                    case 'W': y = y + length;
                    break;
                    case 'A': x = x - length;
                    break;
                    case 'S': y = y - length;
                    break;
                    case 'D': x = x + length;
                    break;
                }
                length = 0;
                cmd = 'q';
            }
            System.out.println(x + "," + y);
        }
        scanner.close();
    }
}
