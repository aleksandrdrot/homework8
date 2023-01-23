public class Main {
    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,3};
        double [] nums2 = {1.57, 7.654, 9.986};
        char [] symbol = new char[]{'a','b','c','d','e'};
        nums(nums1);
        nums(nums2);
        nums(symbol);
        numsReverse(nums1);
        numsReverse(nums2);
        numsReverse(symbol);
        task1(nums1);
    }
    public static void nums (int[] mas){
        for (int i = 0; i < (mas.length - 1); i++){
            System.out.print(mas[i]+", ");
        }
        System.out.print(mas[mas.length-1]+" \n");
    }
    public static void nums (double[] mas){
        for (int i = 0; i < (mas.length - 1); i++){
            System.out.print(mas[i]+", ");
        }
        System.out.print(mas[mas.length-1]+" \n");
    }
    public static void nums (char[] mas){
        for (int i = 0; i < (mas.length - 1); i++){
            System.out.print(mas[i]+", ");
        }
        System.out.print(mas[mas.length-1]+" \n");
    }

    //reverse
    public static void numsReverse (int[] mas){
        for (int i = (mas.length-1); i >= 1; i--){
            System.out.print(mas[i]+", ");
        }
        System.out.print(mas[0]+" \n");
    }
    public static void numsReverse (double[] mas){
        for (int i = (mas.length-1); i >= 1; i--){
            System.out.print(mas[i]+", ");
        }
        System.out.print(mas[0]+" \n");
    }
    public static void numsReverse (char[] mas){
        for (int i = (mas.length-1); i >= 1; i--){
            System.out.print(mas[i]+", ");
        }
        System.out.print(mas[0]+" \n");
    }

    public static void task1 (int[] mas){
        for (int i = 0; i < (mas.length - 1); i++){
            if (mas[i] % 2 != 0){mas[i] = mas[i]+1;}
            System.out.print(mas[i]+", ");
        }
        if (mas[mas.length-1] % 2 != 0){mas[mas.length-1] = mas[mas.length-1]+1;}
        System.out.print(mas[mas.length-1]+" \n");
    }
}