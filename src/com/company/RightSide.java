package com.company;

public class RightSide {
    int simple=0;
    int twiceSquare=0;
    int resSum;

    public int RightSide() {
        boolean trying = true;
        while (trying)
        {
            if(simple%3==0 ||simple%4==0||simple%5==0||simple%6==0||simple%7==0||simple%8==0||simple%9==0)
            {
                simple++;
            }
        }
        return resSum;
    }
}
