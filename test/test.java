

public class test{
   
    public static void main(String[] agrs){
         final int size = 10;
    int zero[][] = new int[size][size];
    
    for(int i=0;i<size;i++) {
            
        for(int j=0;j<size;j++)
            System.out.print(zero[i][j]);
        
        System.out.println();
    }

    for(int i=0;i<size;i++) {
            
        for(int j=0;j<i;j++)
        System.out.print(zero[i][j]);
        
        System.out.println();
    }

    for(int i=0;i<size;i++) {
            
        for(int j=size-1;j>i;j--)
        System.out.print(zero[i][j]);
        
        System.out.println();
    }

        


    }
}