import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;


class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        if (!phoneBook.containsKey(name)) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(phoneNum);
            phoneBook.put(name, al);
        } else {
            if (!phoneBook.get(name).contains(phoneNum)) {
                ArrayList<Integer> al = new ArrayList<>(phoneBook.get(name));
                al.add(phoneNum);
                phoneBook.replace(name, al);
            }
        }
    }

    public String find(String name) {

        if (phoneBook.containsKey(name)) {
            return String.format("Найденные телефонные номера для %s = %s", name, phoneBook.get(name).toString());
        } else {
            return String.format("Нет %s в телефонной книге", name);
        }
    }



    public static void getPhoneBook() {
        System.out.println("Телефонная книга, отсортированная по количеству телефонов");
        phoneBook.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(a -> a.getKey().charAt(0)))
                .sorted((a1, a2) -> a2.getValue().size() - a1.getValue().size())
                .forEach(System.out::println);
    }
}