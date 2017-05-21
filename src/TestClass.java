
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> tree = new TreeMap();
        String line = br.readLine();
        String tmp = "";
        tmp = line.substring(0, line.indexOf(" "));
        int N = Integer.parseInt(tmp);
        int x = 0;
        tmp = line.substring(line.indexOf(" ")+1, line.length());
        x = Integer.parseInt(tmp);
        tree.put("", x);

        for (int i = 0; i < N - 1; i++) 
        {
            line = br.readLine();
            tmp = br.readLine();
            x = Integer.parseInt(tmp);
            tree.put(line, x);
        }
        String lastKey = (tree.navigableKeySet()).size()+"";
        int max_path = (int) Math.floor(Math.sqrt(Double.parseDouble(lastKey)));
        max_path = (int) Math.pow(max_path, 2);
        System.out.println(max_path+"");


        
    }    
}
    


