package sample.commons;


import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PerformanceTester<T> {

    private Class<T> clazz;

    public PerformanceTester(Class<T> clazz) {
        this.clazz = clazz;
    }

    private static Logger logger = Logger.getLogger(PerformanceTester.class.getName());

    public void readTest(List<T> series, int repeat) {

        long startTime = System.nanoTime();

            for (int i = 0; i < repeat; i++) {
                series.get(new Random().nextInt(series.size()));

            }

        logger.log(Level.INFO, "time to get: " + (System.nanoTime() - startTime));

    }



    public void writeTest(Collection<T> series, int loop) {
        long startTime = System.nanoTime();
        try {
            for (int i = 0; i < loop; i++) {
                series.add(clazz.getConstructor().newInstance());
            }
         //   System.out.println(series);

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO, "time to get: " + (System.nanoTime() - startTime));
    }


    private void show(T type, String field) {
        try {
            System.out.println(
                    type.getClass()
                            .getMethod("get" + field.substring(0,1)
                                    .toUpperCase() + field.substring(1)
                            ).invoke(type)
            );
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }



}
