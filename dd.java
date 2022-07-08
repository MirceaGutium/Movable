import java.util.*;
class Movable
{
    public static void main(String s[])
    {
        int i,j,row,isc,osc,var;
        i=j=row=osc=var=0;
        Scanner read=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        row=read.nextInt();
        System.out.println("\n");
        if(row>0)
        {
            System.out.print("\t");
            osc=row-1;
            isc=1;
            for(i=osc;i>0;i--)
            {
                System.out.print(" ");
            }
            System.out.println("*");
            osc--;
            for(i=2;i<row;i++)
            {
                System.out.print("\t");
                for(int k=osc;k>0;k--)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(j=isc;j>0;j--)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
                isc+=2;
                osc--;
            }
            System.out.print("\t");
            if(row!=1)
            {
                for(i=1;i<=row*2-1;i++)
                {
                    System.out.print(":");
                }
            }
        }
        System.out.println("");
    }
}