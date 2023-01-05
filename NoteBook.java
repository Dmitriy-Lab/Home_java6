//package org.example;
//
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Main {
//    public static void main(String[] args) {
////        createSet();
////        findUniqueElement(createRandomArray());
//        createCatSet();
//    }
//
//    /**
//     * 📔 Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//     * а) информационной системой ветеринарной клиники - name, age, passportVaccinations
//     * б) архивом выставки котов - name, age, color, breed, numberOfParticipants, numberOfExhibitions
//     * в) информационной системой Театра кошек Ю. Д. Куклачёва- name, age, tricks, goodies
//     */
//
//    /**
//     * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//     * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//     * 3. Создайте метод
//     * **public boolean**
//     * equals(Object o)
//     * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//     * 4. Создайте метод
//     * **public int hashCode()**
//     * который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
//     * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
//     */
//    private static void createCatSet() {
//        Cat cat = new Cat("Barsik", 2, "black",  2236);
//        Cat cat2 = new Cat("Myrka", 4, "white",4456);
//        Cat cat3 = new Cat("Gav", 1, "red",7489);
//        Cat cat4 = new Cat("Gav", 1, "red",7489);
//
//        Set<Object> setCat = new HashSet<>();
//        setCat.add(cat);
//        setCat.add(cat2);
//        setCat.add(cat3);
//        setCat.add(cat4);
//
//        System.out.println(setCat);
//
//    }
//
//    /**
//     * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     * 2. Создать множество ноутбуков.
//     * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//     * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//     * “Введите цифру, соответствующую необходимому критерию:
//     * 1 - ОЗУ
//     * 2 - Объем ЖД
//     * 3 - Операционная система
//     * 4 - Цвет …
//     * 1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//     * 2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//     */
//
//}
package org.example;

public class NoteBook {
    /**
     * Марка ноутбука
     */
    private String brand;
    /**
     * Модель ноутбука
     */
    private String model;
    /**
     * Оперативная память
     */
    private int ram;
    /**
     * Объем жесткого диска
     */
    private int ssd;
    /**
     * Операционная система
     */
    private String operatingSystem;
    /**
     * Цвет
     */
    private String color;

    public NoteBook(String brand, String model, int ram, int ssd, String operatingSystem, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getRam(){
        return ram;
    }
    public int getSsd(){
        return ssd;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}