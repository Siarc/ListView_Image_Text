package com.example.aminu.nowtest;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    String [] arcTitles;
    String [] arcDetails;
    int[] images ={R.drawable.eco1_quality,R.drawable.eco2_custom_size,R.drawable.eco3_factory_pric,R.drawable.eco4_short_production,R.drawable.eco5_free_deliver,R.drawable.eco6_sample_provided};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res= getResources();

        arcTitles=res.getStringArray(R.array.titles);
        arcDetails=res.getStringArray(R.array.details);

        ListView listView = (ListView)findViewById(R.id.arcListView);
        CustomAdapter arcAdapter= new CustomAdapter(this, arcTitles,images,arcDetails);
        listView.setAdapter(arcAdapter);


        //Previous code

        /*ListAdapter arcAdapter = new CustomAdapter(this, points);
        ListView arcListView = (ListView) findViewById(R.id.arcListView);
        arcListView.setAdapter(arcAdapter);

        arcListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String topic = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this,topic,Toast.LENGTH_LONG).show();
                    }
                }
        );
        */
    }
}
