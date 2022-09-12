import java.lang.*;
import java.util.*;

class program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  // 9th July

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        System.out.println("Enter position ");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        bool bRet = bobj.ToggleBit(value,pos);
		
		if()
		{
        System.out.println("Bit is On ");
		}
		else
		{
        System.out.println("Bit is Off ");
		}
    }
}
class Bitwise
{
        public int ToggleBit(int iNo, int iPos)
        {
            int iMask = 0X00000001;
            int iResult = 0;

            iMask = iMask << (iPos-1);

            iResult = iNo | iMask;
            
			if(iResult == iNo)
			{
				return TRUE;
			}
			else
			{
				return FALSE;
			}
        }
}

class program203
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);  // 9th July

        System.out.println("Enter number ");
        int value = sobj.nextInt();

        System.out.println("Enter position ");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        bool bRet = bobj.ToggleBit(value,pos);
		
		if()
		{
        System.out.println("Bit is On ");
		}
		else
		{
        System.out.println("Bit is Off ");
		}
    }
}
