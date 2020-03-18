import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssociationTest {

    @org.junit.jupiter.api.Test
    void inOrder1() {
        Association instance= new Association();
        assertEquals(instance.dog.getLeft(),null);
    }

    @org.junit.jupiter.api.Test
    void inOrder() {
        Association instance= new Association();
        Map<String,String> map=new LinkedHashMap<>();
        map.put("*dog*","perro");
        map.put("*homework*","tarea");
        map.put("*house*","casa");
        map.put("*town*","pueblo");
        map.put("*woman*","mujer");
        map.put("*yes*","si");
        assertEquals(instance.inOrder(instance.house),map);
    }
}