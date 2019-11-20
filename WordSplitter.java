/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
/**
 *
 * @author adammeller
 */
public class WordSplitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
            File myFile = new File(args[0]);
            String test = args[1];
            
           //String test = "actlikefunbutnotrun";
           //String myFile = "/Users/adammeller/Downloads/hw3-code/words.txt";
           Trie dict = new Trie();
           dict.insertDictionary(myFile);
           //System.out.println(dict.contains("blaty"));
          splitter sp = new splitter(dict);
          test = sp.split(test);
          
          if(test != null)
          System.out.println(test);
          else
          System.out.println("No Splitting Found.");
            
           
           
                  
           
    }

        }

        
     


