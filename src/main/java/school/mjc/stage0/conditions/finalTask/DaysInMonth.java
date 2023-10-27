package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int remainder4,remainder100,remainder400;
        boolean leap;
        remainder4=year%4;
        remainder100=year%100;
        remainder400=year%400;
         if(year>0 && (month>0 && month<13))
         {
             switch(remainder4)
             {
                 case 0:
                     switch (remainder100)
                     {
                         case 0:
                             switch (remainder400)
                             {
                                 case 0:
                                     leap = true;
                                     break;
                                 default:
                                     leap = false;
                                     break;
                             }
                         default:
                             leap = true;
                             break;
                     }
                     break;
                 default:
                     leap = false;


             }
             switch(month)
             {
                 case 1:
                 case 12:
                 case 10:
                 case 8:
                 case 7:
                 case 5:
                 case 3:
                     System.out.println("31");
                     break;
                 case 2:
                     if(leap)
                         System.out.println("29");
                     else
                         System.out.println("28");

                 default:
                     System.out.println("30");

             }

         }
         else
             System.out.println("invalid date");

    }
}
