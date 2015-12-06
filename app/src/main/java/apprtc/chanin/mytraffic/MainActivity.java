package apprtc.chanin.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind Widge
        bindwidget();

        // boutton controller
        buttonController();
        //ListView Controller
        ListViewcontroller();

    }// main Method

    private void ListViewcontroller() {

        //For Icon แหล่งกำเนิดภาพ
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
                R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
                R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
                R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};
        //for Title สำหรับไตเติ้ล
        String[] titleStrings = new String[20];
        titleStrings[0] = "หัวข้อที่ 1";
        titleStrings[1] = "หัวข้อที่ 2";
        titleStrings[2] = "หัวข้อที่ 3";
        titleStrings[3] = "หัวข้อที่ 4";
        titleStrings[4] = "หัวข้อที่ 5";
        titleStrings[5] = "หัวข้อที่ 6";
        titleStrings[6] = "หัวข้อที่ 7";
        titleStrings[7] = "หัวข้อที่ 8";
        titleStrings[8] = "หัวข้อที่ 9";
        titleStrings[9] = "หัวข้อที่ 10";
        titleStrings[10] = "หัวข้อที่ 11";
        titleStrings[11] = "หัวข้อที่ 12";
        titleStrings[12] = "หัวข้อที่ 13";
        titleStrings[13] = "หัวข้อที่ 14";
        titleStrings[14] = "หัวข้อที่ 15";
        titleStrings[15] = "หัวข้อที่ 16";
        titleStrings[16] = "หัวข้อที่ 17";
        titleStrings[17] = "หัวข้อที่ 18";
        titleStrings[18] = "หัวข้อที่ 19";
        titleStrings[19] = "หัวข้อที่ 20";
        // for Detail สำหรับรายละเอียด
        String[] detailStrings = getResources().getStringArray(R.array.detail_short);
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, titleStrings, detailStrings, intIcon);

        trafficListView.setAdapter(objMyAdapter);
        // ListViewcontroller


    }

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mosquito);
                buttonMediaPlayer.start();
                //intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/yzTuBuRdAyA"));
                startActivity(objIntent);
            } // event
        });
    }

    private void bindwidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }
}// main Class นี้ คือ คลาสหลัก

