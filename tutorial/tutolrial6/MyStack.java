class Student{

    public String STD;//keep Student ID
    public String f_name;
    public String l_name;

    Student(String ID, String fname, String lname){
        this.STD = ID;
        this.f_name = fname;
        this.l_name = lname;
    }

    public String giveF_name(){
        return this.f_name;
    }

    public String giveSTD(){
        return this.STD +" "+ this.f_name +" "+ this.l_name;
    }

}//out of Student Class

/************************************************************************ */
public class MyStack{
    private Student[] S; // declears class named Student and difne it to array type
    private int top=0,size=0;

    public MyStack(int size){
        S = new Student[size]; //initialize class Student
        this.size = size;
    }

    public void push(Student s){
        if(top < size){
            this.S[top] = s;
            System.out.println("\t :: Received "+S[top].giveSTD()+" into the stack. ::");
            top++;
        }
        else{
            System.out.println("Stack is overflows, Can not push another");
        }
            
    }

    public void pop(){
        System.out.println("POP : Top data >> "+S[top-1].giveSTD());
        S[top-1] = null ;
        top--;
    }

    public void peek(){
        System.out.println("Peek : Top data >> "+S[top-1].giveSTD());
    }

    public boolean isFull(){
        if(top < size)
            return false;
        else
            return true;
    }

    public boolean isEmpty(){
        if(S[0] == null)
            return true;
        else
            return false;
    }

    public void search(String fname){
        int time_not_fine=0;

        for(int i=top-1;i>=0;i--){
                if(fname.equals(S[i].giveF_name()))
                    System.out.println("\t>> "+fname+" is in the stack.");
                else if(S[i].giveF_name().equals(null))
                    time_not_fine++;
                else
                    time_not_fine++;
        }

        if(time_not_fine == size)
            System.out.println("\t>> Can not find "+fname+" in stack.");
    }

    public void displayAllStack(){
        System.out.println("Display the all data in stack. From top to bottom");
        for(int i=top-1;i>=0;i--)
            System.out.println("\t\t"+S[i].giveSTD());

        System.out.println();
    }

        public static void main(String[] args){
            int size=3;
            MyStack stack = new MyStack(size);
            System.out.println(" ::: There are "+ size +" block in my stack ::: \n");

            Student STD1 = new Student("632115011","Jeerasak","Tarat");
            Student STD2 = new Student("632115044","Aranya","Baramimahasan");
            Student STD3 = new Student("999999999","Mark","Key");
            Student STD4 = new Student("000000000","Always","Loser");
            Student STD5 = new Student("555555555","Joke","Forever");

            if(stack.isEmpty())
                    System.out.println("No data in stack");
                else
                    System.out.println("Stack has data as less one data in side.");

            stack.push(STD1);//invoke push(Student s); //first send data
            stack.push(STD2);//second send data
            stack.push(STD3);
            stack.push(STD4);
            stack.push(STD5);
            
                if(stack.isFull())
                    System.out.println("Stack is full, Can't push another.");
                else
                    System.out.println("Stack is not full, Can psuh another.");

            stack.displayAllStack(); //show all data in the stack.

            stack.peek();
            stack.pop();

            stack.displayAllStack();

            stack.peek();
                if(stack.isEmpty())
                    System.out.println("No data in stack");
                else
                    System.out.println("Stack has data as less one data in side.");

            stack.push(STD5);
            stack.displayAllStack();
            

            stack.peek();
            stack.displayAllStack();
            stack.search("S3"); // search first name which matches together.
            stack.search("Aranya");// search first name which matches together.

        }// out of main method

}

