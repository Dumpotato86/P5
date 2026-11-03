import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selec=0;
        do{
            System.out.print("""
                    Menu de prueba
                    ----------------
                    pulse 2 para salir
                    : 
                    """);
            selec = sc.nextInt();
        }while(selec != 2);
    }
}