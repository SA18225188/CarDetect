package com.example.a19938.cardetect;

import android.app.ListActivity;
import java.util.List;
import java.io.File;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.print.PrinterId;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ManageFileActivity extends ListActivity {

    private Button buttonY;
    private Button buttonN;
    private TextView dirtv;
    private List<String> items = null;
    private List<String> paths = null;
    private String rootPath = "/";
    private String curPath = "/";
    private final static String TAG = "";
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_manage_file);
        dirtv = (TextView)findViewById(R.id.dirtv);
        buttonY = (Button)findViewById(R.id.buttonY);
        buttonN = (Button)findViewById(R.id.buttonN);
        buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(ManageFileActivity.this,MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("file",curPath);
                data.putExtras(bundle);
                setResult(2,data);
                finish();
            }
        });
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
  //      getFilesDir(rootPath);
    }
/*
    private void getFilesDir(String filePath){
        dirtv.setText(filePath);
        items = new ArrayList<String>();
        paths = new ArrayList<String>();
        File f = new File(filePath);
        File [] files = new f.listFiles();
        if (!filePath.equals(rootPath)){
            items.add("b1");
            paths.add(rootPath);
            items.add("b2");
            paths.add(f.getParent());
        }
        for (int i =0;i<files.length;i++){
            File file = files[i];
            items.add(file.getName());
            paths.add(file.getPath());
        }
        setListAdapter(new MyAdapter(this,items,path));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        File file = new File(paths.get(position));
        if (file.isDirectory()){
            curPath = paths.get(position);
            getFilesDir(paths.get(position));
        }else{
            //可以打开文件
        }
    }
    */
}
