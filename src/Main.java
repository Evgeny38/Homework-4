public class Main {
    public static void main(String[] args) {
        System.out.println("Hello good people!");
        // TASK 1.
        int day = 1;
        while (day < 11) {
            System.out.print(" " + day++);
        }
        System.out.println();

        for (int b=10; b>0; b--) {
            System.out.print(" " + b);
        }
        System.out.println();

        //TASK 2.

        for (int wildFriday = 3; wildFriday <= 31; wildFriday=wildFriday+7 ) {
            System.out.println("Сегодня пятница, " + wildFriday + "-е число. Cдай отчет и спи спокойно!");
        }

        // TASK 3.
        int nowDay = 2022;
        int begin = nowDay - 200;
        int end = nowDay + 100;
        for (int comet = 0; comet <= end; comet = comet  + 79){
            if (comet > begin) {
                System.out.println( comet);
            }


        }

    }
}