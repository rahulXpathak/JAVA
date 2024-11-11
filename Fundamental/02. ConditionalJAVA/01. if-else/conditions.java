class conditions{
    public static void main(String args[]){
        //int age = 18;
        //if(age >= 18 && age < 60){
           // System.err.println("You're an adult");
        //}
        //else if(age >= 60){
            //System.out.println("You're an old");
        //}
        //else{
            //System.out.println("You're still a kid");
        //}




        //Nested if-else:-


        int age = 18;
        if(age >= 18 &&  age < 60){
            if(age > 20 && age < 30){
                System.out.println("You're in 20's");
            }
            else if(age >= 30 && age <= 40){
                System.out.println("You're in 30's");
            }
            else{
                System.out.println("You are not 20's and 30's");
            }
        }
        else if ( age >= 60){
            System.out.println("You're an old");
        }
        else{
            System.out.println("You're an tenager");
        }
    }
}