import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(5,2,21,4,3,1,11,8,33));


        List<Integer> nums2 = new ArrayList<>();

        List<Integer> lin=new LinkedList<>();
        lin.add(120);
        lin.add(3);
        lin.add(4);
        lin.add(33);
        lin.add(2);
        lin.add(145);
        lin.add(1);







        //lin.stream().filter(n-> n>100);
        lin.removeIf(n->n<=4);
        Collections.sort(lin);
        lin.forEach(System.out::println);




        int a=Collections.max(nums);
        int b=Collections.min(nums);
        //System.out.println(a);
        //System.out.println(b);
        
        System.out.println("-------------");
       // nums.forEach(System.out::println);

        int to=sumAll(nums,n ->n>8 );
        System.out.println("sum >8="+to);


        //Supplier<Stream<Integer>> streamSupplier = nums::stream;




       nums.stream().sorted().filter(Main::isEven).map(Main::doubleIt).filter(Main::isGreaterThan5).collect(Collectors.toList()).forEach(nums2::add);

       Optional<Integer> f=nums.stream().filter(n->n>10).sorted().findFirst();

       // nums2.add(f.isPresent() ? 1 : 2);
        System.out.println(f.isPresent() ? f.get() : "Not found");


        nums2.forEach(System.out::println);

        //nums.stream().sorted().filter(n->n>11).forEach(System.out::println);
         //Stream<Integer> st=nums.stream().sorted();
        // st.filter(n-> n>2);


        //st.forEach(System.out::println);
        System.out.println("-------------");
        System.out.println("-------------");

        Employee a1=new Employee();
        a1.setName("kostas");
        a1.setSurname("katsichtis");
        a1.setPosition("Java Developer");
        Employee.ret();


        System.out.println(a1.getId());

        System.out.println("-------------");
        System.out.println("-------------");

        Main m= new Main();
        m.testla();




    }


    private static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }

     private static boolean isEven(int number) {
        return number % 2 == 0;
    }

     private static int doubleIt(int number) {
        return number * 2;
    }

     private static boolean isGreaterThan5(int number) {
        return number > 5;
    }

     private void testla(){

        List<Integer> ll= new ArrayList<>();
        ll.addAll(Arrays.asList(5,2,21,4,3,1,11,8,33));

        ll.stream().filter(n->n>3);





    }

    private synchronized   boolean isEven2(int number) {

        return number % 2 == 0;
    }



}
