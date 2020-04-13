package vikdev.com;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class printNames extends SimpleFileVisitor<Path> {

    public FileVisitResult visitFile(Path file , BasicFileAttributes attrs) throws IOException {
    System.out.println(file.toAbsolutePath());
    return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path dir , BasicFileAttributes attrs) throws IOException {
        System.out.println(dir.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult visitFileFailed(Path file , IOException exc) throws IOException {
        System.out.println("Error accessing file : " + file.toAbsolutePath() + " " + exc.getMessage());
        return FileVisitResult.CONTINUE;
    }
}
