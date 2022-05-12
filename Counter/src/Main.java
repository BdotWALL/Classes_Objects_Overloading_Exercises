public class Main {
    public static void main(String[] args)  {


        Counter counter = new Counter(1);
        
        counter.increase(2);
        System.out.println(counter.value());

        counter.increase();
        System.out.println(counter.value());

        counter.increase();
        System.out.println(counter.value());

        counter.decrease();
        System.out.println(counter.value());

        counter.decrease(4);
        System.out.println(counter.value());

        counter.increase(-3);
        System.out.println(counter.value());

        counter.increase(10);
        System.out.println(counter.value());

        counter.decrease(-7);
        System.out.println(counter.value());

        Counter counter2 = new Counter();
        System.out.println(counter2.value());

        counter2.increase(8);
        System.out.println(counter2.value());

        counter2.decrease(5);
        System.out.println(counter2.value());











    }
}
