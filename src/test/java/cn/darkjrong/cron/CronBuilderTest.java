package cn.darkjrong.cron;

import org.junit.jupiter.api.Test;

public class CronBuilderTest {

    public static void main(String[] args) {

        String perSecond = CronBuilder.builder().seconds().build();
        System.out.println("perSecond :" + perSecond);

        System.out.println("-------------------------------------------------------");

        String perMinutes = CronBuilder.builder().minutes().build();
        System.out.println("perMinutes :" + perMinutes);

        System.out.println("-------------------------------------------------------");

        String perHours = CronBuilder.builder().hours().build();
        System.out.println("perHours :" +perHours);

        System.out.println("-------------------------------------------------------");

        String perDayOfMonth = CronBuilder.builder().dayOfMonth().build();
        System.out.println("perDayOfMonth :" +perDayOfMonth);

        System.out.println("-------------------------------------------------------");

        String perMonth = CronBuilder.builder().month().build();
        System.out.println("perMonth :" +perMonth);

        System.out.println("-------------------------------------------------------");

        String perDayOfWeek = CronBuilder.builder().dayOfWeek().build();
        System.out.println("perDayOfWeek :" +perDayOfWeek);

        System.out.println("-------------------------------------------------------");

        String perYear = CronBuilder.builder().year().build();
        System.out.println("perYear :" +perYear);

        System.out.println("-------------------------------------------------------");

        String a1 = CronBuilder.builder().hours(2).dayOfMonth(1).build();
        System.out.println(a1);

        System.out.println("-------------------------------------------------------");

        String a2 = CronBuilder.builder().minutes(12).dayOfWeek(4).build();
        System.out.println(a2);

        System.out.println("-------------------------------------------------------");

        String a3 = CronBuilder.builder().hours(12,14,54,66).seconds(4,12,64,12).month().build();
        System.out.println(a3);

        System.out.println("-------------------------------------------------------");

        String a4 = CronBuilder.builder().dayOfMonth(20, 5,true)
                .month(4,12,false).seconds(40,43, true).build();
        System.out.println(a4);

        System.out.println("-------------------------------------------------------");

        String a5 = CronBuilder.builder().dayOfMonth(20, 5,false)
                .month(4,12,true).seconds(40,43, false)
                .hours(34).minutes(30,54,false).build();
        System.out.println(a5);

        System.out.println("-------------------------------------------------------");

        String a6 = CronBuilder.builder().month(4,12,true).hours()
                .hours(34).minutes(30,54,false).build();
        System.out.println(a6);

        System.out.println("-------------------------------------------------------");

        String a7 = CronBuilder.builder().year(2021, 2022).month(2).dayOfMonth(30).hours(23).minutes(59).seconds(33).build();
        System.out.println(a7);

        System.out.println("-------------------------------------------------------");

        String a8 = CronBuilder.builder().year(2021).month(2)
                .dayOfMonth(30).hours(23).minutes(59).seconds(33).build();
        System.out.println(a8);


        System.out.println("-------------------------------------------------------");

        String a9 = CronBuilder.builder()
                .seconds(-1)
                .minutes(-1)
                .hours(-1)
                .dayOfMonth(-1)
                .month(-1)
                .dayOfWeek(-1)
                .year(-1)
                .build();
        System.out.println("a9 : " + a9);

    }

    @Test
    public void dayOfWeek() {

//        System.out.println(CronBuilder.builder().dayOfMonth().dayOfWeek(1,4, false).build());


//        String a2 = CronBuilder.builder().minutes(12).dayOfMonth().dayOfWeek(4).build();
//        System.out.println(a2);

        String a3 = CronBuilder.builder().minutes(12).dayOfMonth().dayOfWeek(4).build();
        System.out.println(a3);

    }

    @Test
    public void dayOfMonth() {

        String a3 = CronBuilder.builder().minutes(12).dayOfMonth(1,2).dayOfWeek(1,3).build();
        System.out.println(a3);

        System.out.println(CronBuilder.builder().dayOfMonth(1, 2).build());

        System.out.println(CronBuilder.builder().dayOfMonth(2, 4, true).build());


    }














}
