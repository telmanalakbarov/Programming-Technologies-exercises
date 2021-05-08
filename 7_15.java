public class 7_15{
    public static void main(String[] args){
        int length;
        if(args.length<1) length = 10;
        else length = Integer.parseInt(args[0]);
        int[] array = new int[length];
        System.out.printf("%s%8s%n","Index","Value");
        for (int counter = 0; counter < array.length; counter++)
        System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}