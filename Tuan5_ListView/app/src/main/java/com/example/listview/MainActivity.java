package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String FoodList[] = {"Món 1","Món 2","Món 3","Món 4","Món 5","Món 6","Món 7"};
    int foodImages[] = {R.drawable.logo , R.drawable.pizza , R.drawable.pop_1  ,R.drawable.pop_2,R.drawable.pop_3,R.drawable.pop_3,R.drawable.pop_3};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view_317);
        CustombaseAdapetr couCustombaseAdapetr = new CustombaseAdapetr(getApplicationContext(),FoodList,foodImages);
        listView.setAdapter(couCustombaseAdapetr);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(MainActivity.this , profile.class));
                }
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final  int which_item = i;

                new AlertDialog.Builder(MainActivity.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Bạn Muốn Xoá không ???")
                        .setMessage("Bạn muốn xoá chứ ??")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            couCustombaseAdapetr.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("no" , null)
                        .show();
                return true;
            }
        });
    }


}