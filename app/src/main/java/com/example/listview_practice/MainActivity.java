package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String [] CQUId = new String[]{"20161707","20161713","20171591","20171592",
            "20171616","20171627","20171641","20171649","20171650","20171653", "20171654",
            "20171655","20171656","20171659","20171664","20171666","20171667", "20171668",
            "20171669","20171670","20171679","20171688","20171697","20171705","20171707",
            "20171714","20171717","20171731","20171742","20175064","20175980","20175990"};
    private int [] imageId = new int[]{R.mipmap.emoji_kids02,R.mipmap.emoji_kids03,R.mipmap.emoji_kids04,R.mipmap.emoji_kids05,
            R.mipmap.emoji_kids06,R.mipmap.emoji_kids07,R.mipmap.emoji_kids08,R.mipmap.emoji_kids09,R.mipmap.emoji_kids10,R.mipmap.emoji_kids11, R.mipmap.emoji_kids12,
            R.mipmap.emoji_kids13,R.mipmap.emoji_kids14,R.mipmap.emoji_kids15,R.mipmap.emoji_kids16,R.mipmap.emoji_kids17,R.mipmap.emoji_kids18, R.mipmap.emoji_kids19,
            R.mipmap.emoji_kids20,R.mipmap.emoji_kids21,R.mipmap.emoji_kids22,R.mipmap.emoji_kids23,R.mipmap.emoji_kids24,R.mipmap.emoji_kids25,R.mipmap.emoji_kids26,
            R.mipmap.emoji_kids27,R.mipmap.emoji_kids28,R.mipmap.emoji_kids29,R.mipmap.emoji_kids30,R.mipmap.emoji_kids31,R.mipmap.emoji_kids32,R.mipmap.emoji_kids33};


    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView)findViewById(R.id.list_view);
        MyAdapter myAdapter = new MyAdapter();
        listview.setAdapter(myAdapter);
    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return CQUId.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.list_item,null);
            ImageView ivImage = (ImageView) findViewById(R.id.iv_list_item);
            TextView tvName =(TextView) view.findViewById(R.id.tv_list_item);
            ivImage.setImageResource(imageId[position]);
            tvName.setText(CQUId[position]);
            return view;
        }
    }
}
