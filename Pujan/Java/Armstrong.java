public class Armstrong {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(Math.pow(i, 1)==i){
                System.out.print(i + " ");
            }
        }
        for(int i=10; i<100; i++){
            int tens= i/10;
            int ones = i%10;
            if(Math.pow(tens,2)+Math.pow(ones,2)==i){
                System.out.print(i + " ");
            }
        }
        for(int i =100; i<1000; i++){
            int Hundred=i/100;
            int tens=(i/10)%10;
            int ones=i%10;
            if(Math.pow(Hundred,3)+ Math.pow(tens,3)+ Math.pow(ones,3)== i){
                System.out.print(i + " ");
            }
        }
    }
    
}
