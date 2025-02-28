public class ReverseOfEachCharacter {
    public static void main(String[] args) {
        String str="welcome to java";
        String[] str1=str.split(" ");
    
        String result="";
        for(int i=0;i<str1.length;i++) {
            String revofeachChar="";
            for(int j=str1[i].length()-1;j>=0;j--) {
                revofeachChar=revofeachChar+str1[i].charAt(j);
            }
            result=result+revofeachChar+" ";
        }
        System.out.println("reverse of each character is: "+result);	
    }
}

class ReverseOfEachCharacterWithWord {
    public static void main(String[] args) {
        String str="welcome to java";
        String[] str1=str.split(" ");
    
        String result="";
        for(int i=str1.length-1;i>=0;i--) {
            String revofeachChar="";
            for(int j=str1[i].length()-1;j>=0;j--) {
                revofeachChar=revofeachChar+str1[i].charAt(j);
            }
            result=result+revofeachChar+" ";
        }
        System.out.println("reverse of each character is: "+result);	
    }
}