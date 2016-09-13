package de.psdev.licensesdialog.licenses;

import android.content.Context;

/**
 * Created by deanwild on 13/09/16.
 */
public class CustomLicense extends License {
    private final String licenseName;
    private final String licenseSummary;
    private final String licenseBody;
    private final String licenseVersion;
    private final String licenseUrl;

    public CustomLicense(
            String licenseName,
            String licenseSummary,
            String licenseBody,
            String licenseVersion,
            String licenseUrl) {

        this.licenseName = licenseName;
        this.licenseSummary = licenseSummary;
        this.licenseBody = licenseBody;
        this.licenseVersion = licenseVersion;
        this.licenseUrl = licenseUrl;

    }

    @Override
    public String getName() {
        return licenseName;
    }

    @Override
    public String readSummaryTextFromResources(Context context) {
        return licenseSummary;
    }

    @Override
    public String readFullTextFromResources(Context context) {
        return licenseBody;
    }

    @Override
    public String getVersion() {
        return licenseVersion;
    }

    @Override
    public String getUrl() {
        return licenseUrl;
    }
}
