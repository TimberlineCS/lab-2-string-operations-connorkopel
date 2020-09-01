//Connor Kopel
//Ap comp A
//8/28/2020
//challenge 1
public class stringOperations{
  public static void main(String args[]){

String word1 = "scissors";
int wordlength = word1.length()/2;
String firstHalf = word1.substring(0,wordlength);
String secondHalf = word1.substring(wordlength);
String backwardsWord = (secondHalf + firstHalf);
System.out.println(backwardsWord);

String word2 = "picture";
int wordlength2 = word2.length()/2;
String firstHalf2 = word2.substring(0,wordlength2);
String secondHalf2 = word2.substring(wordlength2);
String backwardsWord2 = (secondHalf2 + firstHalf2);
System.out.println(backwardsWord2);

String word3 = "computer";
int wordlength3 = word3.length()/2;
String firstHalf3 = word3.substring(0,wordlength3);
String secondHalf3 = word3.substring(wordlength3);
String backwardsWord3 = (secondHalf3 + firstHalf3);
System.out.println(backwardsWord3);


//challenge 2
System.out.println("      ________");
System.out.println("     /_______/\\");
System.out.println("     \\ \\    / /");
System.out.println("   ___\\ \\__/_/___");
System.out.println("  /____\\ \\/_____/\\");
System.out.println("  \\ \\   \\/ /   / /");
System.out.println("   \\ \\  / /\\  / /");
System.out.println("    \\ \\/ /\\ \\/ /");
System.out.println("     \\_\\/  \\_\\/");
}
}