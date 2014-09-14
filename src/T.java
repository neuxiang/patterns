public class T {   
public static void main(String[] args) {   
 certkiller("four");   
 certkiller("tee");   
   certkiller("to");   
  }   
  
 public static void certkiller(String str) {   
 
   int check = 4;   
   if (check == str.length()) {   
      System.out.print(str.charAt(check -= 1) + " ");   
    } else {   
      System.out.print(str.charAt(0) + " ");   
   }   
  }   
}  