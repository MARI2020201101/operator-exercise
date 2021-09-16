package operator;


public class Exercise {

    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = (int) Math.ceil(numOfApples/(sizeOfBucket*1.0));
        System.out.println("필요한 바구니의 수 : "+numOfBucket);
    }
}
