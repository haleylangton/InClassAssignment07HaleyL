package com.example.android.inclassassignment07_haleyl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText name;
    public EditText birthday;
    public CheckBox member;
    public EditText milePace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);

        birthday = findViewById(R.id.bday);

        milePace = findViewById(R.id.pace);

        member = findViewById(R.id.club_member_check);

    }

    public void launchActivity(View view) {

        String userName = name.getText().toString();
        String userBirthday = birthday.getText().toString();
        boolean isMember = member.isChecked();
        String pace = milePace.getText().toString();

        UserSelectedClass a = new UserSelectedClass(userName, userBirthday, isMember, pace);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.USER, a);

        startActivity(intent);

    }
}
