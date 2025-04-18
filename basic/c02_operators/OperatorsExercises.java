package basic.c02_operators;

/*
Clase 2 - Comentarios, Variables, Constantes, Tipos de datos y Operadores (09/04/2025)
Vídeo: https://www.twitch.tv/videos/2428998601
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 10;
        int b = 2;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // 2. Crea una variable para cada tipo de operación de asignación.
        int c, cSum, cDifference, cProduct, cQuotient, cRemainder;
        c = 13;
        System.out.println(c);
        cSum = c;
        cSum += 2;
        System.out.println(cSum);
        cDifference = c;
        cDifference -= 3;
        System.out.println(cDifference);
        cProduct = c;
        cProduct *= 2;
        System.out.println(cProduct);
        cQuotient = c;
        cQuotient /= 2;
        System.out.println(cQuotient);
        cRemainder = c;
        cRemainder %= 2;
        System.out.println(cRemainder);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        boolean firstComparison = cProduct > cQuotient;
        boolean secondComparison = c >= (a + b);
        boolean thirdComparison = cProduct == (c * 2);

        System.out.println(firstComparison);
        System.out.println(secondComparison);
        System.out.println(thirdComparison);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        boolean fourthComparison = cProduct < cQuotient;
        boolean fifthComparison = c <= (a + b);
        boolean sixthComparison = cProduct != (c * 2);

        System.out.println(fourthComparison);
        System.out.println(fifthComparison);
        System.out.println(sixthComparison);

        // 5. Utiliza el operador lógico and.
        boolean andComparison = cProduct < cQuotient && c <= (a + b);
        System.out.println(andComparison);

        // 6. Utiliza el operador lógico or.
        boolean orComparison = cProduct > cQuotient || c <= (a + b);
        System.out.println(orComparison);

        // 7. Combina ambos operadores lógicos.
        boolean comparison = cProduct > cQuotient || c <= (a + b) && true;
        System.out.println(comparison);

        // 8. Añade alguna negación.
        boolean notComparison = cProduct > cQuotient || c <= (a + b) && !true;
        System.out.println(notComparison);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(-c);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean mixComparison = a + b == +c || !(c - b == a);
        System.out.println(mixComparison);
    }
}
