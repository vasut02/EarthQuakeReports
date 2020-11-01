package com.example.earthquakereports;

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long TimeInMilliseconds;
    private String url;

    public Earthquake(double mMagnitude, String mPlace, long mTime , String url) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.TimeInMilliseconds = mTime;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return TimeInMilliseconds;
    }
}
