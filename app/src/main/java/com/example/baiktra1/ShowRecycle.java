package com.example.baiktra1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ShowRecycle extends AppCompatActivity {

    private RecyclerView rcvComputer;
    private SignerAdapter computerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_recycle);

        rcvComputer = findViewById(R.id.rcv_user);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvComputer.setLayoutManager(linearLayoutManager);

        computerAdapter = new SignerAdapter(getListUser());
        rcvComputer.setAdapter(computerAdapter);
    }

    private List<Singer> getListUser() {
        List<Singer> list = new ArrayList<>();
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.singer1));
        list.add(new Singer("Trịnh Trần Phương Tuấn", "Jack", "Việt Nam", R.drawable.singer2));
        list.add(new Singer("Kwon Ji-yong", "G-Dragon", "Hàn Quốc", R.drawable.singer3));
        list.add(new Singer("Phạm Lưu Tuấn Tài", "Isaac", "Việt Nam", R.drawable.singer4));

        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.singer1));
        list.add(new Singer("Trịnh Trần Phương Tuấn", "Jack", "Việt Nam", R.drawable.singer2));
        list.add(new Singer("Kwon Ji-yong", "G-Dragon", "Hàn Quốc", R.drawable.singer3));
        list.add(new Singer("Phạm Lưu Tuấn Tài", "Isaac", "Việt Nam", R.drawable.singer4));

        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.singer1));
        list.add(new Singer("Trịnh Trần Phương Tuấn", "Jack", "Việt Nam", R.drawable.singer2));
        list.add(new Singer("Kwon Ji-yong", "G-Dragon", "Hàn Quốc", R.drawable.singer3));
        list.add(new Singer("Phạm Lưu Tuấn Tài", "Isaac", "Việt Nam", R.drawable.singer4));

        return list;
    }
}