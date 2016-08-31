package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by surabhi on 8/26/16.
 */
public class Trie {
    private class TrieNode{
        Map<Character,TrieNode> children;
        boolean endofWord;
        public TrieNode()
        {
            children=new HashMap<>();
            endofWord=false;
        }
    }
    private final TrieNode root;
    public Trie()
    {
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
                node=new TrieNode();
                current.children.put(ch,node);
            }
            current=node;
        }
        current.endofWord=true;
    }
    public void insertRecursive(String word){
        insertRecursive(root,word,0);
    }
    public void insertRecursive(TrieNode current,String word,int index){
        if(index==word.length()){
            current.endofWord=true;
            return;
        }
        char ch=word.charAt(index);
        TrieNode node=current.children.get(ch);
        if(node==null){
            node=new TrieNode();
            current.children.put(ch,node);

        }
        insertRecursive(node,word,index+1);
    }
    public boolean search(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
                return false;
            }
            current=node;
        }
        return current.endofWord;
    }
    public boolean searchRecursive(String word){
        return searchRecursive(root,word,0);
    }
    public boolean searchRecursive(TrieNode current,String word,int index){
        if(index==word.length()){
            return current.endofWord;
        }
        char ch=word.charAt(index);
        TrieNode node=current.children.get(ch);
        if(node==null){
            return false;
        }
        return searchRecursive(node,word,index+1);
    }
    public boolean delete(TrieNode current, String word,int index){
        if(index==word.length()){
            if(current.endofWord!=true)
            {
                return false;
            }
            current.endofWord=false;
            return current.children.size()==0;
        }
        char ch=word.charAt(index);
        TrieNode node=current.children.get(ch);
        if(node==null){
            return false;
        }
        boolean shouldDeleteCurrentNode=delete(node,word,index+1);
        if(shouldDeleteCurrentNode){
            current.children.remove(ch);
            return current.children.size()==0;
        }
        return false;
    }
}
