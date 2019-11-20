/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adammeller
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Trie {
    public static class TrieNode {
        private HashMap<Character, TrieNode> charMap = new HashMap<>();
        public char c;
        public boolean endOWord;
        public void insert(String s){
        }
        public boolean contains(String s){
            return true;
        }
    }
    public TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String s){
        TrieNode p = root;
        for(char c : s.toCharArray()) {
            if(! p.charMap.containsKey(c)) {
                TrieNode node = new TrieNode();
                node.c = c;
                p.charMap.put(c, node);
            }
            p = p.charMap.get(c);
        }
        p.endOWord = true;
    }
    public boolean contains(String s){
        TrieNode p = root;
        for(char c : s.toCharArray()) {
            if(!p.charMap.containsKey(c)) {
                return false;
            }
            p = p.charMap.get(c);
        }
        return p.endOWord;
    }
    public void insertDictionary(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
            insert(sc.nextLine());
    }
    
    public void insertDictionary(File file) throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
            insert(sc.nextLine());
    }
}