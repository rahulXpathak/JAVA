class mul{
    public int mul(int a, int b){
        int result = a * b;
        return result;
    }
    public int mul(int a, int b, int c){
        int result = a * b * c;
        return result;
    }
    public double mul(double a, double b){
        double result = a * b;
        return result;
    }
    
}


class moverloading{
    public static void main(String[] args) {
        mul obj = new mul();  
        double result = obj.mul(2.5, 3.5);
        System.out.println(result);

    }
}