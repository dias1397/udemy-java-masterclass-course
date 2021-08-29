package com.joaodias.section04;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }

        return String.format("%02dh %02dm %02ds", minutes / 60, minutes % 60, seconds);
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }
}
