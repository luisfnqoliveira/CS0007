public class Time {



    public static void main(String []args)
    {

        int hours = 0;
        while(hours < 24)
        {
            int minutes = 0;
            while(minutes < 60)
            {
              int seconds = 0;
                while(seconds < 60){
                    System.out.println("The time is: " + hours + ":" + minutes + ":" + seconds);
                    seconds++;
                }
                minutes++;
            }
            hours++;

        }

    }

}
