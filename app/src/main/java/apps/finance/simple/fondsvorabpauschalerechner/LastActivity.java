package apps.finance.simple.fondsvorabpauschalerechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;

public class LastActivity extends AppCompatActivity {

    private AdView mAdView;
    private double anfang;
    private double ende;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MobileAds.initialize(this, "ca-app-pub-5274221094683248~5856335647");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
