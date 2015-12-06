package apprtc.chanin.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //Bind Widget
        bindWidget();

        //Show View
        showview();



    }// main Method

    private void showview() {
        //Receive Value From Intent
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        trafficImageView.setImageResource(intIcon);

        String[] srtDetail = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(srtDetail[intIndex]);
    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

    }

}// main class

