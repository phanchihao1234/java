import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors.get(1));

        colors.set(1, "blue");

        colors.remove("Red");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
        for (String color : colors) {
            System.out.println(color);
        }
        String[] arrayColors = {"red", "green", "blue"};
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(arrayColors));

        Collections.sort(colorsList);
        System.out.println(colorsList);
        Collections.sort(colorsList, (s1, s2) -> s1.compareTo(s2));
        System.out.println(colorsList);

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3, 5));
        points.add(new Point(2, 6));
        points.add(new Point(5, 2));
        points.add(new Point(6, 0));

        Comparator<Point> x_y_compare = new Comparator<Point>() {
            @Override
//            // so sanh theo X
//            public int compare(Point o1, Point o2) {
//                return Integer.compare(o1.getX(), o2.getX());
//            }
//            // so sanh theo Y
//            public int compare(Point o1, Point o2) {
//                return Integer.compare(o1.getY(), o2.getY());
//            }
//            //so sanh x trung dk phu ss y
//            public int compare(Point o1, Point o2) {
//                int tmp= Integer.compare(o1.getX(), o2.getX());
//                if(tmp==0){
//                    return Integer.compare(o1.getY(), o2.getY());
//                }
//                return tmp;
//            }
            // so sanh tong xy
//            public int compare(Point p1, Point p2){
//                return Integer.compare(p1.getX()+p1.getY(),p2.getX()+p2.getY());
//            }
            public int compare(Point o1, Point o2) {
                return Integer.compare(o2.getX(), o1.getX());
            }
        };
        Collections.sort(points, x_y_compare);
        for (Point p : points) {
            System.out.println(p);
        }
        System.out.println("##################");
        Predicate<Point> SumPoint = point -> point.getX() + point.getY() > 7;
        Predicate<Point> SumPoint2 = point -> {
            if (point.getX() > 5) {
                return point.getX() + point.getY() > 7;
            } else {
                return point.getX() + point.getY() > 6;
            }
        };
        for (Point p : points) {
            if (SumPoint2.test(p)) {
                System.out.println(p.toString());
            }
        }
        System.out.println("##################");
        Function<Point, Integer> SumFuncPoint = p -> p.getX() + p.getY();
        Function<Point, Integer> SumFuncPoint2 = p -> {
            return p.getY() > p.getX() ? p.getX() - p.getY() : p.getX() - p.getY();
        };
        for (Point p : points) {
            System.out.println(SumFuncPoint2.apply(p));
        }
        System.out.println("##################");
        Consumer<Point> printMessenger = point -> {
            if (point.getX() > point.getY()) {
                System.out.println(point.getY() - point.getX());
            } else {
                System.out.println(point.getY() - point.getX());
            }
        };
        System.out.println("##################");
        points.forEach(printMessenger);
        System.out.println("##################");
        for (Point p : points) {
            printMessenger.accept(p);
        }
        System.out.println("##################");
        points.stream()
                .filter(point -> point.getX() > 3)
                .forEach(System.out::println);
        System.out.println("##################");
        for (Point a : points) {
            if (a.getX() < 3) {
                System.out.println(a.toString());
            }
        }
        System.out.println("##################");
        Predicate<Point> pre_x = point -> point.getX() > 3;
        for (Point p : points) {
            if (pre_x.test(p)) {
                System.out.println(p.toString());
            }
        }
        System.out.println("##################");
        Consumer<Point> consum_x = point -> {
            if (point.getX() > 3) {
                System.out.println(point.toString());
            }
        };
        points.forEach(consum_x);

        //~ vd ve stream !!!!!!!!!!!!!!!
        System.out.println("-----------------------------");
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Anna");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("-----------------------------");
        List<String> filterName = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filterName);
        System.out.println("-----------------------------");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("--------Tang Dan----------------");
        names.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------Giam Dan--------------");
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("-----------------------------");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //tinh tong
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
        System.out.println("-----------------------------");
        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Average: " + avg);
        System.out.println("-----------------------------");
        //tim Max
        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Max: " + (max.isPresent() ? max.getAsInt() : "Not present"));
        System.out.println("-----------------------------");
        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Min: " + (min.isPresent() ? min.getAsInt() : "not present"));

        System.out.println("-----------------------------");
        // use reduce de tinh tong
        int sum1 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum using reduce: " + sum1);
        // Su dung reduce de tim tich
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product using reduce: " + product);

        System.out.println("-----------------------------");
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        List<String> combinedList = listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(combinedList);

        System.out.println("---------Bai Tap_________");
        List<Double> arr = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        //tinh tong
        double s = arr.stream()
                .reduce(0.0, (a, b) -> a + (1 / b));
        System.out.println("Sum: " + s);
        System.out.println("---------_________");
        int totalSum = points.stream()
                .flatMapToInt(point -> Arrays.stream(new int[]{point.getX(), point.getY()}))
                .sum();
        System.out.println("Tong gia tri: " + totalSum);
        System.out.println("---------_________");
        ////Tinh tong cac hoanh do
        int sumX = points.stream()
                .mapToInt(Point::getX)
                .sum();
        System.out.println("Tong gia tri: " + sumX);
        System.out.println("---------_________");
        //Tinh tong cac hoanh do >5
        int sumX2 = points.stream()
                .filter(p -> p.getX() > 5)
                .mapToInt(Point::getX)
                .sum();
        System.out.println("Tong gia tri: " + sumX2);
        System.out.println("---------_________");
        //Tinh tong toan bo x^2+1-y doi vs cac hoanh do >5
        int sumX3 = points.stream()
                .filter(p -> p.getX() > 5)
                .mapToInt(p -> {
                    return p.getX() * p.getX() + 1 - p.getY();
                })
                .sum();
        System.out.println("Tong gia tri: " + sumX3);
        points.stream()
                .filter(p -> p.getX() > 4)
                .mapToInt(p -> {
                    return p.getX() * p.getX() + 1 - p.getY();
                })
                .forEach(res -> System.out.println(res));

        //tinh tinh" toan bo x^2+1-y doi vs cac hoanh do >1
        long total5 = points.stream()
                .mapToLong(p -> {
                    return p.getX() * p.getX() + 1 - p.getY();
                })
                .reduce(1l, (kq, item) -> kq * item);
        System.out.println("Total 5: " + total5);
        //tinh tich cac gia tri cua 1/(x^2+y) cho tat ca point
        double totalProducts = points.stream()
                .mapToDouble(p -> {
                    int x = p.getX();
                    int y = p.getY();
                    double tmp = x * x + y;
                    return 1.0 / tmp;
                })
                .reduce(1.0, (res, item) -> res * item);
        System.out.println("tinh tich cac gia tri cua 1/(x^2+y) cho tat ca point: " + totalProducts);
        ///in danh sach x+y>7
        points.stream()
                .filter(p -> (p.getX() - p.getY()) > 7)
                .forEach(System.out::println);
        // in danh sach x>5 && y<1
        points.stream()
                .filter(p -> (p.getX() > 5 && p.getY() < 1))
                .forEach(System.out::println);

//        (3, 5));
//        (2, 6));
//        (5, 2));
//        (6, 0));

        int totalXY = points.stream()
                .mapToInt(p -> {
                    int x = p.getX();
                    int y = p.getY();
                    int tmp = x + y;
                    return tmp;
                })
                .reduce(0, (res, item) -> res + item);
        System.out.println("Tong x va y: " + totalXY);
        int totalXY2 = points.stream()
                .mapToInt(p -> p.getX() + p.getY())
                .sum();
        System.out.println("Tong x va y: " + totalXY2);
        int totalXY3 = points.stream()
                .reduce(0, (a, p) -> a + p.getX() + p.getY(), Integer::sum);
        int totalXY4 = points.stream()
                .map(p -> p.getX() + p.getY())
                .reduce(0, (a, value) -> a + value);
        System.out.println("Tong x va y: " + totalXY4);
    }
}