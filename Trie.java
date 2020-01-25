//package Code;
//import Code.Sample;
import javax.swing.*; 
import java.io.FileInputStream;
import java.util.HashMap; 
import java.util.Map; 

public class Trie { 
	
	static final int ALPHABET_SIZE = 26; 
	public static HashMap<String, String> map = new HashMap<>();	

	static class TrieNode 
	{ 
		TrieNode[] children = new TrieNode[ALPHABET_SIZE]; 
	
	
		boolean isEndOfWord; 
		
		TrieNode(){ 
			isEndOfWord = false; 
			for (int i = 0; i < ALPHABET_SIZE; i++) 
				children[i] = null; 
		} 
	}; 
	
	static TrieNode root =new TrieNode(); 
	
 
	public static void insert(String key,String value) 
	{ 
		int level; 
		int length = key.length(); 
		int index; 
	
		TrieNode pCrawl = root; 
		map.put(key, value);
		for (level = 0; level < length; level++) 
		{ 
			index = key.charAt(level) - 'a'; 
			if (pCrawl.children[index] == null) 
				pCrawl.children[index] = new TrieNode(); 
	
			pCrawl = pCrawl.children[index]; 
		} 
	
		pCrawl.isEndOfWord = true; 
	} 
	
	public String search(String key) 
	{ 
		int level; 
		int length = key.length(); 
		int index; 
		TrieNode pCrawl = root; 
	
		for (level = 0; level < length; level++) 
		{ 
			index = key.charAt(level) - 'a'; 
	
			if (pCrawl.children[index] == null){
			

				return "0"; }
	
			pCrawl = pCrawl.children[index]; 
		} 
	
		if(pCrawl != null && pCrawl.isEndOfWord){return key;
		}else if(pCrawl != null && pCrawl.isEndOfWord != true){
			String val = new String(key);
			int temp =0;
			while(pCrawl.isEndOfWord != true){
				if(pCrawl.children[temp] == null){
					temp = temp+1;

				}else{
					pCrawl = pCrawl.children[temp];
					temp = 97 + temp;
					val = val.concat(Character.toString((char)temp));
					temp = 0;
				}

			}
			return val;
		} 
		return "0";
	} 
	


}