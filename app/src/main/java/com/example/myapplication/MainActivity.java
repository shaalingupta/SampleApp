package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.time.LocalDateTime;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ClientCardClickListener {

    @BindView(R.id.user_image)
    ImageView userIcon;

    @BindView(R.id.client_list)
    RecyclerView recyclerView;

    GridLayoutManager gridLayoutManagerHorizontal;
    ClientsRecyclerAdapter adapter;

    ArrayList<Clients> clientsList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gridLayoutManagerHorizontal = new GridLayoutManager(this,1, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManagerHorizontal);
        recyclerView.setHasFixedSize(true);


        //Load Dummy Data
        clientsList = new ArrayList<>();
        clientsList.add(new Clients("1","MyClient1", 4000L, LocalDateTime.now(),R.mipmap.macd));
        clientsList.add(new Clients("2","MyClient2", 4000L, LocalDateTime.now(),R.mipmap.images));
        clientsList.add(new Clients("3","MyClient3", 4000L, LocalDateTime.now(),R.mipmap.macd));
        clientsList.add(new Clients("4","MyClient4", 4000L, LocalDateTime.now(),R.mipmap.images2));
        clientsList.add(new Clients("5","MyClient5", 4000L, LocalDateTime.now(),R.mipmap.macd));
        clientsList.add(new Clients("6","MyClient6", 4000L, LocalDateTime.now(),R.mipmap.images));

        adapter = new ClientsRecyclerAdapter(clientsList,MainActivity.this,MainActivity.this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void cardClicked(View view, int position, Clients client) {

    }
}
