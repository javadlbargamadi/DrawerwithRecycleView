
package com.sematecjavaproject.drawerwithrecycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerAdapterViewHolder> {

    Context context;
    List<Contact> contacts;

    //نام ایتم های شما اینجا گرفته میشود
    private int item_name[] = {
            R.string.Task1,
            R.string.Task2,
            R.string.Task3
    };

    public RecyclerAdapter() {
        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public RecyclerAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclerview_item,parent,false);
        RecyclerAdapterViewHolder viewHolder = new RecyclerAdapterViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterViewHolder holder, final int position) {

        Contact contact = contacts.get(position);
        holder.btnChoice.setText(item_name[position]);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( item_name[position] == R.string.Task1 ) {
                    Intent intent = new Intent(context, Task1.class);
                    context.startActivity(intent);
                }
//
//                }else if( item_name[position] == R.string.Task2 ){
//                    Intent intent2 = new Intent(context, Task2.class);
//                    context.startActivity(intent2);
//
//                }else if( item_name[position] == R.string.Task3 ){
//                    Intent intent3 = new Intent(context, Task3.class);
//                    context.startActivity(intent3);
//
//                }else ;

            }
        });


    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class RecyclerAdapterViewHolder extends RecyclerView.ViewHolder {


        Button btnChoice;

        private final Context context;

        public RecyclerAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();

            btnChoice = itemView.findViewById(R.id.btnChoice);
        }
    }
}



//package com.sematecjavaproject.drawerwithrecycleview;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//
//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerAdapterViewHolder> {
//
//    Context context;
//    List<Contact> contacts;
//
//    public RecyclerAdapter() {
//        this.context = context;
//        this.contacts = contacts;
//    }
//
//    @NonNull
//    @Override
//    public RecyclerAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclerview_item,parent,false);
//        RecyclerAdapterViewHolder viewHolder = new RecyclerAdapterViewHolder(v);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerAdapterViewHolder holder, final int position) {
//
//
//
//        switch (position){
//            case 0:
//                holder.btnChoice.setText("Task 1");
//                break;
//            case 1:
//                holder.btnChoice.setText("Task 2-1");
//                break;
//            case 2:
//                holder.btnChoice.setText("Task 2-2");
//                break;
//        }
//
//
//
//
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                switch (position){
//                    case 1:
//                        Intent intent = new Intent(context, Task1.class);
//                        context.startActivity(intent);
//                        break;
//                }
//            }
//        });
//
//
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 3;
//    }
//
//    class RecyclerAdapterViewHolder extends RecyclerView.ViewHolder {
//
//
//        Button btnChoice;
//
//        private final Context context;
//
//        public RecyclerAdapterViewHolder(@NonNull View itemView) {
//            super(itemView);
//            context = itemView.getContext();
//
//            btnChoice = itemView.findViewById(R.id.btnChoice);
//        }
//    }
//}
