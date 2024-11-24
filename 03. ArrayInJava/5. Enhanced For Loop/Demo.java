class Demo{
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4};
        //for(int a : arr){
            //System.out.println(a);
        
            int arr[][] = {
                {5,3,4,8},
                {1,5},
                {2,1,5,}
            };
            for(int a[] : arr){
                for(int b : a){
                    System.out.print(b + " "); 
                }
                System.out.println();
            }

    }

}
