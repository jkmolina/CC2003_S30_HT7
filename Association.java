import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Association<K,V> {

    BinaryTree<String> homework = new BinaryTree<>("homework", "tarea", null, null);
    BinaryTree<String> town = new BinaryTree<>("town", "rancho", null, null);
    BinaryTree<String> yes = new BinaryTree<>("yes", "si", null, null);
    BinaryTree<String> woman = new BinaryTree<>("woman", "mujer", town, yes);
    BinaryTree<String> dog = new BinaryTree<>("dog", "perro", null, homework);
    BinaryTree<String> house = new BinaryTree<>("house", "casa", dog, woman);
    Map<String,String> keyMap= new HashMap<>();

    Map<String,String> inOrder(BinaryTree<String> tree) throws IOException 
    {
        if (tree == null) 
            return keyMap; 
  
        inOrder(tree.left);
        keyMap.put("*"+tree.englishValue()+"*", tree.spanishValue()); 

        inOrder(tree.right);
        return keyMap;
    } 

    //tomado de referencia de https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
  
}