package Practice.lesson8;

public class Task1 {
    public static void main(String[] args) {

        String st = "0";
        long m = System.currentTimeMillis();
        for (int i = 1; i<=20000; i++) {
            st += " " + i;
        }
        //st = st+20000;
        System.out.println(st);
        System.out.println(System.currentTimeMillis() - m);


        StringBuilder sb = new StringBuilder("0");
        m = System.currentTimeMillis();
        for (int i = 1; i<=20000; i++) {
            // st= st + " " + i;
            sb.append(" ").append(i);
        }
        //st = st+20000;
        System.out.println(sb.toString());
        System.out.println(System.currentTimeMillis() - m);
    }
}
