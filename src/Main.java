public class Main {
    public static void main(String[] args) {
    }
    //zadanie 1
    public static int[] evenOdd(int[] nums) {
        int hold;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                for(int j=i;j<nums.length;j++){
                    if(nums[j]%2==0){
                        hold=nums[j];
                        nums[j]=nums[i];
                        nums[i]=hold;
                    }
                }
            }
        }
        return nums;
    }
//zad 2
    public static int[] zeroFront(int[] nums) {
        int hold;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=0;j<i;j++){
                    if(nums[j]!=0){
                        hold=nums[j];
                        nums[j]=nums[i];
                        nums[i]=hold;
                    }
                }
            }
        }
        return nums;
    }

//zad 3
public static int[] squareUp(int n) {
    int[] arr =new int[n*n];
    for(int i=0;i<n;i++){
        for(int j=n;j>0;j--){
            if(j<=(i+1)){
                arr[n*i+n-j]=j;
            }
            else arr[i+n-j]=0;
        }
    }
    return arr;
    }
//zad 4
public static int[] fix45(int[] nums) {
    int hold;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 5) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 4) {
                    hold = nums[j + 1];
                    nums[j + 1] = nums[i];
                    nums[i] = hold;
                }
            }
        }
    }
    return nums;
}
    //zad 5
    public static String repeatEnd(String str, int n) {
        char[]  stringAsChar=str.toCharArray();
        char[] newCharArray = new char[n*n];
        for(int j=0;j<n;j++){
            for(int i=stringAsChar.length-n;i<stringAsChar.length;i++){
                newCharArray[i-(stringAsChar.length-n)+j*n]=stringAsChar[i];
            }
        }
        String str2=new String(newCharArray);
        return str2;
    }
    public void all(){
        System.out.println("HELOOOOOOOOO");
    }
    //zad6
    public static boolean xyzMiddle(String str) {
        int start=0;
        while(str.indexOf("xyz", start)!=-1){
            int num_left = str.indexOf("xyz",start);
            int num_right = str.length()-(num_left+3);
            int value = Math.abs(num_left-num_right);
            start=num_left+3;
            if(value<=1){
                return true;
            }
        }
        return false;
    }
    //zad7
    public static String mixString(String a, String b) {
        char[] newCharArray = new char[a.length()+b.length()];
        char[] aChar=a.toCharArray();
        char[] bChar=b.toCharArray();
        int i=0;
        int j=0;
        while(i<aChar.length&&j<bChar.length){
            newCharArray[i+j]=aChar[i];
            i++;
            newCharArray[i+j]=bChar[j];
            j++;
        }
        while(i<aChar.length){
            newCharArray[i+j]=aChar[i];
            i++;
        }
        while(j<bChar.length){
            newCharArray[j+i]=bChar[j];
            j++;
        }
        String str2=new String(newCharArray);
        return str2;
    }
    //zad 8
    public static boolean closeFar(int a, int b, int c) {
        if(((Math.abs(a-b)<=1||Math.abs(a-c)<=1)&&(Math.abs(a-b)>=2||Math.abs(a-c)>=2))&&(Math.abs(b-c)>=2)){
            return true;
        }
        return false;
    }
    //zad9
    public static int luckySum(int a, int b, int c) {
        int sum=0;
        if(a==13){
            if(b!=13&&a!=13)sum+=c;
        }
        else if(b==13){
            sum+=a;
        }
        else if(c==13){
            sum=a+b;
        }
        else{
            sum=a+b+c;
        }
        return sum;
    }
    //zad10
    public static int array667(int[] nums) {
        boolean flag=false;
        int count = 0;
        for(int num:nums){
            if((num==6||num==7)&&flag==true){
                count++;
                if(num==7)flag=false;
            }
            else if(num==6)flag=true;
            else flag=false;
        }
        return count;
    }
}