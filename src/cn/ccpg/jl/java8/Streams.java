package cn.ccpg.jl.java8;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    private enum Status{
        OPEN, CLOSE
    }

    private static final class Task{
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points){
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public Integer getPoints() {
            return points;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "status=" + status +
                    ", points=" + points +
                    '}';
        }
    }

    public static void main(String[] args) {
        final Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSE, 5)
        );
        //在tasks集合中一共有多少个OPEN状态的点
        final long total = tasks.stream().filter(task -> task.getStatus() == Status.OPEN).mapToInt(Task :: getPoints).sum();
        System.out.println(total);//18

        Stream stream = tasks.stream();
        Object[] objects = stream.toArray();
        for(Object obj : objects){
            System.out.println(obj);
            //Task{status=OPEN, points=5}
            //Task{status=OPEN, points=13}
            //Task{status=CLOSE, points=5}
        }
        //并行处理所有task
        double total1 = tasks.stream().parallel().map(task -> task.getPoints()).reduce(0, Integer :: sum);
        System.out.println(total1);//23.0
        //根据status属性对集合分组
        Map map = tasks.stream().collect(Collectors.groupingBy(Task :: getStatus));
        System.out.println(map);//{OPEN=[Task{status=OPEN, points=5}, Task{status=OPEN, points=13}], CLOSE=[Task{status=CLOSE, points=5}]}
        //计算集合中每个任务的点数在集合中所占的比重
        Collection result = tasks.stream().mapToInt(Task :: getPoints).asLongStream().mapToDouble(points -> points / total1).boxed().mapToLong(weigth -> (long)(weigth * 100))
                .mapToObj(percentage -> percentage + "%").collect(Collectors.toList());
        System.out.println(result);//[21%, 56%, 21%]

        Path path = new File("C:/Users/007/Desktop/路径.txt").toPath();
        System.out.println(path);
        try(Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)){
            lines.onClose(() -> System.out.println("Done")).forEach(System.out :: println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
