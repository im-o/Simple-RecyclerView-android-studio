package com.example.user.tes061212;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.button.MaterialButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcView;
    private ArrayList<Flowers> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rcView = (RecyclerView) findViewById(R.id.rc_view);
        rcView.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(FlowersData.getListData());

        //method or fungtion
        showRecyclerList();
        showFloating();
        moveActivity();
    }
    private void setActionBarTitle(){

    }

    private void showRecyclerList() {
        rcView.setLayoutManager(new LinearLayoutManager(this));
        ListFlowersAdapter listFlowersAdapter = new ListFlowersAdapter(this);
        listFlowersAdapter.setListFlowers(list);
        rcView.setAdapter(listFlowersAdapter);

        ItemClickSupport.addTo(rcView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedFlowers(list.get(position));
            }
        });

    }

    //this method for moveAcivity/showMessage
    private void showSelectedFlowers(Flowers flowers) {
        Toast.makeText(this, "Kamu memilih " + flowers.getName(), Toast.LENGTH_SHORT).show();
    }

    //i make it all in method to make it look neat
    private void showFloating() {
        FloatingActionButton floatingActionButton = findViewById(R.id.floating_btn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Test me", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null)
                        .show();
            }
        });
    }

    private void moveActivity() {
        FloatingActionButton btnMoveActivity = findViewById(R.id.btntest);
        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btntest:
                        Intent moveIntent = new Intent(MainActivity.this, ActivityLearnMore.class);
                        startActivity(moveIntent);
                        break;
                }
            }
        });
    }
}
