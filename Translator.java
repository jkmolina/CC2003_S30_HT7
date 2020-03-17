import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import javax.swing.text.Keymap;

public class Translator {
    Map<String,String> keyMap;

    Association association=new Association();

    void prueba() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("text.txt"));
    Association<String,String> association= new Association<>();
    String line=br.readLine();


    String words[]=line.split(" ");
    for(int i=0;i<words.length;i++)
    {
        words[i]=words[i].toLowerCase();
        String c=words[i];
        if(c.contains(".")){
            StringBuilder sb= new StringBuilder(c);
            sb.deleteCharAt(sb.length()-1);
            words[i]=String.valueOf(sb);
        }
        words[i]="*"+words[i]+"*";
    }
    Map<String,String> keyMap=association.inOrder(association.house);
    System.out.println("Map after In-Order Sorting is: "+keyMap);

    Set<String> keysList=keyMap.keySet();

    Object[] keysArray=keysList.toArray();

    for(int i=0;i<words.length;i++)
    {
        for(int j=0;j<keyMap.size();j++)
        {
            if(words[i].equals(keysArray[j]))
            {
                words[i]=keyMap.get(keysArray[j]);
                break;
            }
        }
    }

    StringBuilder sb= new StringBuilder(words[words.length-1]);
    sb.append(".");
    words[words.length-1]=String.valueOf(sb);
    String sentence="";

    for(int i=0;i<words.length;i++)
    {
        sentence+=(words[i])+" ";
    }
    System.out.println("Final Sentence is: "+sentence);
    


}
}
