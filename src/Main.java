public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
    }

    public static void task_1() {
        System.out.println("Задача 1"); // Вывести ФИО
        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lasrtName = "Ivanov";
        String fullName = lasrtName + " " + firstName + " " + midlleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задача 2"); //вывести ФИО заглавными
        String fullNameCase = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + fullNameCase);

    }
    public static void task_2(){
        System.out.println("Задача 3");
        String fullName = "Семёнов Семён Семёнович";
        String fullNameNew = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullNameNew);
    }
}