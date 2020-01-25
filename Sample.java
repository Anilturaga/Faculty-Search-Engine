//package Code;

//import Code.Trie;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map; 


public class Sample{ 
    private static final String DATA_TXT = "./data.txt";
  
    
    public static void initialize() {
        String name = new String();
        String value = new String();
        System.out.println("Inside initialize");
        try {
            
            FileInputStream fin = new FileInputStream(DATA_TXT);
            int i=0;    
            int a=0;
            while((i=fin.read())!=-1){ 
                String temp = String.valueOf((char)i);
                if(a == 0 && (char)i != '/'){
                    name = name.concat(temp);
                    //System.out.println(name);
                }
                if ((char)i == '<') {
                    a=0;
                    
                    Trie.insert(name,value);
                    //System.out.println(value);
                    name = "";
                    value = "";

                }
                if( a == 1){
                    a =1;
                    value = value.concat(temp);
                    //System.out.println(value);
                }
                if((char)i == '/'){
                    a=1;
                }

            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);} 

    }
    public static void input(String name,String value){
        try{    
            //FileOutputStream fout=new FileOutputStream(DATA_TXT);    
            String ans = new String(name);
            ans=ans.concat("/");
            ans=ans.concat(value);
            ans=ans.concat("<");
            try { 
  
                // Open given file in append mode. 
                BufferedWriter out = new BufferedWriter( 
                       new FileWriter(DATA_TXT, true)); 
                out.write(ans); 
                out.close(); 
            } 
            catch (IOException e) { 
                System.out.println("exception occoured" + e); 
            } 
            //byte b[]=ans.getBytes();
            //fout.write(b);
            Trie.insert(name, value);    
            //fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}  

    }
    public static void main(String[] args) {
        Sample s = new Sample();
        s.initialize();
        System.out.println(new Trie().search("mahi"));
    }

}  