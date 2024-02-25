import Animal.Animals;

import java.util.*;

import Animal.*;

public class Main {
    public static void main(String[] args) {
        /* int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5)+i;
        }

        try {
            for (int i = 0; i < array.length + 1; i++) {
                System.out.println(array[i]+ " ");
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вы вышли за рамки массива");
        }

        System.out.println("end");
        Calculator sumCalc = (a, b) -> System.out.println(a + b);
        Calculator subCalc = (a, b) -> System.out.println(a - b);
        Calculator multCalc = (a, b) -> System.out.println(a * b);
        Calculator divCalc = (a, b) -> System.out.println(a / b);

        sumCalc.calc(1,2);
    }


    // Функиональный интерфейс
    interface Calculator {
        void calc(double num1, double num2);
    }*/

        /*// Отличие ArrayList от LinkedList - первый быстрее, но статичный, второй удобнее для изменений
        List<Integer> list = new LinkedList<>();

        // Set - лист с уникальными значениями, его объект HashSet
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('1');
        characterSet.add('2');
        characterSet.add('3');
        characterSet.add('4');
        characterSet.add('5');*/

        /*// foreach
        for (char elem:characterSet) {
            System.out.print(elem + " ");
        }

        System.out.println();

        Auto a1 = new Auto(2, "auto");
        System.out.println(a1);*/

        Set<Auto> charSet = new HashSet<>();
        Auto a2 = new Auto(4,"a2");
        Auto a3 = new Auto(4,"a3");
        charSet.add(a2);

        for(Auto elem:charSet) {
            System.out.println(elem);
        }

        System.out.println(charSet.size());
    }
}

class Auto {
    int wheels;
    String name;

    public Auto(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    @Override
    public String toString(){
        return "В этой машине " + wheels + " " + (wheels<5 ? "колеса" : "колёс");
    }
}