class Reverse {
    public static void main(String[] args) {
        int num = 13124456;
        int rev = 0;
        int temp = num;
        while(temp!=0){
            rev = rev*10 + (temp%10);
            temp = temp/10;
        }
        System.out.println("The reverse no is " + rev);

    }
}