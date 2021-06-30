# CRON表达式组装
 
 ## 使用, 详细使用查看测试类及注释
 ```java

    String a4 = CronBuilder.builder().dayOfMonth(20, 5,true)
                .month(4,12,false).seconds(40,43, true).build();
        System.out.println(a4);

        System.out.println("-------------------------------------------------------");

        String a5 = CronBuilder.builder().dayOfMonth(20, 5,false)
                .month(4,12,true).seconds(40,43, false)
                .hours(34).minutes(30,54,false).build();
        System.out.println(a5);

        System.out.println("-------------------------------------------------------");

```
 
 


