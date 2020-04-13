package vikdev.com;
import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(ArrayList<String> details);

}
