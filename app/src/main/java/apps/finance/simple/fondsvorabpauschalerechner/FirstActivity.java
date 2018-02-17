package apps.finance.simple.fondsvorabpauschalerechner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;

public class FirstActivity extends AppCompatActivity {

    private AdView mAdView;
    private double anfang;
    private double ende;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MobileAds.initialize(this, "ca-app-pub-5274221094683248~5856335647");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final EditText txtAnfang = findViewById(R.id.txtJahresanfang);
        final EditText txtEnde = findViewById(R.id.txtJahresende);
        Button weiter = findViewById(R.id.button);
        weiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anfang = Double.parseDouble(txtAnfang.getText().toString());
                ende = Double.parseDouble(txtEnde.getText().toString());
                Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);
                myIntent.putExtra("anfang", anfang); //Optional parameters
                myIntent.putExtra("ende", ende); //Optional parameters
                FirstActivity.this.startActivity(myIntent);
            }
        });


    }
}
