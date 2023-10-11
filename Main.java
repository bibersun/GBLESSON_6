public class Main {
    public static void main(String[] args) {
        String name1;
        String name4;
        String name2;
        String name3;
        String name5;

        int phone1;
        int phone2;
        int phone3;

        name1 = "Иванов";
        name2 = "Петров";
        name3 = "Сидоров";
        name4 = "Васечкин";
        name5 = "Ашин";
        phone1 = 123456;
        phone2 = 654321;
        phone3 = 4654321;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name1, phone3);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name3, phone2);
        myPhoneBook.add(name3, phone1);
        myPhoneBook.add(name4, phone1);
        myPhoneBook.add(name5, phone1);

        System.out.println(myPhoneBook.find(name1));
        System.out.println("**************************");
        PhoneBook.getPhoneBook();
        System.out.println("*************************");
        System.out.println(myPhoneBook.find("Чебурашка"));
    }
}