package com.silicon.provider.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.silicon.provider.Adapter.FacultiesAdapter;
import com.silicon.provider.R;

import java.util.ArrayList;
import java.util.List;

public class ShowFaculities extends AppCompatActivity {

    public RecyclerView recyclerView;
    FacultiesAdapter facultiesAdapter;
    private List<String> DatumList;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_faculities);
        DatumList = new ArrayList<>();
        DatumList.add("Faculty 1");
        DatumList.add("Faculty 2");
        DatumList.add("Faculty 3");
        DatumList.add("Faculty 4");
        DatumList.add("Faculty 5");
        DatumList.add("Faculty 6");
        DatumList.add("Faculty 7");


        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(ShowFaculities.this, LinearLayoutManager.VERTICAL, false));
        facultiesAdapter = new FacultiesAdapter(ShowFaculities.this, DatumList);
        recyclerView.setAdapter(facultiesAdapter);
        imageView =findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
