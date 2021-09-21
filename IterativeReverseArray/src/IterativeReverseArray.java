
public class IterativeReverseArray {
    public int[] IterativeReverse(A,i.j){
        while i < j{
            int aux = A[i];
            A[i] = A[j];
            A[j] = aux;
            i+=1;
            j+=1;
        }
        return A;
    }
}