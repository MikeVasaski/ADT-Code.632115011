package lab2;

import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("C:/Users/user00/OneDrive - Chiang Mai University/Desktop/ADT-code/Lab2-18.12.63/lab2/953102701000.csv");
        Scanner input = new Scanner(file);

        String f=" ",aToz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] word = new char[54];//to keep character's name
        String[] full_data = new String[54];//to keep full data id first name and last name
        int count,Total_num=0;

        for(int i=0;i<7;i++){
         input.nextLine();
        }

        Vector<DATA_STD> s =  new Vector<DATA_STD>();
    
        while(input.hasNext()){
            String dataline = input.nextLine();
            StringTokenizer comma = new StringTokenizer(dataline.trim(),",");
            comma.nextToken();
            s.addElement(new DATA_STD(comma.nextToken(), comma.nextToken(), comma.nextToken()));
            Total_num++;
   
        }

        System.out.println("Total Student : "+Total_num);

        //Show all of student information
        for(int i=0;i<54;i++){
           f = s.elementAt(i).toString();
            word[i] = f.charAt(10);
            full_data[i] = s.elementAt(i).toString(); 
        }
        //System.out.println("--------------------word index 51 is "+word[51]);
            
            //DATA_STD e = new DATA_STD();
                       // System.out.println();//pass
                        //System.out.println(word.charAt(x));///pass

            for(int j=0;j<26;j++){
                count=0;
                for(int i=0;i<54;i++){
                    if(word[i]==aToz.charAt(j))
                                count++;
                }
                System.out.println(" "+aToz.charAt(j)+" : "+count);
               
                for(int i=0;i<54;i++){
                    if(full_data[i].charAt(10)==aToz.charAt(j))
                    System.out.println(full_data[i]);
                }
                System.out.println();
            }  
            //show full data
            /*for(int i=0;i<54;i++)
                System.out.println(full_data[i]);
            //System.out.println(i.toString());*/
        
        System.out.println("Program terminate properly.\n"); 
    
    }
    //out side public static main

}
 