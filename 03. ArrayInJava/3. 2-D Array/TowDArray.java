class TowDArray{
    public static void main(String args[]){
        
        //int a[][] = new int[3][2];
        //a[0][0] = 5;
        //a[0][1] = 2;
        //a[1][0] = 8;
        //a[1][1] = 2;
        //a[2][0] = 9;
        //a[2][1] = 4;

        int a[][] = {{5,2}, {8,2}, {9,4}};
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}