public class ch5_5_7 {
    public static void main(String args[]){
        float currentTuition = 10000;
        for(int x = 0; x<10; x++){
            currentTuition += 0.05 * currentTuition;
        }
        System.out.println("In ten years tuition will cost $" + currentTuition);
        System.out.println("The cost for four years of school in ten years will be $" + 4*currentTuition);
    }
}