class jagged{
    public static void main(String[] args) {
        int a[][] = {
            {5,2,3,6},
            {8,3},
            {9,4,8}
        };
        for(int i=0; i<3; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}