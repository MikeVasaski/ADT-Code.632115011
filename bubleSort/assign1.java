package bubleSort;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

class student{
    private String SID;
    private String f_name;
    private String l_name;

    public student(String lastName){
        this.l_name = lastName;
    }

    public student(String ID, String firstName){
        this.SID = ID;
        this.f_name = firstName;
    }

    public String showString(){
        return "   "+this.l_name;
    }

    public String showIdFirstName(){
        return this.SID + "   "+this.f_name;
    }


}

public class assign1{

    public static void main(String[] args) throws FileNotFoundException{
        readFile();
       
            
    }//out of main method

    public static void readFile() throws FileNotFoundException{
        // declear file local.
        File read_f = new File("C:/Users/user00/OneDrive - Chiang Mai University/Desktop/ADT-code/Assing1/bubleSort/input.csv");

        //read file input.csv
        Scanner input = new Scanner(read_f);

        int count=0;

        //cross out the data which don't need
        for(int i=0;i<7;i++)
            input.nextLine();

        Vector<student> STD = new Vector<student>();

            while(input.hasNextLine()){
                String information = input.nextLine();
                StringTokenizer cutComma = new StringTokenizer(information.trim(),",");
                //.nextToken mean keep the data before "," in variable. 
                cutComma.nextToken();

                STD.addElement(new student(cutComma.nextToken(), cutComma.nextToken()));;
                STD.addElement(new student(cutComma.nextToken()));
                count++;

            }
                System.out.println("\nTotal Student :"+count);
                bubleSort(STD,count); 
                    

    }//out of readFile method.

    public static void bubleSort(Vector<student> sort ,int side){
                
            Vector<String> l_name = new Vector<String>();
                ///keep first character
                for(int i=0 ; i<side ; i++){
                    l_name.addElement(sort.get(i).showString());
                }
                //sort from A - Z
        for(int i=0;i < l_name.size();i++){//round of check

            for(int k=0;k<l_name.size()-1;k++){//swapping data, if i don't minus 1 with .size(), it'll go out of boandArray.
                if(l_name.elementAt(k).compareTo(l_name.elementAt(k+1))>0){
                    String temp = l_name.get(k);
                            l_name.set(k, l_name.get(k+1));
                            l_name.set(k+1, temp);
                }
            }
        
        }
       System.out.println(" Student's last name\n");
        for(int i=0 ; i<side ; i++)
                System.out.println(l_name.get(i));
        
    }//out of bubleSort Method

}