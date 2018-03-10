package com.example.android.inclassassignment07_haleyl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        display = findViewById(R.id.display_text);

        Intent intent = getIntent();
        UserSelectedClass b = (UserSelectedClass) intent.getSerializableExtra(Keys.USER);

        display.setText(b.toString());

    }

    public void addRunner(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCode.ADD_RUNNER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == RequestCode.ADD_RUNNER && resultCode == RESULT_OK) {

            UserSelectedClass user = (UserSelectedClass) data.getSerializableExtra(Keys.USER);
            display.setText(user.toString());
        }
    }
}
