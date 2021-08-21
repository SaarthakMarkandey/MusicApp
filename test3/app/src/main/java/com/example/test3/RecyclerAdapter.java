package com.example.test3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.PersonViewHolder> {

    private List<Person> personList;
    private Context mContext;
    public RecyclerAdapter(Context mContext,List<Person> personList){
        this.personList=personList;
        this.mContext=mContext;

    }
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.custom_list_item,parent,false);

        return new PersonViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person=personList.get(position);
        try{
        holder.personName.setText(person.getPersonName());}catch (NullPointerException e){}
        holder.personImage.setImageResource(person.getPersonImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String position = person.getPersonName();
                Intent intent = new Intent(mContext, OnlinePlayer.class);
                intent.putExtra("pos", position);
                
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
    public class PersonViewHolder extends RecyclerView.ViewHolder  {
        public TextView personName;
        public ImageView personImage;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            personName=itemView.findViewWithTag(R.id.profile_name);
            personImage=itemView.findViewById(R.id.profile_image);

        }


    }

    }

