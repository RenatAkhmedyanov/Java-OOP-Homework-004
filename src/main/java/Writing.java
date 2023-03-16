import java.io.IOException;
import java.util.ArrayList;

public interface Writing {
    void writeToFile(ArrayList<Task> tasksList) throws IOException;
}
