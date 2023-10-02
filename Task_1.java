class Task_1 {  
    public static void main (String[] args) {
        System.out.println(evenOddNumber(8));
        System.out.println(evenOddNumber(9));
    }

/*
*Задание 1.
Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число 
четным или нечетным. (код приложен в презентации)
*/
    public static Boolean evenOddNumber (int number) {
        return number % 2 == 0;
    }

/* 
Задание 2.
Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное 
число в интервал (25;100). (код приложен в презентации)
 */
    public static Boolean numberInInterval (int number) {    
        return number >= 25 && number < 100;
    }

}