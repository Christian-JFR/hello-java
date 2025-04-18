package basic.c01_beginner;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Christian";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 37;

        // 3. Crea una variable double con tu altura en metros.
        double myHeight = 1.77;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likesProgramming = true;

        // 5. Declara una constante con tu email.
        final String myEmail = "zerolf@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'C';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myLocation = "Colombia";
        System.out.println(myLocation);
        myLocation = "Japan";
        System.out.println(myLocation);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 7;
        int b = 6;

        System.out.println("a + b = " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("variable 'myLocation' is type: " + myLocation.getClass().getSimpleName());
        System.out.println("variable 'a' type: int");

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String myHexColor;
        myHexColor = "#010203";
        System.out.println(myHexColor);
    }
}
