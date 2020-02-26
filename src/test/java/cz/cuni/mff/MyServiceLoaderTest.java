package cz.cuni.mff;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.sql.Driver;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class MyServiceLoaderTest {

    @Test
    public void test() {
        Iterable<Driver> it = MyServiceLoader.load(Driver.class);
        assertThat(it, containsInAnyOrder(Set.of(Matchers.instanceOf(com.mysql.jdbc.Driver.class),
                Matchers.instanceOf(org.postgresql.Driver.class))));
    }

}