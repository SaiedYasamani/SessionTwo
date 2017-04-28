package sematecandroidfridays.sessiontwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define views objects & binding with views
        Button relativeLayoutButton = (Button) findViewById(R.id.ralativeLayoutButton);
        Button scrollingbutton = (Button) findViewById(R.id.scrollButton);
        Button formButton  = (Button) findViewById(R.id.formButton);

        //define intents:
        final Intent relativeLayoutIntent = new Intent(this, RelativeLayoutActivity.class);
        final Intent scrollingIntent = new Intent(this, scrollingActicity.class);
        final Intent formIntent = new Intent(this,FormActivity.class);

        //define buttons click handlers
        relativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(relativeLayoutIntent);
            }
        });

        scrollingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(scrollingIntent);
            }
        });

        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(formIntent);
            }
        });


    }
}
