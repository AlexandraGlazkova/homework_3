public class Main {
    //Задача 1
    //Объявите переменную clientOS, которая равна 0 или 1. Где 0 — iOS, 1 — Android.
    //При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
    //Например, для iOS оно будет звучать так:
    //«Установите версию приложения для iOS по ссылке».
    //А для Android так:
    //«Установите версию приложения для Android по ссылке».
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
    }

    private static void task1() {
        int clientOS = 0;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}
