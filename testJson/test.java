package testJson;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
public class test {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try{
        Object obj = parser.parse(new FileReader("/Users/Admin/Documents/VS code Java Projects/testJson/data.json"));
        JSONObject jsonObject =  (JSONObject) obj;
        String name = (String) jsonObject.get("gender");
            System.out.println(name);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
    }
    

    
}
