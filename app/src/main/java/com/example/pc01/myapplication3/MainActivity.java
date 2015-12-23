package com.example.pc01.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements OnClickListener{

//    private List<Person> persons;
//
//    class Person {
//        String name;
//        String age;
//        int photoId;
//
//        public Person(String name, String age, int photoId) {
//            this.name = name;
//            this.age = age;
//            this.photoId = photoId;
//        }
//    }
//
//    private void initializeData(){
//        persons = new ArrayList<>();
//        persons.add(new Person("Teguh Arifianto", "26 Tahun", R.mipmap.ic_launcher));
//        persons.add(new Person("Anita Sari", "26 Tahun", R.mipmap.ic_launcher));
//        persons.add(new Person("Ihsan Faeyza Mufid", "4 Bulan", R.mipmap.ic_launcher));
//        persons.add(new Person("Budi", "26 Tahun", R.mipmap.ic_launcher));
//        persons.add(new Person("Toni", "26 Tahun", R.mipmap.ic_launcher));
//        persons.add(new Person("Ridwan", "26 Bulan", R.mipmap.ic_launcher));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initializeData();

//        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
//
//        rv.setHasFixedSize(true);
//
//        LinearLayoutManager llm = new LinearLayoutManager(this);
//        rv.setLayoutManager(llm);
//
//        RVAdapter adapter = new RVAdapter(persons);
//        rv.setAdapter(adapter);

        Button btn = (Button) findViewById(R.id.btnpage1);
        btn.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.btnpage2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.btnpage3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.btnTab);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.btnSpin);
        btn5.setOnClickListener(this);

//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Main2Activity.class));
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View v)
    {
        int imagePath = 0;
        // TODO Auto-generated method stub
        switch (v.getId())
        {
            case R.id.btnpage1:
               startActivity(new Intent(MainActivity.this, Page1Activity.class));
                break;
            case R.id.btnpage2:
                startActivity(new Intent(MainActivity.this, Page2Activity.class));
                break;
            case R.id.btnpage3:
                startActivity(new Intent(MainActivity.this, Page3Activity.class));
                break;
            case R.id.btnTab:
                startActivity(new Intent(MainActivity.this, Main22Activity.class));
                break;
            case R.id.btnSpin:
                startActivity(new Intent(MainActivity.this, Main23Activity.class));
                break;
        }


    }

}

