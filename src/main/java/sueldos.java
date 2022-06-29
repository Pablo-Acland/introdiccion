import java.util.Locale;
import java.util.Scanner;

public class sueldos {

    public void calculeSueldo(){
        Scanner capture = new Scanner(System.in);


        int basico, hijos, bono=0;
        String area;

        System.out.println("ingrese sueldo basico\n");
        basico = capture.nextInt();
        System.out.println("ingrese Area\n");
        area = capture.next();
        System.out.println(area);
        System.out.println("ingrese cantidad de Hijos\n");
        hijos = capture.nextInt();
        switch (area){

            case "sistemas":
                       bono= basico+((basico*25)/100);
                        if(hijos>=2){
                            bono= bono+(hijos*150);
                        }
                System.out.println("El sueldo con el bono es :"+bono+"\n");
                break;
            case "contabilidad":
                bono= basico+((basico*20)/100);
                if(hijos>=2){
                    bono= bono+(hijos*150);
                }
                System.out.println("El sueldo con el bono es :"+bono+"\n");
                break;
            default:
                bono= basico+((basico*10)/100);
                if(hijos>=2){
                    bono= bono+(hijos*150);
                }
                System.out.println("El sueldo con el bono es :"+bono+"\n");
                break;
        }


    }


}
