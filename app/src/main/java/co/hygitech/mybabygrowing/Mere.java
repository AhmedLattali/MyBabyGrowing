package co.hygitech.mybabygrowing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Mere extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mere);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mere, menu);
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
    public void guide(View v){
        Intent i = new Intent(Mere.this,Guide.class);
        startActivity(i);
    }

    public void onClickPasEncore(View v){
        startActivity(new Intent(Mere.this,PasEncore.class));
    }

    public void myAppointement(View v){
        Intent i = new Intent(Mere.this,appointements.class);
        startActivity(i);
    }

    public void toDo(View v){
        Intent i = new Intent(Mere.this,To_do.class);
        startActivity(i);
    }
}
