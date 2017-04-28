package sematecandroidfridays.sessiontwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class FormActivity extends AppCompatActivity {

    String PassedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //define views objects & binding with views
        final EditText nameTextBox = (EditText) findViewById(R.id.Name);
        final Button submittingButtonObject = (Button) findViewById(R.id.submitButton);
        final ImageView imageViewer = (ImageView) findViewById(R.id.imageViewer);
        final Button saveButton = (Button) findViewById(R.id.saveButton);

        //define Intents
        final Intent saveIntent = new Intent(FormActivity.this, SaveActivity.class);


        //define event handlers
        submittingButtonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.with(FormActivity.this).load("http://square.github.io/picasso/static/sample.png").into(imageViewer);
                Toast.makeText(FormActivity.this, nameTextBox.getText() + " An Image Loaded Or Is Loading By Picasso", Toast.LENGTH_LONG).show();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PassedText = nameTextBox.getText().toString();
                saveIntent.putExtra("Name_Text","Mr. " + PassedText);
                startActivity(saveIntent);
            }
        });
    }



    }
