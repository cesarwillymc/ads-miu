package quiz;

import quiz.functor.AverageFunctor;
import quiz.functor.Functor;
import quiz.functor.SumFunctor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        MyVectorClass<Integer> vectorClass = new MyVectorClass<>();
        vectorClass.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Functor<Integer> functor;
        // 1.   Internal Sum functor
        functor = new SumFunctor();
        vectorClass.doAll(functor);
        System.out.printf("Sum functor internal: \n\t expected: %s \n\t actual: %d \n", "55", functor.getValue());
        // 1b.  Internal Average Functor
        functor = new AverageFunctor();
        vectorClass.doAll(functor);
        System.out.printf("Average functor internal: \n\t expected: %s \n\t actual: %d \n", "5.5 in Float", functor.getValue());

        // 2.   External Selective
        Predicate<Integer> selector = x -> x > 2;
        functor = new SumFunctor();
        Iterator<Integer> it = vectorClass.iterator(selector);
        while (it.hasNext()) {
            functor.compute(it.next());
        }
        System.out.printf("Sum functor selective external: \n\t expected: %s \n\t actual: %d \n", "52", functor.getValue());
        // 3.   Internal Selective
        Predicate<Integer> selectorOdd = x -> x % 2 != 0;
        functor = new SumFunctor();
        vectorClass.doAll(functor, selectorOdd);
        System.out.printf("Sum functor selective internal ODD: \n\t expected: %s \n\t actual: %d \n", "25", functor.getValue());

        // 4.   External Selective + Iterable
        functor = new AverageFunctor();
        Iterator<Integer> iterator = vectorClass.iterator(selectorOdd);
        while (iterator.hasNext()) {
            var data = iterator.next();
            functor.compute(data);
        }
        System.out.printf("Average functor selective external ODD: \n\t expected: %s \n\t actual: %d \n", "5", functor.getValue());

    }
}