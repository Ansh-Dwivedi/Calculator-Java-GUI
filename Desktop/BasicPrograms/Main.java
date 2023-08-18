import java.util.Scanner;

class Main {

	public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      // NumberPrograms np = new NumberPrograms();
      System.out.print("\n-> Press Capital 'N' for Number Programs.\n\t---------------\n-> Press Capital 'S' for String Programs.\n\nchoose: ");
   
      char choose =scan.next().charAt(0);

      if (choose == 'N') {
         
      do {
         System.out.println("\t+++++++++++ Welcome to Basic Number Programs :++++++++++++\n");
         System.out.println("1.  Press 1, for Sum and Product of Natural number.");
         System.out.println("2.  Press 2, for Greatest number.");
         System.out.println("3.  Press 3, for Even Odd number.");
         System.out.println("4.  Press 4, for Perfect number.");
         System.out.println("5.  Press 5, for Swap number.");
         System.out.println("6.  Press 6, for Reverse number.");
         System.out.println("7.  Press 7, for Palindrom number.");
         System.out.println("8.  Press 8, for Fibonacci series.");
         System.out.println("9.  Press 9, for Prime number.");
         System.out.println("10. Press 10, for Factorial number.");
         System.out.println("11. Press 11, for Armestrong number.");
        
          
         System.out.print("\nEnter your choice: ");
         int choice = scan.nextInt();  
          
      // objectnumberEvenOdd() of numberprogram class
         
      switch(choice) {
             
      case 1 :  System.out.println("\t======SumAndProductOfNaturalNumber:======");
                BasicPrograms.numberSumandProduct();
                System.out.println("--------------------------------");
      break;
      case 2 :  System.out.println("\t======GreatestNumber:======");
                BasicPrograms.numberGreatest();
                System.out.println("--------------------------------");
      break;
      case 3 :  System.out.println("\t======EvenOddNumber:======"); 
                BasicPrograms.numberEvenOdd(); 
                System.out.println("--------------------------------");
      break;      
      case 4 :  System.out.println("\t======PerfectNumber:======");
                BasicPrograms.numberPerfect();
                System.out.println("--------------------------------");
      break;        
      case 5 :  System.out.println("\t======SwapNumber:======");
                BasicPrograms.numberSwap();
                System.out.println("--------------------------------");
      break;
      case 6 :  System.out.println("\t=======ReverseNumber:======");
                BasicPrograms.numberReverse();
                System.out.println("--------------------------------");   
      break;
      case 7 :  System.out.println("\t=======PalindromNumber:======");
                BasicPrograms.numberPalindrom();
                System.out.println("\n--------------------------------");   
      break;
      case 8 :  System.out.println("\t=======FinonacciSeries:======");
                BasicPrograms.fibonacciSeries();
                System.out.println("\n--------------------------------");   
      break;
      case 9 :  System.out.println("\t=======PrimeNumber:======");
                BasicPrograms.numberPrime();
                System.out.println("\n--------------------------------");   
      break;
      case 10 : System.out.println("\t=======Factorial Number:======");
                BasicPrograms.numberFactorial();
                System.out.println("\n--------------------------------");    
      break;
      case 11 : System.out.println("\t=======Armstrong Number:======");
                BasicPrograms.numberArmstrong();
                 System.out.println("\n--------------------------------");    
      break;
      case 0 : if (choice==0) {
                  break;         
              }
      default: System.out.println("\nInvaild choice try again...");
      }
         System.out.println("\nPress key 1/ try again.\n------------------------- \nPress key 0/ exit program. ");
    } while(1==scan.nextInt()); 
 

// ==============================[STRING'S]======================================        
   }  else if (choose == 'S') { 
  
      do {
         System.out.println("\t+++++++++++ Welcome to Basic String Programs ++++++++++++\n");
         System.out.println("1. Press 'a', for A to Z Alphabet.");
         System.out.println("2. Press 'b', for Reverse String.");
         System.out.println("3. Press 'c', for Count total Character of strings after remove space.");
         System.out.println("4. Press 'd', for Actual string after remove space.");
         System.out.println("5. Press 'e', for Count total punctuation of strings.");
         System.out.println("6. Press 'f', for Count total vowels and consonants of strings.");
         System.out.println("7. Press 'g', for String anagram or not.");
         System.out.print("\nEnter your choice: ");   
         char ch = scan.next().charAt(0);
       
      switch (ch) {

         case 'a':  System.out.println("\n\t--------AlphabetsAtoZ:--------");
                    BasicPrograms.alphabetsAtoZ();
                    System.out.println("\n--------------------------------");
         break;
         case 'b':  System.out.print("\n\t---------ReverseString:---------"); 
                    BasicPrograms.stringReverse();
                    System.out.println("\n--------------------------------");
         break;
         case 'c':  System.out.print("\n\t---------TotalCharacterOfString:---------\n"); 
                    BasicPrograms.countTotalCharString();
                    System.out.println("\n--------------------------------");
         break;
         case 'd':  System.out.print("\n\t---------ActualStringAfterRemoveSpace:---------\n"); 
                    BasicPrograms.totalString();
                    System.out.println("\n--------------------------------");
         break;
         case 'e':  System.out.print("\n\t---------TotalPunctuationOfString:---------\n"); 
                    BasicPrograms.countPunctuation();
                    System.out.println("\n--------------------------------");
         break;
         case 'f':  System.out.print("\n\t---------CountVowelsAndConsonant:---------\n"); 
                    BasicPrograms.countVowelsOrConsonant();
                    System.out.println("\n--------------------------------");
         break;
         case 'g':  System.out.print("\n\t---------StringAnagramOrNot:---------\n"); 
                    BasicPrograms.stringAnagram();
                    System.out.println("\n--------------------------------");
         break;
      
         case 'x':  if (ch=='x') {
                    System.out.println("Program exit thank you...");
                        break;  
                     }    
         default :   System.out.println("\nInvalid choice try again...");
         }
      
        System.out.println("\nPress key 't' / try again.\n------------------------\nPress key 'x' / exit program.");
    } while('t'==scan.next().charAt(0));
  
    } else {
         System.out.println("\nInvalid choice please choose valid choice 'N' otherwise 'S'.");
      } 
        
  //      System.out.print("Enter choice: ");     
  //      int array = scan.nextInt();  
  
  //     switch(array) {
  //     case 1:  
  //            BasicPrograms.number1To10();
  //     break;
  // }

  }
}
      