public class Main {
    public static void main(String[] args) {
        System.out.println("-- 1 task --");

        System.out.println("Оператор циклу for");
        for(int i = 500; i <= 650; i += 10){
            System.out.println(i);
        }

        System.out.println("Оператор циклу while");
        int i = 490;
        while(i < 650){
            System.out.println(i += 10);
        }

        System.out.println("Оператор циклу do-while");

        i = 490;
        do{
            System.out.println(i += 10);
        } while (i < 650);

        System.out.println("-- 2 task --");

        for(int a = 2; a < 5000; a=2*a-1){
            System.out.println(a);
        }

        System.out.println("-- 3 task --");

        int number = 10;
        for (i = 1; i <= number; i++) {
            if (number % i == 0 && i > 0) {
                System.out.println(i);
            }
        }

        System.out.println("-- 4 task --");

        int n = 10; // число, факторіал якого необхідно обчислити
        int factorial = 1;

        for (i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факторіал числа " + n + " дорівнює " + factorial);

        n = 10;
        i = 1;
        factorial = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Факторіал числа " + n + " дорівнює " + factorial);

        System.out.println("-- 5 task --");

        int count = 0;
        for (i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                String hour = String.format("%02d", i);
                String minute = String.format("%02d", j);
                if (hour.charAt(0) == minute.charAt(1) && hour.charAt(1) == minute.charAt(0)) {
                    System.out.println(hour + ":" + minute);
                    count++;
                }
            }
        }
        System.out.println("Кількость співпадінь симетричних комбінацій цифр на електронному годиннику: " + count);

        System.out.println("-- 6 task --");

        count = 0;
        for (i = 1; i <= 999999; i++) {
            int firstSum = 0;
            int lastSum = 0;
            int num = i;
            for(int j = 0; j < 3; j++) {
                firstSum += num % 10;
                num /= 10;
            }
            for(int j = 0; j < 3; j++) {
                lastSum += num % 10;
                num /= 10;
            }
            if(firstSum == lastSum) {
                count++;
            }
        }
        System.out.println("Кількость чисел у діапазоні від 000001 до 999999: " + count);

    }
}