package io.benjamin.coronavirustracker.models;

public class LocationStats {

    private String location;
    // Combined_Key will give state and city in the db
    private int latestTotalCases;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
}
