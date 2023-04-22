class Palindrome{
    public static void main(String[] args){
        int num = 2332;
        int rev = 0;
        int temp = num;
        while(temp !=0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if (num == rev){
            System.out.println("it is a palindrome no");
        }
        else{
            System.out.println("it is not palindrome no");
        }
    }
}