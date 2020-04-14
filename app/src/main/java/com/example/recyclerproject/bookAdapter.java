package com.example.recyclerproject;//classe 3

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class bookAdapter extends RecyclerView.Adapter<bookAdapter.myViewHolder> {
    public List<book> bookList;
    public bookAdapter(List<book> bookList){
        this.bookList=bookList;

    }//end constractor
    @Override
    public myViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.book_list_row,parent,false);


        return new myViewHolder(itemView);//pour conaitre qui le design responsable ctt
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        book book_smal=bookList.get(position);

        holder.title.setText(book_smal.getTitle());
       holder.auther.setText(book_smal.getAuther());
       holder.year.setText(book_smal.getYear());



    }

    @Override
    public int getItemCount() {//returne a moi le nmbre des livres qui jai
        return bookList.size();
    }//<>object mo3ayen et adapter yan9ol data au design

    public class myViewHolder extends RecyclerView.ViewHolder{
        public TextView title,auther,year;
        public myViewHolder( View itemView) {
            super(itemView);
            title=  itemView.findViewById(R.id.titleText);
            auther=  itemView.findViewById(R.id.autherText);
            year=  itemView.findViewById(R.id.yearText);

        }//endconstractor
    }//end classe view holder
}//end clase book adapter
