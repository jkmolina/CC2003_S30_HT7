import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Association<String,String> association=new Association<>();
        association.inOrder(association.house);
        System.out.println(association.keyMap);
        Translator translator = new Translator();
        translator.prueba();
        //poner de parametro association.keyMap
    }
}