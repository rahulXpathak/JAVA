class Ternary1{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int num = (a<b)? (a < c? a : b): (b < c? b : c);
        System.out.println(num);
    }
}