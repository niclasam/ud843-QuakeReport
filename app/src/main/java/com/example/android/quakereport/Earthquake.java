package com.example.android.quakereport;

public class Earthquake {

    private String mLocation;

    private String mMagnitude;

    private String mTime;

    /***
     * Create a Earthquake object
     *
     * @param vLocation Location of the earthquake
     * @param vMagnitude
     * @param vTime
     */
    public Earthquake(String vLocation, String vMagnitude, String vTime)
    {
        mLocation = vLocation;
        mMagnitude = vMagnitude;
        mTime = vTime;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getTime() {
        return mTime;
    }
}
