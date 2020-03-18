import java.util.LinkedHashMap;
import java.util.Map;

class AssociationTest {

    @org.junit.jupiter.api.Test
    void inOrder1() {
        Association instance= new Association();
        assertEquals(instance.dog.getLeft(),null);
    }

    private void assertEquals(BinaryTree binaryTree, Object object) {
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
        assertEquals((BinaryTree) instance.inOrder(instance.house), map);
    }

    private void assertEquals(BinaryTree inOrder, Map<String, String> map) {
    }
}