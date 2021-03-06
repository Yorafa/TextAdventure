package usecase.user;

import gateway.ReadWriter;
import adapter.IReadWriter;

import java.io.IOException;

/**
 * the data access object of user
 */
public class UserReadWriterForTest implements IReadWriter {
    private final ReadWriter rw = new ReadWriter();

    /**
     * @return the user data
     * @throws IOException            file not exist exception
     * @throws ClassNotFoundException class not exist exception
     */
    @Override
    public Object read() throws IOException, ClassNotFoundException {
        String filePath = "test_data/UserInfo.ser";
        return rw.read(filePath);
    }

    /**
     * @param o object will be written
     * @throws IOException file not exist
     */
    @Override
    public void write(Object o) throws IOException {
        String filePath = "test_data/UserInfo.ser";
        rw.write(filePath, o);
    }
}