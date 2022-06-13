package com.amrulwifa.forex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar loadingProgressBar;
    private SwipeRefreshLayout swipeRefreshLayout1;
    private TextView audTextView, bndTextView, usdTextView, btcTextView, hkdTextView, eurTextView, gbpTextView, inrTextView, jpyTextView, myrTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout1 = (swipeRefreshLayout)findViewById(R.id.swipeRefreshLayout1);
        audTextView = (TextView)findViewById(R.id.audTextView);
        bndTextView = (TextView)findViewById(R.id.bndTextView);
        usdTextView = (TextView)findViewById(R.id.usdTextView);
        btcTextView = (TextView)findViewById(R.id.btcTextView);
        hkdTextView = (TextView)findViewById(R.id.hkdTextView);
        eurTextView = (TextView)findViewById(R.id.eurTextView);
        gbpTextView = (TextView)findViewById(R.id.gbpTextView);
        inrTextView = (TextView)findViewById(R.id.inrTextView);
        jpyTextView = (TextView)findViewById(R.id.jpyTextView);
        myrTextView = (TextView)findViewById(R.id.myrTextView);
        loadingProgressBar =(ProgressBar)findViewById(R.id.loadingProgressbar);


    }
}