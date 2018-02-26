public class tenEvensArray {
    public static void main(String args[]){
        int counter = 0;
        int[] firstTenEvens = new int[10];
        int n = 1;

        do{
            if(n % 2 == 0){
                firstTenEvens[counter] = n;
                counter += 1;
            }
            n += 1;
        } while (counter < 10);

        String outString = "";

        for(int i : firstTenEvens){
            outString += i + " ";
        }

        System.out.println(outString);
    }
}