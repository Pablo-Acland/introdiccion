import java.util.Scanner;

public class pantalla {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);

        millaKilometros milla= new millaKilometros();
        Par par= new Par();

        int b=0;
        int a;

        a = capture.nextInt();

        switch (a){
            case 1:
                    System.out.println("ingrese un entero\n");
                    b = capture.nextInt();

                    par.isPar(b);
                break;

            case 2:

                do {
                    System.out.println("ingrese cantidad de millas\n");
                    b = capture.nextInt();
                    if(b!=0){
                    milla.millasAKilometros(b);
                    }
                }while(b!=0);

                break;
        }
    }
}
