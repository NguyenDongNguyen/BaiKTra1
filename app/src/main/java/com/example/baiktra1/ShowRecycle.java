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
        setContentView(R.layout.activity_main);

        rcvComputer = findViewById(R.id.rcv_user);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvComputer.setLayoutManager(linearLayoutManager);

        computerAdapter = new SignerAdapter(getListUser());
        rcvComputer.setAdapter(computerAdapter);
    }

    private List<Singer> getListUser() {
        List<Singer> list = new ArrayList<>();
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));

        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));

        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));
        list.add(new Singer("Nguyễn Thanh Tùng", "Sơn Tùng MTP", "Việt Nam", R.drawable.macbook1));

        return list;
    }
}