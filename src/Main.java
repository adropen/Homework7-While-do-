//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("задача 1");
    int firstFriday = 5;
    for (int day = 1; day <= 31; day++) {
        if ((day - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
    }
    System.out.println("Задача 2");
    int distance = 500;
    int i = 500;
    do {
        System.out.println("Держитесь! Осталось " + (42_195 - distance) + " метров.");
        distance = distance + i;
    } while (distance <= 42_195);
    for (int a = 500; a <= 42_195; a = a + 500) {
        System.out.println("Держитесь! Осталось " + (42_195 - a) + " метров.");
    }
    System.out.println("Задача 3");
    int amount = 1000;
    int day = 1;
    while (amount >= 0) {
        amount -= 100;
        day++;
        System.out.println("день " + day + " парковка стоит " + amount);
        if (day % 5 == 0) {
            day++;
            amount += 0;
            System.out.println("день " + day + " парковка бесплатна");
            continue;
        }

    }
    System.out.println("Задача 4");
    int salary = 15000;
    int month = 0;
    int total = 0;
    while (true) {
        month++;
        total = total + salary;
        if (month % 6 == 0) {
            total = total + total * 7 / 100;
        }
        System.out.println("Месяц " + month + " текущая сумма: " + total);
        if (total >= 12_000_000) {
            break;
        }
    }
    System.out.println("Задача 5");
    int charge = 20;
    int minute = 0;
    int overheats = 0;
    while (charge < 100) {
        minute++;
        if (minute % 10 == 0) {
            System.out.println("Перегрев");
            overheats++;
            if (overheats == 3) {
                break;
            }
            minute += 2;
            continue;
        } charge += 2;
    }
}