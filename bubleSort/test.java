package bubleSort;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;


class studen{
    private String id;
    private String fn;
    private String ln;

     public studen(String id, String fn, String ln){
         this.id = id;
         this.fn = fn;
         this.ln = ln;

     }

     public String showString(){
         return this.id +"\t"+ this.fn;
     }
     public String showLastName(){
         return "\t"+this.ln;
     }
}

public class test {
    

    public static void main(String[] args) throws FileNotFoundException{

       // declear file local.
       File read_f = new File("C:/Users/user00/OneDrive - Chiang Mai University/Desktop/ADT-code/Assing1/bubleSort/input.csv");

       //read file input.csv
       Scanner input = new Scanner(read_f);

       int count=0;

       //cross out the data which don't need
       for(int i=0;i<7;i++)
           input.nextLine();

       Vector<studen> STD = new Vector<studen>();

           while(input.hasNextLine()){
               String information = input.nextLine();
               StringTokenizer cutComma = new StringTokenizer(information.trim(),",");
               //.nextToken mean keep the data before "," in variable. 
                   cutComma.nextToken();

               STD.addElement(new studen(cutComma.nextToken(), cutComma.nextToken(), cutComma.nextToken()));
               count++;

           }
           Vector <String> keep_lastname = new Vector<String>();
                for(int i=0 ; i<STD.size() ; i++)
                    keep_lastname.addElement(STD.get(i).showLastName());
               
                

                for(int i=0;i < keep_lastname.size();i++){//round of check

                    for(int k=0;k<keep_lastname.size()-1;k++){//swapping data, if i don't minus 1 with .size(), it'll go out of boandArray.
                        if(keep_lastname.elementAt(k).compareTo(keep_lastname.elementAt(k+1))>0){
                            String temp = keep_lastname.get(k);
                            keep_lastname.set(k, keep_lastname.get(k+1));
                            keep_lastname.set(k+1, temp);
                        }
                    }
                
                }
                System.out.println("Total of Student : "+count);
                //After sort
                    for(int i=0;i<keep_lastname.size();i++)
                        System.out.println(STD.get(i).showString()+keep_lastname.get(i));


    }
    
}
