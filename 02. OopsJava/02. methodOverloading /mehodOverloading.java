class cal{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, double n2){
        return n1+n2;
    }

}

class mehodOverloading{
     public static void main(String args[]){
        cal obj = new cal();
        int result = obj.add(2, 3);
        int result1 = obj.add(2,3,4);
        double res = obj.add(2,4);
        System.out.println(result1);
        System.out.println(result);
        System.out.println(res);
    }
}