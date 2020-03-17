package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {
    private String[] StuInfo = new String[]{"There is the content of the information of the one you choose to check. " +
            "This is the initial content because the information of which student is still waiting to update."};
    private int[] imageId = new int[]{R.mipmap.emoji_kids02, R.mipmap.emoji_kids03, R.mipmap.emoji_kids04, R.mipmap.emoji_kids05,
            R.mipmap.emoji_kids06, R.mipmap.emoji_kids07, R.mipmap.emoji_kids08, R.mipmap.emoji_kids09, R.mipmap.emoji_kids10, R.mipmap.emoji_kids11, R.mipmap.emoji_kids12,
            R.mipmap.emoji_kids13, R.mipmap.emoji_kids14, R.mipmap.emoji_kids15, R.mipmap.emoji_kids16, R.mipmap.emoji_kids17, R.mipmap.emoji_kids18, R.mipmap.emoji_kids19,
            R.mipmap.emoji_kids20, R.mipmap.emoji_kids21, R.mipmap.emoji_kids22, R.mipmap.emoji_kids23, R.mipmap.emoji_kids24, R.mipmap.emoji_kids25, R.mipmap.emoji_kids26,
            R.mipmap.emoji_kids27, R.mipmap.emoji_kids28, R.mipmap.emoji_kids29, R.mipmap.emoji_kids30, R.mipmap.emoji_kids31, R.mipmap.emoji_kids32, R.mipmap.emoji_kids33};
    private String[] CQUId = new String[]{"20161707", "20161713", "20171591", "20171592",
            "20171616", "20171627", "20171641", "20171649", "20171650", "20171653", "20171654",
            "20171655", "20171656", "20171659", "20171664", "20171666", "20171667", "20171668",
            "20171669", "20171670", "20171679", "20171688", "20171697", "20171705", "20171707",
            "20171714", "20171717", "20171731", "20171742", "20175064", "20175980", "20175990"};
    ImageView imageView;
    TextView textView,textViewId;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent i = getIntent();
        position = i.getIntExtra("position",0);
        imageView = (ImageView)findViewById(R.id.iv_view_information);
        textView = (TextView) findViewById(R.id.tv_list_information);
        textViewId = (TextView) findViewById(R.id.tv_list_information_id);
        switch (position){
            default:
                imageView.setImageResource(imageId[position]);
                textView.setText(StuInfo[0]);
                textViewId.setText(textViewId.getText().toString()+CQUId[position]);
                break;
        }
    }
}
