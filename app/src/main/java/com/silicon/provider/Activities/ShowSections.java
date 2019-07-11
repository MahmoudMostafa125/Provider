package com.silicon.provider.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.silicon.provider.Adapter.FacultiesAdapter;
import com.silicon.provider.Adapter.SectionsAdapter;
import com.silicon.provider.R;

import java.util.ArrayList;
import java.util.List;

public class ShowSections extends AppCompatActivity {


    public RecyclerView recyclerView;
    SectionsAdapter sectionsAdapter;
    private List<String> DatumList;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sections);

        DatumList = new ArrayList<>();
        DatumList.add("Section 1");
        DatumList.add("Section 2");
        DatumList.add("Section 3");
        DatumList.add("Section 4");
        DatumList.add("Section 5");
        DatumList.add("Section 6");
        DatumList.add("Section 7");


        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(ShowSections.this, LinearLayoutManager.VERTICAL, false));
        sectionsAdapter = new SectionsAdapter(ShowSections.this, DatumList);
        recyclerView.setAdapter(sectionsAdapter);

        imageView =findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
