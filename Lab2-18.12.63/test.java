public class test {
    public static void main(String[] args) {
        int x=1;
        int y=2, count=1;

        while(y>=8){
            System.out.println("start iteration "+ count);
            System.out.println(" x : "+x+"\ty : "+y);
            x = x*y;
            y++;

            System.out.println("after iteration "+ count);
            System.out.println(" x : "+x+"\ty : "+y);
            count++;
        }

    }
    
}
