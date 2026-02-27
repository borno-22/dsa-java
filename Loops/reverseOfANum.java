public class reverseOfANum {
    public static void main(String[] args) {
        int num=12342,rev=0;
        while(num>0){
            int lastDigit=num%10;
            rev=(rev*10)+lastDigit;
            num /=10;
        }
        System.out.println(rev);
    }
}
