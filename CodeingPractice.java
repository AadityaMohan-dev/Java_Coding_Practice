import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CodeingPractice {
    public static void main(String[] args) {
        
        int num = 12;
        String p = "cbbabbc";
        int P = 121;
        String s = "hello";

        //String Reverse
        System.out.print(reverse(s)+"\n");

        //prime number
        System.out.print(isPrime(num)+"\n");
        System.out.print(primeNum(num)+"\n");

        // //Palindrom
        System.out.print(isPalindrom(p)+"\n");
        System.out.print(isPalindromNum(P)+"\n");

        // //Fabonacci Series
        System.out.print(fabonnaciSeries(num)+"\n");

        // Star Pyramid pattern
        // System.out.println(pyramidPattern(int 10));

        // Check two arrays contains same elements or not .
        Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(sameElements(a1, a2));
		System.out.println(sameElements(a1, a3));

        //anagrams check ?
        String [] s1 = {"a","b","c"};  
        String [] s2 = {"b","c","a"}; 
        String [] s3 = {"d","b","c"};
        System.out.println(anagrams(s1, s2));      
        System.out.println(anagrams(s1, s3));

        //factorial
        int n = 5;
        System.out.println(fac(n));

        //swaping
        int a = 1;
        int b = 2;
        swap(a,b);
    }
    public static String reverse(String s){
        StringBuilder output = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i >=0; i--){
            output.append(chars[i]);
        }
        return output.toString();
    }

    public static String isPrime(int n){
        if(n==0 || n==1){
            return "Given Number is not prime.";
        }
        if(n==2){
            return "Given Number is Prime.";
        }
        for(int i = 2; i<=n/2; i++){
            if(n%i ==0){
                return "Given Number is not Prime";
            }
        }
        return "Given Number is Prime Number";
    }

    public static ArrayList<Integer> primeNum(int n){
        int count = 0 ;
        int num = 2;

        ArrayList<Integer> out = new ArrayList<>();
        while(count != n){
            for(int i = 2 ; i <=n/2; i++){
                if(num%i == 0){
                    num = num + 1;
                }
                else{
                    out.add(num);
                    num = num + 1;
                    count = count + 1;
                }
            }
        }
        return out;
        }


        public static String isPalindrom(String s){
            if(s.length() == 1){
                return "Given String is Palindrome String";
            }
            for(int i = 0 ; i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(s.length()-i-1)){
                return "Given String is Palindrome String";
            }
            }
            
            return "Given String is not Palindrome String";
        }
         public static String isPalindromNum(int number){
            String s = Integer.toString(number);
            if(s.length() == 1){
                return "Given String is Palindrome String";
            }
            for(int i = 0 ; i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(s.length()-i-1)){
                return "Given String is Palindrome String";
            }
            }
            
            return "Given String is not Palindrome String";
        }

        public static ArrayList<Integer> fabonnaciSeries(int n){
            int a = 0;
            int b = 1;
            int c = 1;
            ArrayList<Integer> out = new ArrayList<>();

            for(int i = 0 ; i < n ; i++){
                out.add(a);
                a = b ;
                b = c; 
                c = a + b;
            }

            return out;
        }

        public static boolean sameElements(Object[] a ,Object[] b){

            Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(a));
		    Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(b));

            if(uniqueElements1.size() != uniqueElements2.size())  return false;
            for (Object obj : uniqueElements1) {
                if (!uniqueElements2.contains(obj)) return false;
            }
             return true;
        }

        private static boolean anagrams(String[] s1, String[] s2){
            if(s1.length != s2.length) return false;
            for(String s : s1 ){

            }
            return true;
        }

        // Facorial
        public static int fac(int n){
            int res = 1;
            for(int i = n; i>0; i--){
                res = res * i;
            }
            return res;
        }

        //Swaping
        public static void swap(int a , int b){
            System.out.println("before Swap a = "+ a + " and b = "+ b);
            int c = a;
            a = b;
            b = c;
            System.out.println("After Swap a = "+ a + " and b = " + b); 
        }

    }
