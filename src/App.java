import App.Pneu;
import java.util.Scanner;


public class App {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        

        System.out.println("Digite a marca:");
        String M1 = sc.nextLine();
        System.out.println("Digite o material:");
        String M2 = sc.nextLine();
        System.out.println("Digite o raio:");
        float M3 = sc.nextFloat();

        float M4, M5;
        M5=(float) 3.14159265;
        M4= M3*M3*M5;

        Pneu c1 = new Pneu();
        c1.setMarca(M1);
        c1.setMaterial(M2);
        c1.setRaio(M3);
        c1.setArea(M4);
        
        System.out.println("MARCA: " + c1.marca);
        System.out.println("MATERIAL: " + c1.material);
        System.out.println("RAIO: " + c1.raio);
        System.out.println("AREA: " + M4);

    }
}
