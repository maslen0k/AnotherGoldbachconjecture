package com.company;

/*Кристиан Гольдбах показал, что любое нечетное составное число можно записать в виде суммы простого числа и удвоенного квадрата.

9 = 7 + 2×1^2
15 = 7 + 2×2^2
21 = 3 + 2×3^2
25 = 7 + 2×3^2
27 = 19 + 2×2^2
33 = 31 + 2×1^2

Оказалось, что данная гипотеза неверна.

Каково наименьшее нечетное составное число, которое нельзя записать в виде суммы простого числа и удвоенного квадрата?*/

public class Main {

    public static void main(String[] args) {

        SimpleNumber simpleNumber1=new SimpleNumber();

        OddCompositeNumber oddCompositeNumber=new OddCompositeNumber();

        oddCompositeNumber.SetOddCompositeNumber(1690);

        SimpleNumber simpleNumberForCheck=new SimpleNumber();

        Sqrt sqrt=new Sqrt();

        int multiplier=1;

        int simpleNumber;

        int temp;

        int ourNumber=0;
        boolean isntFind = true;


        int count=0;
        //делаем до тех пор, пока не найдём нужное число
        //Находим составное нечётное число
        //Делим его на два, и из получившегося числа извлекаем корень
        //делаем до тех пор, пока множитель не равен нулю
        //записываем это число как множитель(multiplier)
        //возводим этот множитель в квадрат и умножаем на два, записываем получившееся в переменную
        //от составного нечётного числа отнимаем получившееся в предыдущем шаге значение
        //проверяем остаток простое это число или нет
        //если простое, идём к следующему составному нечётному числу
        //если составное, уменьшаем множитель (до тех пор, пока множитель не станет 0)
        //если множитель равен нулю, значит число найдено
        //возвращаем составное нечётное число
        boolean found=false;

            while(multiplier!=0) {
                oddCompositeNumber.FindOddCompositeNumber();
                ourNumber=oddCompositeNumber.GetOddCompositeNumber();
                multiplier = (int) Math.sqrt(ourNumber / 2);
                int remains = ourNumber - sqrt.twiceSqrt(multiplier);
                if(simpleNumberForCheck.isSimple(remains)==true)
                {
                    temp= oddCompositeNumber.GetOddCompositeNumber();
                    temp++;
                    oddCompositeNumber.SetOddCompositeNumber(temp);
                }
                else
                {
                    multiplier--;
                }
                System.out.println(ourNumber);
            }

        System.out.println("Наименьшее нечётное число, которое нельзя записать в виде\nсуммы простого и составного числа и удвоенного квадрата: "+ourNumber);

      //  while (isntFind)
      //  {
      //      oddCompositeNumber.FindOddCompositeNumber(); //находим составное нечётное число
      //      int oddCompositeNumber1= oddCompositeNumber.GetOddCompositeNumber();
      //
      //     //находим простое число(слагаемое) и проверяем его на простоту
      //
      //      multiplier= (int) Math.sqrt(oddCompositeNumber1/2);//находим множитель
      //
      //      sqrt.SetMultiplier(multiplier);
      //
      //      sqrt.TwiceSqrt();
      //
      //      simpleNumber=oddCompositeNumber.GetOddCompositeNumber()- sqrt.GetTwiceSqrt();
      //
      //      simpleNumber1.isSimple(simpleNumber);
      //
      //     for(int i=0; i<oddCompositeNumber.GetOddCompositeNumber(); i++)
      //     {
      //
      //         if(simpleNumber1.isSimple)
      //         {
      //             temp=oddCompositeNumber.GetOddCompositeNumber();
      //             oddCompositeNumber.SetOddCompositeNumber(++temp);
      //            // то увеличиваем oddCompositeNumber1;
      //         }
      //         else //если число составное, значит уменьшаем множитель до тех пор, пока не найдём простое число или множитель не станет нулю
      //
      //             if(multiplier!=0)
      //             {
      //                 multiplier--;
      //                 sqrt.SetMultiplier(multiplier);
      //             }
      //             else
      //             {
      //                 break;
      //             }
      //
      //     }
      //      isntFind=false;
      //  }

      //  System.out.println("Наименьшее нечётное число, которое нельзя записать в виде\nсуммы простого и составного числа и удовенного квадрата: "+oddCompositeNumber.GetOddCompositeNumber());




    }
}
