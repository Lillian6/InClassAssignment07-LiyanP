package com.example.pengbuding.inclassassignment07_liyanp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addStudentButton;
    TextView studentTextView;
    String studentInformation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addStudentButton = (Button) findViewById(R.id.add_student_button);
        studentTextView = (TextView) findViewById(R.id.student_text_view);

        addStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InputActivity.class);
                startActivityForResult(intent, Keys.REQUEST_ADD_STUDENT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.REQUEST_ADD_STUDENT && resultCode == RESULT_OK){
            Student student = (Student) data.getSerializableExtra(Keys.STUDENT);
            studentInformation = studentInformation + student.toString();
            studentTextView.setText(studentInformation);
        }
    }
}