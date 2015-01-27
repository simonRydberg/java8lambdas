package se.simpor.session2;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by simonrydberg on 26/01/15.
 */
public class FileTest {

    public static void main(String[] args) {
        List<File> files =
                Stream.of(new File(".").listFiles()).flatMap(file -> file.listFiles() == null ?
                        Stream.of(file) : Stream.of(file.listFiles()))
                        .collect(Collectors.toList());
        System.out.println("Count: " + files.size());
        files.forEach(System.out::println);
    }

}
