import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Association<String,String> association=new Association<>();
        association.inOrder(association.house);
        Translator translator = new Translator();
        translator.prueba();
    }
}