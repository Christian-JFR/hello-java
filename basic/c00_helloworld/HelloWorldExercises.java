package basic.c00_helloworld;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Christian");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hello\nWorld");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.
        /*
         * Multiline
         * ...
         * Comment
         * ...
         */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Age: 37 | color: black | city: Kioto");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("ALERT: Temperature is 42°C - too high!");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("\"You really");
        System.out.println("gotta ask yourself...");
        System.out.println("What do you wanna be?");
        System.out.println("A legend...");
        System.out.println("Or a pile of bodies?\"");
        System.out.println("- David Martinez, Cyberpunk: Edgerunners");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("(=｀ω´=)");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        /*
         * No se puede ejecutar la clase
         * HelloWorldExercises directamente
         */

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        /*
         * el nombre del archivo debe coincidir con el nombre de la clase
         * porque es public
         * */

    }
}