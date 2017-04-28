package sematecandroidfridays.sessiontwo;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SaveActivity extends AppCompatActivity {

    private String NameText;
    private void setData(String key, String value)
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putString(key,value).commit();
    }
    private String getData(String key, String Default)
    {
        return PreferenceManager.getDefaultSharedPreferences(this).getString(key,Default);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        //get passed variable from origin activity
        Intent nameIntent = getIntent();
        NameText = nameIntent.getStringExtra("Name_Text");

        //show passed vatiable
        Toast.makeText(SaveActivity.this,NameText,Toast.LENGTH_LONG).show();

        Button saveButton = (Button) findViewById(R.id.savingButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //save passed data to local storage and show committed data
                setData("Name_Text",NameText);
                Toast.makeText(SaveActivity.this,"You Saved: " + getData("Name_Text",""),Toast.LENGTH_LONG).show();
            }
        });
    }
}
