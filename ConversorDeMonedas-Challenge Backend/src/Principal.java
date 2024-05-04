import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner seleccion = new Scanner(System.in);
        Scanner cantidad = new Scanner(System.in);
        ExchangeAPI consulta = new ExchangeAPI();


        int opcion = 0;
       while (opcion!=7) {

           System.out.println("Bienvenido al Conversor de Monedas, porfavor selecciona la opción que desees: ");

           System.out.println("Menú");
           System.out.println("1.-Dolar a Peso MXN");
           System.out.println("2.-Peso MXN a Dolar");
           System.out.println("3.-Euro a Peso MXN");
           System.out.println("4.-Peso MXN a Euro");
           System.out.println("5.-Dolar a Euro");
           System.out.println("6.-Euro a Dolar");
           System.out.println("7.-Salir");

           opcion = cantidad.nextInt();

           switch (opcion) {

               case 1:
                   System.out.println("Digite la cantidad en dolares que desea convertir a pesos mxn");
                   System.out.println("Su Resultado es: " + cantidad.nextBigDecimal().divide(consulta.conversion("MXN").getConversionRate("USD"), 2, RoundingMode.HALF_UP)+" pesos mxn");



                   break;
               case 2:
                   System.out.println("Digite la cantidad en pesos mxn que desea convertir a dolares");

                   System.out.println("Su Resultado es: " + cantidad.nextBigDecimal().divide(consulta.conversion("USD").getConversionRate("MXN"), 2, RoundingMode.HALF_UP)+" dolares");

                   ;
                   break;
               case 3:

                   System.out.println("Digite la cantidad en euros que desea convertir a pesos mxn");

                   System.out.println("Su Resultado es: " + cantidad.nextBigDecimal().divide(consulta.conversion("MXN").getConversionRate("EUR"), 2, RoundingMode.HALF_UP)+ " pesos mxn");

                   break;
               case 4:
                   System.out.println("Digite la cantidad en pesos mxn que desea convertir a euros");

                   System.out.println("Su Resultado es: " + cantidad.nextBigDecimal().divide(consulta.conversion("EUR").getConversionRate("MXN"), 2, RoundingMode.HALF_UP)+ " euros");

                   break;
               case 5:
                   System.out.println("Digite la cantidad en dolares que desea convertir a euros");

                   System.out.println("Su Resultado es: " + cantidad.nextBigDecimal().divide(consulta.conversion("EUR").getConversionRate("USD"), 2, RoundingMode.HALF_UP)+" euros");

                   break;
               case 6:
                   System.out.println("Digite la cantidad en euros que desea convertir a dolares");

                   System.out.println("Su Resultado es: " + cantidad.nextBigDecimal().divide(consulta.conversion("USD").getConversionRate("EUR"), 2, RoundingMode.HALF_UP)+" dolares");
                   break;




           }

       }
        System.out.println("Muchas Gracias, Vuelva Pronto!");

    }
}
