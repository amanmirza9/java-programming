
public class cards {
    public static void main(String[] args) {
        /*int[] deck = new int[52];
        String[] suit = {"Spades","Hearts","Diamonds","Clubs"};
        String[] pick = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for(int i = 0; i < deck.length; i++)
            deck[i] = i;
        for(int i = 0; i < deck.length; i++) {
            int a = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[a] = deck[a];
            deck[a] = temp; }
        for(int i = 0; i < 4; i++)
        {
            String s = suit[deck[i]/13];
            String p = pick[deck[i] %13];
            System.out.println("Card number "+ deck[i] + ": " + p+ " of is "+s); }*/
        int i;
        double[] temp=new double[356];
        for(i=0; i<=365; i++) {
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name pakistan" + temp[i]);}
            { temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name saudia arab" + temp[i]);

            }
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name denmark" + temp[i]);
            }
            {temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name nepal" + temp[i]);}
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name saudia arab" + temp[i]);
            }
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name maldives" + temp[i]);
            }
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name bangladesh" + temp[i]);
            }
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name jordan" + temp[i]);
            }
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name iran" + temp[i]);
            }
            {
                temp[i] = 10 + (int) (Math.random() * 35);
                System.out.println("country name australia" + temp[i]);
            }
            System.out.println("=======");
            float sum=0;
            sum+=temp[i]/10;
            System.out.println("sum is"+sum);
        }















    }
    }
