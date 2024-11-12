package guessingNumber;
import java.util.*;
public class GuessingNumbers {
    public static void main(String[] args) {
        Random or=new Random();
        Scanner os=new Scanner(System.in);
        int fnum=or.nextInt(1000);
        System.out.println("can you guess the random number ? ");
        System.out.print("it's between 0-1000, just try it 1 :");
        for(int x=1;x>=0;x+=0){
            int unum=os.nextInt();
            ++x;
            if(fnum>unum){System.out.println("try with  a bigger number "+x+" :");}
            else if(fnum<unum){System.out.println("try with  a smaller number "+x+" :");}
            else if(fnum==unum){System.out.println("you are realy smart  \n the"
            +" random nember was "+fnum);
            break; }
        }
    }
}
