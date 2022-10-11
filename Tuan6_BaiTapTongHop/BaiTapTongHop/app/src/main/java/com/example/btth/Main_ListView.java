package com.example.btth;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Main_ListView extends AppCompatActivity {

    ListView listView;
    ArrayList<Phim> arrayList;
    PhimAdapetr phimAdapetr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);
        anhXa();
        phimAdapetr  = new PhimAdapetr(this , arrayList, R.layout.listview_phim);
        listView.setAdapter(phimAdapetr);
        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final  int which_item = i;
                new AlertDialog.Builder(Main_ListView.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Bạn Muốn Xoá không ???")
                        .setMessage("Bạn muốn xoá chứ ??")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                arrayList.remove(which_item);
                                phimAdapetr.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("no" , null)
                        .show();
                return true;
            }
        });
    }

    private void anhXa(){
        listView = (ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        arrayList.add(new Phim("AVARTAR 2","Phim AVATAR  DÒNG\n CHẢY...Xem chi tiết",R.drawable.avatar2));
        arrayList.add(new Phim("NDTGDYA","Bhop – một kỹ sư \ntài...Xem chi tiết",R.drawable.ngtgdya));
        arrayList.add(new Phim("MINIONS","Mùa hè này,\ntừ cách...Xem chi tiết",R.drawable.minion));
        arrayList.add(new Phim("7 Thi Thể "," Chuyện phim được làm\ndựa trên một vụ án có\nthật...Xem chi tiết",R.drawable.baythithe));
        arrayList.add(new Phim("Chuyện Ma\nGần Nhà"," Tác phẩm đầu\ntiên...Xem chi tiết",R.drawable.cmgn));
        arrayList.add(new Phim("Em và Trịnh","hời niên thiếu của\nngười...Xem chi tiết",R.drawable.emvatrinh));
        arrayList.add(new Phim("Tình Người\nDuyên Ma","Tiếp nối \nhội bạn...Xem chi tiết",R.drawable.tndm));
    }
}