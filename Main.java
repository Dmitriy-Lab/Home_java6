package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        filterNotes(parametrs());
    }

    /**
     *  1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     *  2. Создать множество ноутбуков.
     *  3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки,
     *  отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     *  “Введите цифру, соответствующую необходимому критерию:
     *  1 - ОЗУ
     *  2 - Объем ЖД
     *  3 - Операционная система
     *  4 - Цвет …
     *   1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
     *   2. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     */
    private static Set<Object> createLaptopSet() {
        NoteBook NoteBook = new NoteBook("Asus", "ABC", 2, 500, "Windows 8", "Gray");
        NoteBook NoteBook1 = new NoteBook("Acer", "EFG", 4, 400, "Windows 7", "White");
        NoteBook NoteBook2 = new NoteBook("Lenovo", "XYZ", 6, 300, "Windows 10", "Black");
        NoteBook NoteBook3 = new NoteBook("Asus", "LMN", 8, 200, "Windows 8", "Black");
        NoteBook NoteBook4 = new NoteBook("DELL", "OPQ", 4, 400, "Windows 8", "Gray");
        NoteBook NoteBook5 = new NoteBook("Asus", "RST", 8, 300, "Windows 10", "Black");
        NoteBook NoteBook6 = new NoteBook("Acer", "UVW", 8, 200, "Windows 7", "Gray");

        Set<Object> setNoteBook = new HashSet<>();
        setNoteBook.add(NoteBook);
        setNoteBook.add(NoteBook1);
        setNoteBook.add(NoteBook2);
        setNoteBook.add(NoteBook3);
        setNoteBook.add(NoteBook4);
        setNoteBook.add(NoteBook5);
        setNoteBook.add(NoteBook6);

        return setNoteBook;
    }
    private static int parametrs(){
        Map<Integer, String> criterion = new HashMap<Integer, String>();
        criterion.put(1, " ОЗУ");
        criterion.put(2, " Объем диска");
        criterion.put(3, " Операционная система");
        criterion.put(4, " Цвет");

        System.out.println("Фильтр по параметрам ноутбуков: " + "\n" + criterion);
        System.out.print("Введите выбранное значение: ");
        Scanner scanner = new Scanner(System.in);
        int selectedCriterion = scanner.nextInt();
        return selectedCriterion;
    }
    private static void filterNotes(int selectedCriterion){
        if (selectedCriterion == 1){
            filter1(createLaptopSet());
        }
        else if (selectedCriterion == 2){
            filter2(createLaptopSet());
        }
        else if (selectedCriterion == 3){
            filter3(createLaptopSet());
        }
        else if (selectedCriterion == 4){
            filter4(createLaptopSet());
        }
        else System.out.println("Некорректное значение");
    }
    private static void filter1(Set<Object> setNoteBook) {
        System.out.print("Введите необходимый объем ОЗУ (2, 4, 6, 8): ");
        Scanner scanner1 = new Scanner(System.in);
        int size1 = scanner1.nextInt();
        String Ram = "ram=" + size1;
        for (var item : setNoteBook) {
            String NoteBook = item.toString();
            if (NoteBook.contains(Ram)) {
                System.out.println(item);
            }
        }
    }
    private static void filter2(Set<Object> setNoteBook){
        System.out.print("Введите необходимый объем ЖД (200, 300, 400, 500): ");
        Scanner scanner2 = new Scanner(System.in);
        int size2 = scanner2.nextInt();
        String Ssd = "ssd=" + size2;
        for (var item : setNoteBook) {
            String NoteBook = item.toString();
            if (NoteBook.contains(Ssd)){
                System.out.println(item);
            }
        }
    }
    private static void filter3(Set<Object> setNoteBook){
        System.out.println("1 - Windows 7" + "\n" + "2 - Windows 8" + "\n" + "3 - Windows 10");
        System.out.print("Введите выбранную ОС: ");
        Scanner scanner3 = new Scanner(System.in);
        int selectedOs = scanner3.nextInt();
        String os = null;
        if (selectedOs == 1) {
            os = "Windows 7";
        } else if (selectedOs == 2) {
            os = "Windows 8";
        } else if (selectedOs == 3) {
            os = "Windows 10";
        }
        else System.out.println("Некорректное значение");
        for (var item : setNoteBook) {
            String NoteBook = item.toString();
            if (NoteBook.contains(os)){
                System.out.println(item);
            }
        }
    }
    private static void filter4(Set<Object> setNoteBook){
        System.out.println("1 - Black" + "\n" + "2 - White" + "\n" + "3 - Gray");
        System.out.println("Введите значение выбранного цвета: ");
        Scanner scanner3 = new Scanner(System.in);
        int selectedColor = scanner3.nextInt();
        String color = null;
        if (selectedColor == 1) {
            color = "Black";
        } else if (selectedColor == 2) {
            color = "White";
        } else if (selectedColor == 3) {
            color = "Gray";
        }
        else System.out.println("Некорректное значение");
        for (var item : setNoteBook) {
            String NoteBook = item.toString();
            if (NoteBook.contains(color)){
                System.out.println(item);
            }
        }
    }
}