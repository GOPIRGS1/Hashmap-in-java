import java.util.HashMap;
import java.util.Map;



class book_details{
    int id;
    String name,publisher,author;
    int quantity;
    book_details(int id,String name,String publisher,String author,int quantity){
        
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.quantity = quantity;
        
    }


public String toString(){
    return "BookDetails{" +
                "id=" + id +
                ", name=" + name +
                ", publisher=" + publisher +
                ", author=" + author  +
                ", quantity=" + quantity +
                "}";
}
}
public class Main{
    public static void main(String[] args){
        HashMap<Integer,book_details> map=  new HashMap<>();
        
        book_details b1 = new book_details(1,"programming in c","GRS publications","caley hamlthon",23);
        book_details b2 = new book_details(2,"programming in java","GRS publications","gopi",23);
        book_details b3 = new book_details(3,"programming in frontend","GRS publications","harigopi",23);
        book_details b4 = new book_details(4,"programming in my sql","GRS publications","vicky emanuvel",23);
        
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        map.put(4,b4);
        
        System.out.println("iterating elements will be .....\n");
        for(Map.Entry<Integer,book_details> m : map.entrySet()){
            
            System.out.println("key is : "+m.getKey()+"  Value is : "+m.getValue());
            
        }
        
        
    }
}
