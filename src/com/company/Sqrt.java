package com.company;

public class Sqrt {
    int twiceSqrt;
    int multiplier;


    public void SetMultiplier(int multiplier)
    {
        this.multiplier=multiplier;
    }
    public int GetTwiceSqrt()
    {
        return twiceSqrt;
    }
    public int getMultiplier()
    {
        return multiplier;
    }

    public int twiceSqrt(int multiplier)
    {
        twiceSqrt=2*multiplier*multiplier;
        return twiceSqrt;
    }

}
