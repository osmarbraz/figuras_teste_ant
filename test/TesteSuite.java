
import figuras.TestRetangulo;
import figuras.TestTriangulo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@SuiteClasses({TestTriangulo.class, TestRetangulo.class})
public class TesteSuite {

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(TesteSuite.class);
    }
}
