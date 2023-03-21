package week7homework;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Pgrm20SpecificValueArray {
    public static void main(String[] args) {
        Pgrm20SpecificValueArray obj = new Pgrm20SpecificValueArray();
        obj.checkValue();
    }
    public void checkValue(){
        int [] s = { 22,13,9,25,5,2};
        int toCheckValue = 13;
        for(int num : s){
            if(num==toCheckValue){
                System.out.println("Given array contains " + toCheckValue );
        }
        }
    }
}
