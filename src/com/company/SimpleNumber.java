package com.company;

public class SimpleNumber {

    boolean isSimple = true;
    int temp;
    public boolean isSimple(int simpleNumber) {
        for (int i = 2; i <= (int) Math.sqrt(simpleNumber); i++) {
            temp = simpleNumber % i;
            if (temp == 0) {
                isSimple = false;
                break;
            }
        }

        return isSimple;

    }
}








       // for (int i = 2; i < simpleNumber; i++) {
       //     if (simpleNumber % i == 0) {
       //         isSimple = false;
       //         i=simpleNumber;
       //         break;
       //     } else {
       //         isSimple = true;
       //         break;
       //     }
       // }



 //  public int SimpleNumber()
 //  {
 //      simpleNumber=3560;
 //      boolean trying = true;
 //      boolean simple=false;
 //      while (trying) {
 //          for (int i = 2; i < simpleNumber; i++)
 //          {
 //              if (simpleNumber % i == 0) {
 //                  i=2;
 //                  simpleNumber++;
 //              } else
 //                  simple = true;
 //          }
 //
 //          if (simple) {
 //              trying=false;
 //          }
 //          else
 //              {
 //              simpleNumber++;
 //          }
 //      }
 //      return simpleNumber;
 //  }



