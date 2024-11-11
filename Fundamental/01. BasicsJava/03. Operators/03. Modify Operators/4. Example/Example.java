class Example{
    public static void main(String args[]){

        //Example :- 1
        int a = 5;
        int b = a++ + ++a + --a;
        System.out.println(a);
        System.out.println(b);

        //Example :- 2 
        int m = 5;
        int n = m++ + ++m + ++m + m++ + --m + m--;
        System.out.println(m);
        System.out.println(n);
    }
}