//Example to demonstrate the use of continue statement inside a for loop :

package Ashlesha;

public class java_continue {
 
public static void main(String[] args) {  
 
    for(int i=7;i>0;i--){  
        if(i==3)
        {  
        	
            continue; //continue skips the rest statement
        }  
        System.out.println(i);  
    }  
}  
}  