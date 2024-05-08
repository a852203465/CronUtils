package cn.darkjrong.cron;

import org.junit.jupiter.api.Test;

public class CronTimeTest {

    @Test
    void nextTime() {
        String cron = CronBuilder.builder().minutes().build();
        System.out.println(cron);
        System.out.println(CronTime.nextTime(cron));
    }

    @Test
    void nextTime2() {
        String cron = CronBuilder.builder().hours(2).dayOfMonth(1).build();
        System.out.println(cron);
        System.out.println(CronTime.nextTime(cron));
    }

    @Test
    void nextTime3() {
        String cron = CronBuilder.builder().hours(12,14,54,66).seconds(4,12,64,12).month().build();
        System.out.println(CronTime.nextTime(cron));
    }

    @Test
    void nextTime4() {
        String a4 = CronBuilder.builder().seconds(40,43, true)
                .minutes(0)
                .hours(0)
                .build();
        System.out.println(a4);
        System.out.println(CronTime.nextTime(a4, 20));
    }

    @Test
    void nextTime5() {
        String a4 = CronBuilder.builder()
                .hours(0)
                .build();
        System.out.println(a4);
        System.out.println(CronTime.nextTime(a4, 30));
    }




}
