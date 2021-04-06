package intro;
import java.util.Vector;
import java.util.Scanner;
public class DemoBasicStringSorting{
     public static void main(String[] args) {
        //i use Vector<String> 
        Vector<String> myData = new Vector<String>();
        //read input from keyboard.
        Scanner input = new Scanner(System.in);
        String fruit =" ";
        boolean workLoop = true;
        String Q="quit";

        //1.Ask user for input and check if input are only string and not string Scanner(System.in)<read from keyboard.
        //2.if user type quit, start calling sorting method\
        //implement any sorting method here, 
        //do not user String  Collection
       
        while(workLoop){
             fruit = input.nextLine();
            if(fruit.equals(Q))
                workLoop =false;
            else if(isAlpha(fruit) )
                myData.addElement(fruit);
        }
        System.out.println("After swap:");
        for(int i= myData.size()-1;i >= 0 ;i--)
            System.out.println(myData.elementAt(i));
    }
     //out of main method
     public static boolean isAlpha(String s){
        return s != null && s.matches("^[a-zA-Z]*$");
     }//swaping method

}
    
    