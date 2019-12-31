package com.example.hw18_listviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView show_1;
    private ListView list_1;
    String[] str={"item1","item2","item3","item4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_1=findViewById(R.id.tv1);
        list_1=findViewById(R.id.list1);


        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, str); //android.R.layout.simple_list_item_1 為內建樣式，還有其他樣式可自行研究
        list_1.setAdapter(adapter);

        list_1.setOnItemClickListener(onClickListView);


    }

    private AdapterView.OnItemClickListener onClickListView = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            show_1.setText("你選擇了: "+str[position]);
        }
    };

}



