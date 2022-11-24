package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class Main extends AppCompatActivity {
    private WebView miVisorWeb;
    private SwipeRefreshLayout swipeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipeLayout=(SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);


        WebView mycontext = (WebView) findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);
        //La vista dentro es un webview con permiso para zoom
        miVisorWeb = (WebView) findViewById(R.id.vistaweb);
        miVisorWeb.getSettings().setJavaScriptEnabled(true);
        miVisorWeb.getSettings().setBuiltInZoomControls(true);
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com");
    }



    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
//                Toast toast = Toast.makeText(this, "Item copied", Toast.LENGTH_LONG);
//                toast.show();
                final ConstraintLayout mLayout = findViewById(R.id.myMainConstraint);

                Snackbar snackbar = Snackbar
                        .make(mLayout, "fancy a Snack while you refresh?", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(mLayout, "Action is restored!", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();
                return true;
            case R.id.item2:
                Toast toast2 = Toast.makeText(this, "Item downloaded", Toast.LENGTH_LONG);
                toast2.show();
                return true;
            default:
                return  false;
        }
    }
    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {


            Toast toast0 = Toast.makeText(Main.this, "Hi there! I don't exist :)", Toast.LENGTH_LONG);
            toast0.show();
            miVisorWeb.reload();
            swipeLayout.setRefreshing(false);
        }
    };

}