package edu.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * 1:实力化出recyclerView组件
 * 2：配置recycerview
 *    >为recycler设置显示类型--如线性，九宫格 。。。
 * 3：为recyclerView设置适配器adapter，并为adapter设置显示数据源。
 * 4：为recyclerView绑定adapter  ---- > 达到数据显示
 */
public class MainActivity extends AppCompatActivity {

    private List<String> dataList =new ArrayList<>();
    private RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private GridLayoutManager gridLayoutManager;
    private RecyclerVierwAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        initView();
        configRecyclerView();

    }

    /**
     * find view
     */
    private void initView(){
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
    }

    /**
     * config recyclerView
     */
    private void configRecyclerView(){
        //mLayoutManager = new LinearLayoutManager(MainActivity.this);
        gridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new RecyclerVierwAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        for (int i=0;i<50;i++){
            dataList.add("第"+i+"项");
        }
    }
}
