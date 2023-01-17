public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println("dog = " + dog + "; cat = " + cat + "; paper = " + paper);
        // Задача 1

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println("dog = " + dog + "; cat = " + cat + "; paper = " + paper);
        // Задача 2

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println("dog = " + dog + "; cat = " + cat + "; paper = " + paper);
        // Задача 3

        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        // Задача 4

        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        // Задача 5

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersTotalWeight = boxerWeight1 + boxerWeight2;
        var differenceBoxersWeight = boxerWeight1 - boxerWeight2;
        System.out.println("Задача 6");
        System.out.println("Общий вес боксеров = " + boxersTotalWeight + "кг");
        System.out.println("Разница в весе боксеров = " + differenceBoxersWeight + "кг");
        // Задача 6

        var differenceBoxersWeight2 = boxerWeight2 - boxerWeight1;
        var differenceBoxersWeight3 = boxerWeight2 % boxerWeight1;
        System.out.println("Задача 7");
        System.out.println("Разница в весе боксеров = " + differenceBoxersWeight2 + "кг");
        System.out.println("Разница в весе боксеров = " + differenceBoxersWeight3 + "кг");
        // Задача 7

        var totalWorkingHours = 640;
        var employeeWorkingDay = 8;
        var employeeQuantity = totalWorkingHours / employeeWorkingDay;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании - " + employeeQuantity + " человек");
        employeeQuantity = employeeQuantity + 94;
        totalWorkingHours = employeeQuantity * employeeWorkingDay;
        System.out.println("Если в компании работает " + employeeQuantity + " человека, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");
        // Задача 8




    }
}