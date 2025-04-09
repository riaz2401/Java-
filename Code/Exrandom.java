import java.util.Random;
class Exrandom{
    public static void main(String[] args){
        Random r = new Random();
        for(int i=1; i<=10; i++){
        int x = r.nextInt(100);         
        System.out.print(x+" ");    
        }
    }
}