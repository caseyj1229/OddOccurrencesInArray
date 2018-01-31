//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class OddOccurrences {
    public static int Solution(int[] A){
        if(A.length%2 == 0){
            //If Array Length is even, return 0
            return 0;
        }
        int result = 0;
        //XOR the value in the Array to check if value is singular
        for(int i = 0; i<A.length;i++){
            result ^= A[i];
        }
        return result;
    }
}
