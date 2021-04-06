package lab2;

public class DATA_STD {

    boolean check = true;

    private String SID;
    private String f_name;
    private String l_name;

        public DATA_STD(String SID,String f_name,String l_name){
        this.SID = SID;
        this.f_name = f_name;
        this.l_name = l_name;
        }

    public String toString(){
        
        
        return this.SID + " " + this.f_name + " " + this.l_name;
    }
}

