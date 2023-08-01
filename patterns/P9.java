class P9{
    public static void main(String args[]){
        int orignalNo = 12345 , sum =0 ;
        int reverseNo = 0;
        int newNumber = orignalNo;
        while(newNumber>0)
        {
            int remainder = newNumber%10;
            reverseNo = reverseNo*10 + remainder;
            sum = (sum + remainder);
            newNumber = newNumber/10;
        }

        System.out.println(reverseNo);
        System.out.println(sum/5);
    }
}