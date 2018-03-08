package com.example.pengbuding.inclassassignment07_liyanp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText ageEditText;
    CheckBox passCheckBox;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nameEditText = (EditText) findViewById(R.id.name_edit_text);
        ageEditText = (EditText) findViewById(R.id.age_edit_text);
        passCheckBox = (CheckBox) findViewById(R.id.pass_check_box);
        submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                int age = Integer.parseInt(ageEditText.getText().toString());
                boolean pass = passCheckBox.isChecked();

                Student student = new Student(name, age, pass);

                Intent data = new Intent();
                data.putExtra(Keys.STUDENT, student);
                setResult(RESULT_OK, data);
                finish();
            }
        });

    }

}

