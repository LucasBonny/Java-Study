import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        printFibonacci(5);
        printFibonacci(9);
        printFibonacci(15);
        
    }
    public static void printFibonacci(int n){
        Scanner sc = new Scanner(System.in);
        int ant = 0;
        int  atual = 1;
        System.out.print("[");
        for(int i = 0; i < n; i ++){
            if(i == n -1){
                int res = ant + atual;
                System.out.print(res);
                ant = atual ;
                atual = res;
                System.out.println("]");
                return;
            }
            int res = ant + atual;
            System.out.print(res);
            ant = atual ;
            atual = res;
            System.out.print(", ");
        }
    }
}
