package by.it.sc02_morning.sinitsyna.lesson05;

/*
Выведите на экран в цикле 10 раз фразу
Я изучаю программирование.

при  выводе сделайте такое разветвление в теле цикла,
чтобы вместо 3-й и 9-й по счету фраз выводилась фраза
Меня интересует высокая зарплата!

Должнен получиться следующий вывод строк:

Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.



 */
public class TaskA1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==2 || i==8) {
                System.out.println("Меня интересует высокая зарплата!");
                continue;
            }
            System.out.println("Я изучаю программирование.");
        }
    }

}
