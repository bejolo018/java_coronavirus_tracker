package io.benjamin.coronavirustracker.models;

public class LocationStats {

    private String location;
    // Combined_Key will give state and city in the db
    private int latestTotalCases;
    private int caseFlux;

    public int getCaseFlux() {
        return caseFlux;
    }

    public void setCaseFlux(int caseFlux) {
        this.caseFlux = caseFlux;
    }

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

    @Override
    public String toString() {
        return "LocationStats{" +
                "location='" + location + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
