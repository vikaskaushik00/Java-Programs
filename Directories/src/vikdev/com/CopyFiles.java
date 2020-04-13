package vikdev.com;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFiles extends SimpleFileVisitor<Path> {
    private Path sourceRoot;
    private  Path targetRoot;

    public CopyFiles(Path sourceRoot , Path targetRoot){
        this.sourceRoot = sourceRoot;
        this.targetRoot = targetRoot;
    }


    public FileVisitResult visitFileFailed(Path file , IOException ecx) throws IOException {
        System.out.println("Error accessing file : " + file.toAbsolutePath() + ecx.getMessage());
       return FileVisitResult.CONTINUE;
    }
    public FileVisitResult preVisitDirectory(Path dir , BasicFileAttributes attrs) throws IOException {
       Path relativizedPath = sourceRoot.relativize(dir);
       System.out.println("RelativizedPath : " +relativizedPath);
       Path copyDir = targetRoot.resolve(relativizedPath);
       System.out.println("Resolved path for copy : " + copyDir);
       try{
           Files.copy(dir , copyDir);
       }catch (IOException ioe){
           System.out.println(ioe.getMessage());
           return FileVisitResult.SKIP_SIBLINGS;
       }
       return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file , BasicFileAttributes attrs) throws IOException {
        Path relativizedPath = sourceRoot.relativize(file);
        System.out.println("RelativizedPath : " +relativizedPath);
        Path copyDir = targetRoot.resolve(relativizedPath);
        System.out.println("Resolved path for copy : " + copyDir);
        try{
            Files.copy(file , copyDir);
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return FileVisitResult.CONTINUE;


    }
}
