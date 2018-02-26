public class StudentArray {
    public static void main(String args[]){
        int[] gradesNumericArr = new int[10];
        System.out.println(gradesNumericArr);

        boolean[] gradesPassFailArr = new boolean[10];
        System.out.println(gradesPassFailArr[4]);

        String[] studentArr = new String[10];
        System.out.println(studentArr[4]);

        studentArr[4] = "Abe";

        System.out.println(studentArr[4]);
    }
}