import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVoidMethodTestCase {
    TestVoidMethod tstvm=new TestVoidMethod();
    @BeforeEach
    public void init(){
       tstvm.add("Apple");
        tstvm.add("Bannana");
    }

    public void testVoidMethod(){
//        assertEquals(2,TestVoidMethod.size());
    }
}
