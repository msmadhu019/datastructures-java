public class Power {
    public static void main(String[] args) {
        int base = 3 ;
        int exp = 10;
        System.out.println(powerValue(base, exp));
    }

    public static int powerValue(int base, int exp){
        if (exp == 0) {
            return 1;
        }
        return base * powerValue(base, exp-1);
    }
}
