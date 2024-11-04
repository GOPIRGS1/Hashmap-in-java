import java.util.*;
public class Main{
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        
        map.put(1,"gopi");
        map.put(2,"ram");
        
        System.out.println("Iterating to the elements....");
        
        for(Map.Entry m : map.entrySet()){
           System.out.println("key value is : "+m.getKey()+"  value is : "+m.getValue());
        }
        
          System.out.println("After Insert to the elements....");
        
        map.putIfAbsent(3,"vicky");
        
        for(Map.Entry m : map.entrySet()){
            System.out.println("key value is : "+m.getKey()+"  value is : "+m.getValue());
        }
        

        map.put(4,"Gowtham");
        
        map.putAll(map);
        
        System.out.println("after funcating to the putAll()");
        
        for(Map.Entry m : map.entrySet()){
            System.out.println("key is : "+m.getKey()+" Value is : "+m.getValue());
        }
        
        map.remove(1);
        
        System.out.println("After Removing to the function ");
        
        for(Map.Entry m : map.entrySet()){
            
            System.out.println("key is : "+m.getKey()+" value wil be : "+m.getValue());
            
        }
        
        map.replace(2,"gopi");
        
        System.out.println("After Replace to the function ");
        
        for(Map.Entry m : map.entrySet()){
            
            System.out.println("key is : "+m.getKey()+" value wil be : "+m.getValue());
            
        }
        
        map.replaceAll((k,v)->"GOWTHAM");//here key and value should be small letter only....
        
            System.out.println("After ReplaceALL to the function ");
        
        for(Map.Entry m : map.entrySet()){
            
            System.out.println("key is : "+m.getKey()+" value wil be : "+m.getValue());
            
        }
        
        
    }
}
