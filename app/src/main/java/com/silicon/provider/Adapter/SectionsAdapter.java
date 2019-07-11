package com.silicon.provider.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.silicon.provider.Activities.SectionServices;
import com.silicon.provider.R;

import java.util.List;


public class SectionsAdapter extends RecyclerView.Adapter<SectionsAdapter.MessagesViewHolder> {

    private Context mCtx;
    private List<String> DatumList;

    public SectionsAdapter(Context mCtx, List<String> DatumList) {
        this.mCtx = mCtx;
        this.DatumList = DatumList;
    }

    @NonNull
    @Override
    public SectionsAdapter.MessagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sections_row, parent, false);
    /*    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (parent.getWidth() * 0.35);
        layoutParams.height = (int) (parent.getWidth() * 0.40);*/
        return new SectionsAdapter.MessagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionsAdapter.MessagesViewHolder holder, final int position) {
        final String MessageTitle = DatumList.get(position);
        holder.name.setText(MessageTitle);
        holder.frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, SectionServices.class);
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return DatumList.size();
    }

    public class MessagesViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        FrameLayout frameLayout;

        public MessagesViewHolder(View itemview) {
            super(itemview);
            name = itemView.findViewById(R.id.name);
            frameLayout = itemView.findViewById(R.id.framesection);
        }
    }
}
