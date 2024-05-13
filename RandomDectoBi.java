package Exercise;
class RandomDectoBi{
    public static String D2B(int m){
        int quotient = m;
        int remainder;
        String digitRemain = "";
        while(quotient > 0){
            remainder = quotient%2;
            quotient /= 2;
            digitRemain = remainder + digitRemain;
        }
        return digitRemain; // convert str to int for display only
    }

    public static int B2D(String n){
        int power = 0;
        int sum = 0;
        for(int i = n.length()-1; i>=0; i--){   // loop reverse text
            if(n.charAt(i) == '1') sum += Math.pow(2, power);
            power++;
        }
        return sum;
    }

    public static void bubbleSort(){

    }

    public static void main(String[] args) {
        final int decimalNum = 129;
        String outputBi = D2B(decimalNum);
        int outputDec = B2D(outputBi);

        System.out.printf("From decimal: {%d} Transfer to Binary: {%s}\n",decimalNum, outputBi);
        System.out.printf("From Binary: {%s} Transfer to decimal: {%d}\n",outputBi, outputDec);
    }
}