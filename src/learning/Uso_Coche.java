package learning;

/**
 * Created by mongoDB on 01/05/2018.
 */
public class Uso_Coche {

    public static void main(String[] args) {
        Coche Renault = new Coche();


        // Renault.largo = 3000; -- Esto no es permitido, esta encapsulado con private

        //System.out.println(Renault.dime_largo());
        Renault.establece_color();
        System.out.println(Renault.dime_color());
    }

}
