package com.company;
import java.lang.Math;
//Нахождение составного нечётного числа



public class OddCompositeNumber {

    int oddCompositeNumber;

    public void FindOddCompositeNumber() //Находит составное нечётное число и записывает его в int oddCompositeNumber;
    {
            for(int i=2; i<oddCompositeNumber; i++)
            {
                if(oddCompositeNumber%i==0 && oddCompositeNumber%2!=0)

                {SetOddCompositeNumber(oddCompositeNumber);
                break;
                }

                else{
                    i=2;
                    oddCompositeNumber++;
                }
            }
    }

    public int GetOddCompositeNumber()
    {
        return oddCompositeNumber;
    }

    public void SetOddCompositeNumber(int oddCompositeNumber)
    {
        this.oddCompositeNumber=oddCompositeNumber;
    }
}
//WORKS!
//WORKS!