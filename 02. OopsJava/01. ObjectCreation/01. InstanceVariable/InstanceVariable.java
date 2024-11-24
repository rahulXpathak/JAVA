class InstanceVariable{
    int a=2; //That are instance variable, instance variable create on when object is create 
    String name = "Rahul";
    public static void main(String[] args) {
        int num = 5; //that are local variable of main(primitive)
        InstanceVariable obj = new InstanceVariable(); //that are local variable of main(non-primitive or reference)

        System.out.println(obj.name);
        System.out.println(obj.a);
    }
}