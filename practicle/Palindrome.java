class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=1111; 
  System.out.println(n);
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  } 
  
  System.out.println(sum);
   
  if(temp==sum)    
   System.out.println("palindrome number ");
  else   
   System.out.println("not palindrome");    
  } 
} 