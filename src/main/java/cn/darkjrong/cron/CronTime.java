package cn.darkjrong.cron;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cron有效时间
 *
 * @author Rong.Jia
 * @date 2024/05/08
 */
public class CronTime {
    
    private static final Logger log = Logger.getLogger(CronTime.class.getName());

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 下次运行时间
     *
     * @param cron CRON表达式
     * @param count 运行次数
     * @return {@link List}<{@link String}>
     */
    public static List<String> nextTime(String cron, Integer count) {
        List<String> result = new ArrayList<>();
        Date lastTime = new Date();
        for (int i = 0; i < count; i++) {
            lastTime = generateNextValidTime(cron, lastTime);
            if (lastTime != null) {
                result.add(DATE_FORMAT.format(lastTime));
            }
        }
        return result;
    }

    /**
     * 下次运行时间
     *
     * @param cron CRON表达式
     * @return {@link List}<{@link String}>
     */
    public static List<String> nextTime(String cron) {
        return nextTime(cron, 5);
    }

    /**
     * 下次运行时间
     *
     * @param cron CRON表达式
     * @return {@link String}
     */
    public static String nextOneTime(String cron) {
        List<String> nextTimes = nextTime(cron, 1);
        return nextTimes.size() <= 0 ? null : nextTimes.get(0);
    }

    /**
     * 生成下一个有效时间
     *
     * @param fromTime 时间
     * @param cron     CRON表达式
     * @return {@link Date}
     */
    private static Date generateNextValidTime(String cron, Date fromTime) {
        try {
            return new CronExpression(cron).getNextValidTimeAfter(fromTime);
        }catch (Exception e) {
            log.log(Level.FINE, String.format("CRON 【%s】 fails to obtain the next running time, exception 【%s】", cron, e.getMessage()));
        }
        return null;
    }


}
