package datnguyen.ute.oldmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class SubjectListActivity extends AppCompatActivity {
    ListView lstSubject;
    ArrayList<Subject> arraySubject;
    SubjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);
        AnhXa();
        adapter = new SubjectAdapter(this, R.layout.activity_subject_list, arraySubject);
        lstSubject.setAdapter(adapter);

    }

    private void AnhXa() {

        lstSubject = (ListView) findViewById(R.id.lstSubject);
        arraySubject = new ArrayList<>();
        arraySubject.add(new Subject("Java","8.8",R.drawable.java));
        arraySubject.add(new Subject("Flutter","7.0",R.drawable.flutter));
        arraySubject.add(new Subject("PHP","6.0",R.drawable.php));
        arraySubject.add(new Subject("MS SQL Server","5.8",R.drawable.sql));
        arraySubject.add(new Subject("JavaScript","9.8",R.drawable.js));
        arraySubject.add(new Subject("C#","5.8",R.drawable.csharp));
    }
}