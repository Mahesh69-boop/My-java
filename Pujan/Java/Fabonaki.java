public class Fabonaki {
    public static int fabonacki(int k){
        if(k<=2) return 1;
        return fabonacki(k-1)+fabonacki(k-2);
    }
    public static void main(String[] args) {
        
    }
    
}
