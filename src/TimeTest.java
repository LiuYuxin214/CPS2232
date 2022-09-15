public class TimeTest {
    public static void main(String[] args) {
        //获得系统的时间，单位为毫秒,转换为妙
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;

//求出现在的秒
        long currentSecond = totalSeconds % 60;

//求出现在的分
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

//求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

//显示时间
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}

