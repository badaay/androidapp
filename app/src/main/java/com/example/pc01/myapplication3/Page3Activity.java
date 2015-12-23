package com.example.pc01.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

public class Page3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);



        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        rv.setHasFixedSize(true);


        //GridAutofitLayoutManager llm = new GridAutofitLayoutManager();
//        llm.getSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//           public int getSpanSize(int i){
//               return SPAN_COUNT / (int) (rv.getMeasuredWidth()/CELL_SIZE_IN_PX);
//           }
//        });
        GridLayoutManager llm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter();
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pull, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
