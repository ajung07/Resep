package com.example.key.ResepMakananKu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //DATA SOURCE
    String[] names={"Nasi Goreng","Mie Goreng","Pecel","Nasi Uduk","Nasi Rames","Sate Ayam"};
    String[] positions={"Nasi goreng adalah sebuah hidangan nasi yang telah digoreng dalam sebuah wajan."
            ,"Mi goreng berarti mi yang digoreng Mi goreng terbuat dari mi kuning yang digoreng"
            ,"Pecel adalah makanan yang menggunakan bumbu sambal kacang yang dicampur dengan sayuran."
            ,"Nasi uduk terbuat dari nasi yang diaron dan dikukus dengan santan dari kelapa yang di parut,"
            ,"Rames adalah Makanan yang terdiri dari nasi putih yang dihidangkan dengan bermacam-macam lauk-pauk."
            ,"Sate ayam dimasak dengan cara dipanggang menggunakan arang dan disajikan dengan bumbu kacang atau kecap."};
    int[] images={R.drawable.nasgor,R.drawable.miegor,R.drawable.nasipecel,R.drawable.uduk,R.drawable.rames,R.drawable.sate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //REFERENCE RECYCLER
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        //SET PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        MyAdapter adapter=new MyAdapter(this,names,positions,images);
        rv.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
