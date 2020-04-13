package vikdev.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class Main {

    public static void main(String[] args) {

        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>(){
            public boolean  accept(Path path) throws IOException{
                return (Files.isRegularFile(path));
            }
        };

	//Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2");
        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");

        try(DirectoryStream<Path> content = Files.newDirectoryStream(directory , filter)){
	    for (Path file : content){
	        System.out.println(file.getFileName());
        }
    }catch (IOException | DirectoryIteratorException ioe ){
	    System.out.println(ioe.getMessage());
    }

	String separator = File.separator;
	System.out.println(separator);
	separator = FileSystems.getDefault().getSeparator();
	System.out.println(separator);

	try{
	    Path temp = Files.createTempFile("myapp" , ".appext");
	    System.out.println(" Temporary file is : " + temp.toAbsolutePath());
    }catch(IOException ioe ){
	    System.out.println(ioe.getMessage());
    }

	Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
	for (FileStore store : fileStores){
	    System.out.println(store);
	    System.out.println(store.name());
    }
	System.out.println("***************************************************");
	Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
	for(Path path : rootPaths){
	    System.out.println(path);
    }

	System.out.println("-----Walking Tree for Dir2----");
	Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
	try{
		Files.walkFileTree(dir2Path , new printNames());
	}catch (IOException ioe){
		System.out.println(ioe.getMessage());
	}

		System.out.println("-----Copy Dir2 to Dir4/Dir2Copy----");
		Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
		try{
		Files.walkFileTree(dir2Path , new CopyFiles(dir2Path , copyPath));
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}

		File file1 = new File("C:\\Examples\\file.txt");
		Path convertPath = file1.toPath();
		System.out.println("Converted Path : " + convertPath);

		Path parentPath = Paths.get("/Examples");
		Path childRelativePath = Paths.get("dir/file.txt");
		System.out.println(parentPath.resolve(childRelativePath));

		File working = new File("").getAbsoluteFile();
		System.out.println("Working directory : " + working.getAbsolutePath());

		System.out.println("*******************************************");
		File dirFile2 = new File(working , "\\FileTree\\Dir2");
		String[] dir2Contents = dirFile2.list();
		for (int i = 0 ; i < dir2Contents.length; i++ ){
			System.out.println("i = " + i + " : " + dir2Contents[i]);
		}
		System.out.println("***************************************");
		File[] dir3 = dirFile2.listFiles();
		for (int i = 0 ; i < dir3.length; i++ ){
			System.out.println("i = " + i + " : " + dir3[i].getName());
		}
    }
}
