package com.example.androidadvancetest;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityJava extends AppCompatActivity implements ClickItem{
    RecyclerView recyclerView;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        ArrayList<NameModel> list = new ArrayList<>();
        list.add(new NameModel("Asghar" , "Farhadi"));
        list.add(new NameModel("Hedieh" , "Tehrani"));
        list.add(new NameModel("Shahab" , "Hosseini"));

        RecyclerAdapterJava adapterJava = new RecyclerAdapterJava(list , this);
        recyclerView.setAdapter(adapterJava);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.VERTICAL ,
                 false
                ));



    }
    public void findViews(){
        recyclerView = findViewById(R.id.recycler);
    }

    @Override
    public void onItemClicked(String family) {
        Toast.makeText(this, family , Toast.LENGTH_SHORT).show();

    }
}
