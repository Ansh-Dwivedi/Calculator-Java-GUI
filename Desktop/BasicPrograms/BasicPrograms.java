import java.util.Scanner;
import java.util.Arrays;
class BasicPrograms {
    
    static Scanner sc =  new Scanner (System.in);
    static int n;
    static String string;
    static int [] arr;

/*==========================< NUMBER PROGRAM >============================*/
 
   // -------------------[SumAndProduct]---------------------
    public static void numberSumandProduct() {
    int sum=0;
    int product=1; 
    System.out.print("\nEnter a number: ");
    n = sc.nextInt();
    if (n<=0) {
    	System.out.println("\nInvalid input. Please enter a positive integer.");
        return;
    }
    // Calculate sum and product
    for (int i=1;i<=n ;i++ ) {
    	sum+=i;
    	product*=i;
    }
    System.out.println("\nThe sum of natural numbers up to " + n + " is: " + sum);
    System.out.println("The product of natural numbers up to " + n + " is: " + product);
}   

   //---------------[Greatest Number]-----------------------
    public static void numberGreatest() {
    int fnum, snum, tnum;
    System.out.print("\nEnter first number: ");
    fnum = sc.nextInt();
    System.out.print("Enter second number :");
    snum = sc.nextInt();
    System.out.print("Enter third number :");
    tnum = sc.nextInt();
    System.out.println("\nGiven numbers are: "+fnum+", "+snum+", "+tnum+"\n");
    if (fnum>snum && fnum>tnum) {
    	System.out.println(fnum+" is greater: ");
        
        } else if (snum>fnum && snum>tnum) {
        	System.out.println(snum+" is greater");
        } else {
            System.out.println(tnum+" is greater");
    }     
}   

    //-------------------[EvenOdd]--------------------------
    public static void numberEvenOdd() {
     int n, sumEven=0, sumOdd=0;
     System.out.print("\nEnter the number of elements: ");
     n=sc.nextInt();

     //-------------[EvenOddnumber]-------------------------
    
    // if (n%2==0) {
    // 	System.out.println(n+" is even");
    // } else {
    // 	System.out.println(n+" is odd");
    // }
            
   // ---------------[SumEvenOddnumber]--------------------
 /*      if (n%2==0) {
     	System.out.print("Even numbers: ");
     	for (int i=0;i<=n ;i=i+2) {
     		sumEven=sumEven+i;
     		System.out.print(i+" ");
     	}
     	System.out.println("\nSum of even numbers: "+sumEven);
     } else {
     	System.out.print("Odd numbers: ");
        for (int i=1;i<=n ;i=i+2) {
     		sumOdd=sumOdd+i;
     		System.out.print(i+" ");
     	}
     	System.out.println("\nSum of odd numbers: "+sumOdd); 	
    }*/
   // ----------------[SumEvenOdd]-------------------------- 
     for (int i=0; i< n;i++ ) {
            System.out.print("\nEnter a number " +( i + 1)+ " is: ");
            int num = sc.nextInt();
            if (num%2==0) {
                sumEven+=num;
                System.out.println(num+" is even.");
            } else {
                sumOdd+=num;
                System.out.println(num+" is odd.");
                
            }
        }
            System.out.println("\nSum of even numbers: "+sumEven);
            System.out.println("Sum of odd numbers: "+sumOdd);
    }

    // -----------------[Perfect Number]------------------------
    public static void numberPerfect() {
        System.out.print("\nEnter a number: ");
        n=sc.nextInt();
        int perfectSum=0;
        for (int i=1; i<n; i++ ) {
            if (n%i==0) {
               perfectSum +=i;
            }
        } if (n==perfectSum) {
               System.out.println(n+" is perfect.");
            } else {
                System.out.println(n+" is not perfect.");
        }
    } 
   
   // ------------------[Swap Number]---------------------------
    public static void numberSwap() {
        System.out.print("\nEnter a first number: ");
        int fnum = sc.nextInt();
        System.out.print("Enter a second number: ");
        int snum = sc.nextInt();
        
        System.out.println("\nBefore swap :" + fnum +" "+ snum);
        fnum = fnum + snum;      
        snum = fnum - snum;    
        fnum = fnum - snum;    
        System.out.println("After swap :" + fnum +" "+ snum);
    }

   // ----------------[Reverse Number]----------------------
    public static void numberReverse() {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        int rem;
        int rev=0;
        System.out.println("\nOriginal number: "+ n);
    while(n!=0) {
        rem = n%10;
        rev = rev*10 + rem;
        n=n/10;
    }
        System.out.println("Reverse number: "+rev);
}

    // -----------------[Palindrom Number]------------------
    public static void numberPalindrom() {
        System.out.print("\nEnter a number:\n");
        n = sc.nextInt();
        int org=n;
        int rem =0;
    while(n!=0) {
        rem = rem*10 + n%10;
        n=n/10;
    } if (rem==org) {
        System.out.println(org+" is palindrom number.");
    } else {
        System.out.println(org+" is not palindrom number.");
    }
}

   // -----------------[Fibonacci Series]-------------------
    public static void fibonacciSeries() {
       System.out.print("\nEnter a number: ");
       n = sc.nextInt();
       int a=0, b=1, c;
       System.out.print("Fibonacci series of "+ n +" is: "+ a +" "+ b +" ");
       for (int i=1; i<=n ; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");      
        }
    }  

    //-----------------[Prime Number]-----------------------
    public static void numberPrime() {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        int count=0;
        for (int i = 1; i<=n ; i++) {
            if (n%i==0) {
                count++;
            }
        } if (count==2) {
            System.out.println(n+ " prime number.");
        } else {
            System.out.println(n+ " is not prime number.");
        }
    }

    // ----------------[Factorial Number]-------------------
    public static void numberFactorial() {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();    
        int fact =1;
        for (int i=1;i<=n ; i++) {
            fact*=i;
           }
         System.out.println("Factorial of "+ n +" is: "+fact);  
    }

    // ----------------[Armstrong Number]-------------------
    public static void numberArmstrong() {
        System.out.print("\nEnter a number: ");
        n = sc.nextInt();
        int org =n;
        int rem, arm =0;
        while(n>0) {
         rem= n%10;
         arm = (rem*rem*rem) + arm ;
         n = n/10; 

        } if (org == arm) {
            System.out.println(org+ " is armstrong number.");
        } else {
            System.out.println(org+ " is not armstrong number.");
        }    
    }  
    
// ========================< STRING PROGRAM >============================
    
    // ------------------[Alphabets A to Z]----------------------
    public static void alphabetsAtoZ() {
        System.out.print("\nAlphabets A to Z: ");
        for (char ch = 'A';ch<='Z' ;ch++ ) {
            System.out.print(ch+" ");
        }
    }
    
    // -------------------[Reverse String]----------------------------
    public static void stringReverse() {
        System.out.print("\nEnter a string: ");
        string = sc.nextLine();
        String rev ="";
        // char ch[] = string.toCharArray();  //Reverse string step 1
        int length = string.length();
        System.out.println("Original string is: "+string);
        for (int i=length-1 ; i>=0 ; i--) {
            rev = rev + string.charAt(i);
            // rev = rev + ch[i]; 
        }
        System.out.println("Reverse string is: "+rev);
    }

    // ---------[Find total number character of string after Remove spaces]------------
    public static void countTotalCharString() {
        int count =0;
        System.out.print("\nEnter a string: ");
        string = sc.nextLine();
        // String string = "Java is good programming Language";
        int length = string.length();
        System.out.println("Total length of string: "+length);
        for (int i =0; i<length ; i++ ) {
            if (string.charAt(i)!=' ') {
               count++; 
            }
        } 
        System.out.println("Total character of strings after remove white space: "+count);
    }

    //------------[Find total character of string after remove space]-------------
    public static void totalString() {
        string = "Java is a secure and robust programming language";
        String s2=" ";
        System.out.println("\nActual string: "+string);
        for (int i=0; i<string.length() ; i++) {
            if (string.charAt(i)!=' ') {
                s2 = s2 + string.charAt(i);     
            }
        }
        System.out.println("fter remove space of strings are : "+s2);
    }
           
    // ---------[Count total punctuations (!,*,/,~,^,.) of string]-------------
    public static void countPunctuation() {
        int count =0;
        string="He said, ~The mailman $loves you. % I heard @it with:my own ears!";
        System.out.println("Original strings are: "+string);
        for (int i=0; i<string.length() ; i++ ) {
            if (string.charAt(i)=='~' || string.charAt(i)=='$' || string.charAt(i)==',' 
                || string.charAt(i)==':' || string.charAt(i)=='.' || string.charAt(i)=='%' || 
                string.charAt(i)=='@' || string.charAt(i)=='!'){
              
              count++;  
            } 
        }
        System.out.println("total punctuation of strings :"+count);
    }
    
    // -----------[Count vowels or consonant os strings]--------------
    public static void  countVowelsOrConsonant() {
       int vCount=0;
       int cCount=0;
       System.out.print("\nEnter the string: ");
       string = sc.nextLine();
       string = string.toUpperCase();
       for (int i =0; i<string.length() ;i++ ) {
            if (string.charAt(i)=='A' || string.charAt(i)=='E' || string.charAt(i)=='I' 
            || string.charAt(i)=='O' || string.charAt(i)=='U'  ) 
            {
                vCount++;
            } else if (string.charAt(i)>='A' && string.charAt(i)<='Z') {
                cCount++;   
            }
        } 
        System.out.println("Number of vowels: "+vCount);
        System.out.println("Number of consonant: "+cCount);
    }

    // --------------[String is anagram or not]------------------------
    public static void stringAnagram () {
       System.out.print("\nEnter first string: ");
       String sFirst = sc.next();
       System.out.print("Enter second string: ");
       String sSecond = sc.next();

    // step first conver string to lowercase
       sFirst = sFirst.toLowerCase();
       sSecond = sSecond.toLowerCase();
     
    // than second step covert string toCharArray
       char s1[] = sFirst.toCharArray();
       char s2[] = sSecond.toCharArray();

    // third step sort string using sort method of Array.sort()
       Arrays.sort(s1);
       Arrays.sort(s2);

    // Compare strings are equals
     boolean result = Arrays.equals(s1,s2);  

     if (result==true) {
          System.out.println("\nString is anagram.");
      } else {
          System.out.println("\nString is not anagram.");
      } 
    }  

/*================================< ARRAY PROGRAM >===================================*/
 
 public static void number1To10() {

// ArrayDeclaretion
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.print("Number 1 to 10: ");
    for (int n : num ) {
        System.out.print(n+" ");
    }
}

} 
 
    
