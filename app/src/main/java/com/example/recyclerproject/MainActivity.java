package com.example.recyclerproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
bookAdapter myAdapter;
List<book> booklist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.myrecycler);

        myAdapter=new bookAdapter(booklist);
        RecyclerView.LayoutManager mylayoutmanager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mylayoutmanager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);
        preparBooksData();
        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(
                getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                book book=booklist.get(position);
                Toast.makeText(getApplicationContext(),"selected item is "+book.getTitle(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }
        ));
    }

    void  preparBooksData(){
        book book=new book("first book","first auther","first year");
        booklist.add(book);
        book book2=new book("second book","second auther","second year");
        booklist.add(book2);
        book book3=new book("third book","third auther","third year");
        booklist.add(book3);
        book book4=new book("first book","first auther","first year");
        booklist.add(book4);
        book book5=new book("second book","second auther","second year");
        booklist.add(book5);
        book book6=new book("third book","third auther","third year");
        booklist.add(book6);
        book book9=new book("first book","first auther","first year");
        booklist.add(book9);
        book book7=new book("second book","second auther","second year");
        booklist.add(book7);
        book book8=new book("third book","third auther","third year");
        booklist.add(book8);
        myAdapter.notifyDataSetChanged();
    }



}
