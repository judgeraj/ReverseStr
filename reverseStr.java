public void reverseString(char[] s) {
       reverse(0, s.length - 1, s);
       return;
   }
    
   public void reverse(int index, int last, char[] s) {
       if(index > last) {
           return;
       }
       //swap
       char temp = s[index];
       s[index] = s[last];
       s[last] = temp;
            
       reverse(++index, --last, s);
}
