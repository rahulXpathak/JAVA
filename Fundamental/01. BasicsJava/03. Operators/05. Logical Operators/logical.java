class logical{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a == b && a>b && a<b && b>c); //and operator
        System.out.println(a < b || b<c || a>b || a>c); //or operator
        System.out.println(a != b ); //NOT operator 
    }
}