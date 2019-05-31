public class Jumps_in_loops {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=10; i++)
        {
            if(i==5)
            {
                continue;//ager yahan break lagon to value 10 tk jy gi
            }
            System.out.println(i);
        }
    }
}
