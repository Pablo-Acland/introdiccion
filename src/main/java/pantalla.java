import java.util.Scanner;


public class pantalla {
    public static void menu(){
        System.out.println( "Seleccione uno de los trabajos\n"+
                            "#########################\n" +
                            "# 1-Is Par              #\n" +
                            "# 2-Millas a kilometros #\n" +
                            "# 3-Calculo de sueldo   #\n" +
                            "# 0-salir               #\n"+
                            "#########################");
    }
    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);

        millaKilometros milla= new millaKilometros();
        Par par= new Par();
        sueldos suel= new sueldos();

        int b=0;
        int a;


        do {
            menu();
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

                case 3:
                    suel.calculeSueldo();
                    break;
            }
        }while (a!=0);

    }
}
