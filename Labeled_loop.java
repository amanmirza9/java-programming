public class Labeled_loop {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=10; i++)
        {
            System.out.println("");
            if(i==6)
            {
                break;
            }
            for(j=1; j<=5; j++)
            {
                System.out.println("*");
                if(i==j)
                {
                    continue;
                }
            }
        }
    }
}
