import java.io.*;
import java.util.*;

import jdk.internal.org.jline.utils.InputStreamReader;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLengrh = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt+" ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        }catch(IOException e){
            System.out.println("IOException: "+e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];
        String temp = null;
        int [] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if((comCount % 2) == 1){
            incr = gridLengrh;
        }

        while(!success & attempts++ < 200){
            location = (int) (Math.random() * gridSize);
            // System.out.println("try "+location);
            int x = 0;
            success = true;
            while(success && x<comSize){
                if(grid[location] == 0){
                    coords[x++] = location;
                    location += incr;
                    if(location >= gridSize){
                        success = false;
                    }
                    if(x>0 && (location % gridLength)==0)
                }
            }
        }
    }
}