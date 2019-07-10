public class temperature {
    public static void main(String[] args) {
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
}}
