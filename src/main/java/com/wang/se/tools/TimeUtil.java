package com.wang.se.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author lijinhua
 * @version 创建时间：2015年7月20日 下午3:57:09
 */

public class TimeUtil {

    public static final String DATE_YYYY_MM = "yyyy-MM";
    public static final String DATE_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String DATE_YYYY_M_MDD = "yyyyMMdd";
    public static final String DATE_YYYY_M_MDD_H_HMMSS = "yyyyMMddHHmmss";
    public static final String DATE_YYYY_MM_CN = "yyyy年MM月";
    public static final String DATE_YYYY_MM2 = "yyyyMM";
    public static final String DATE_YYYY_M_MDD_H_HMMSS_SSSS = "yyyyMMddHHmmssSSSS";
    public static final String DATE_YYMMDDHHMM = "yyMMddHHmm";
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String DATE_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static final Logger logger = LoggerFactory.getLogger(TimeUtil.class);

    /**
     * 格式化某个月的第一天
     *
     * @param date
     * @param format
     * @return
     */
    public static String getFirstOfMonthFormat(Date date, String format) {
        return dateToString(getFirstOfMonth(date), format);
    }

    /**
     * 输出某个月的第一天
     *
     * @param date
     * @return
     */
    public static Date getFirstOfMonth(Date date) {
        date = stringToDate(dateToString(date, DATE_YYYY_M_MDD), DATE_YYYY_M_MDD);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    /**
     * 格式化某月的最后一天
     *
     * @param date
     * @param format
     * @return
     */
    public static String getLastOfMonthFormat(Date date, String format) {
        return dateToString(getLastOfMonth(date), format);
    }

    /**
     * 返回一个月的最后一天
     *
     * @param date
     * @return
     */
    public static Date getLastOfMonth(Date date) {
        date = stringToDate(dateToString(date, DATE_YYYY_M_MDD) + "235959", DATE_YYYY_M_MDD_H_HMMSS);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DATE, 1);
        cal.roll(Calendar.DATE, -1);
        Date endTime = cal.getTime();

        return endTime;

    }

    public static String dateToString(Date date, String format) {
        if (date == null)
            return "";
        SimpleDateFormat myFormatter = new SimpleDateFormat(format);
        return myFormatter.format(date);
    }

    /**
     * String To Date yyyy-MM-dd HH:mm:ss
     *
     * @param stringdate
     * @return
     */
    public static Date stringToDate(String stringdate, String formt) {
        SimpleDateFormat fdate = new SimpleDateFormat(formt);
        Date date = null;
        try {
            date = fdate.parse(stringdate);
        } catch (ParseException e) {
            logger.error("Format date fail !" + stringdate + " , " + formt);
        }
        return date;
    }

    public static Date addSec(Date date, int sec) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, sec);
        return cal.getTime();

    }

    public static Date minute(Date date, int minute) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, minute);
        return cal.getTime();

    }

    public static Date hour(Date date, int hour) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hour);
        return cal.getTime();

    }

    public static Date addOneDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);

        return cal.getTime();

    }

    public static Date addDay(Date date, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);

        return cal.getTime();

    }

    public static Date addMonth(Date date, int month) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        return cal.getTime();
    }

    public static Date addCustomMonth(Date date, int month) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, month);
        return cal.getTime();
    }

    public static int getLeftSecondOfMidnight() {
        Long expireTime = 0L;
        try {
            Calendar now = Calendar.getInstance();
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH) + 1;
            int day = now.get(Calendar.DAY_OF_MONTH);
            long startTime = now.getTime().getTime();
            long endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(year + "-" + month + "-" + +day + " 23:59:59").getTime();
            expireTime = (endTime - startTime) / 1000;
        } catch (ParseException e) {
            logger.error("SimpleDateFromat error", e);
        }
        return expireTime.intValue();
    }

    /**
     * 获取某天的前、后某天
     *
     * @param specifiedDay 指定某天
     * @param flag         时间格式yyyy-MM-dd，yyyy-MM-dd HH:mm:ss
     * @param offset       时间偏移量
     * @return 前、后某天
     */
    public static String getSpecifiedDayBeforeOrAfter(String specifiedDay, String flag, int offset) {
        Calendar c = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat(flag).parse(specifiedDay);
        } catch (ParseException e) {
            logger.error("Util getSpecifiedDayBeforeOrAfter:" + e.getMessage(), e);
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day + offset);
        String dayBefore = new SimpleDateFormat(flag).format(c.getTime());
        return dayBefore;
    }

    public static long leftMilliseconds2NextDay() {
        long left = 0;
        final long daysMillions = 86400000L;
        try {
            final DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String formatDate = format.format(date);
            long lastday = format.parse(formatDate).getTime();
            long millions = date.getTime() - lastday;
             left = daysMillions - millions;
        } catch (ParseException e) {
            logger.error("time format error");
        }
        return left;

    }

}


