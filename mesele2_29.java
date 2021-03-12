public class mesele2_29 {
    public static void main(String[] args){
            char[] cArr = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '+', '/', ' '};
    
            for(char c : cArr){
                printResults(c);
            }
        }
        // print results
        private static void printResults(char c){
            System.out.printf("The character %c has the value of %d\n", c, ((int) c));
        }
    }
    
