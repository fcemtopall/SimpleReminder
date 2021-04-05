package com.fcemtopall.suhatrlatc;

public class AlarmConstructor {

    private String wakeUpHour;
    private String wakeUpMinute;

    private long ayarlananZaman;

    public AlarmConstructor() {
    }

    public AlarmConstructor(String wakeUpHour, String wakeUpMinute, long ayarlananZaman) {
        this.wakeUpHour = wakeUpHour;
        this.wakeUpMinute = wakeUpMinute;
        this.ayarlananZaman = ayarlananZaman;
    }

    public String getWakeUpHour() {
        return wakeUpHour;
    }

    public void setWakeUpHour(String wakeUpHour) {
        this.wakeUpHour = wakeUpHour;
    }

    public String getWakeUpMinute() {
        return wakeUpMinute;
    }

    public void setWakeUpMinute(String wakeUpMinute) {
        this.wakeUpMinute = wakeUpMinute;
    }

    public long getAyarlananZaman() {
        return ayarlananZaman;
    }

    public void setAyarlananZaman(long ayarlananZaman) {
        this.ayarlananZaman = ayarlananZaman;
    }
}
