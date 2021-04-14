package arnav;

public class ArnavRecursion {

    // takes the number that one inputs from 1-50 and adds it up.
    //After that, it takes the number and then it adds it up from 1 to the provided number
    public static void main (String [] args ) {

        System.out.println("Which numebr would you like to count backwards from and then add up all together from 1-50?");

            backwards(12);
    }
        public static void backwards(int n) {

        if (n==0){

            System.out.println("Is that all you got, come on, you can do better than that");

        }
            else {
                System.out.println(n);
                n--;

                backwards(n);
        }


    }


}
