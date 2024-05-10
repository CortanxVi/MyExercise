package newest;
class DectoBi{
    public static void main(String[] args) {
        final int decimalNum = 9;
        int quotient = decimalNum;
        int remainder;
        String digitRemain = "";

        while(quotient > 0){
            remainder = quotient%2;
            quotient /= 2;
            digitRemain = remainder + digitRemain;
        }
        System.out.printf("From decimal: %d \nTransfer to Binary: %s",decimalNum, digitRemain);
    }
}