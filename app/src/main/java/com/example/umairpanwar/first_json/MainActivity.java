package com.example.umairpanwar.first_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.MalformedJsonException;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.AccessibleObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json= "" +
                "{\"name\":\"umair\",\"roll\":123," +
                "\"fname\":\"MAshiq\",\"age\":555," +
                "\"subjects\":[\"english\",\"math\",\"physics\"]," +
                "\"department\":{\"name\":\"CS\",\"block\":\"B-Block\",\"code\":5555}}";

        TextView textView = findViewById(R.id.mainTextview);
        TextView textView2 = findViewById(R.id.mainTextview2);


        try {
            JSONObject rootobject = new JSONObject(json);
            String name = rootobject.getString("name");
            String fname = rootobject.getString("fname");
            Integer rollno = rootobject.getInt("roll");
            Integer age = rootobject.getInt("age");
            JSONArray array = rootobject.getJSONArray("subjects");
            String[] subjects = new String[array.length()];
            for (int i = 0; i<array.length();i++){
                String subject = array.getString(i);
                subjects[i] = subject;
            }
            JSONObject jsonObject = rootobject.getJSONObject("department");
            String dptnmae = jsonObject.getString("name");
            String block = jsonObject.getString("block");
            Integer code = jsonObject.getInt("code");

            Department dpt = new Department(dptnmae,block,code);


            Student student = new Student(name,rollno,fname,age,subjects,dpt);
            textView.setText(String.valueOf(student.getName()+"   "+student.getRollno()+"   "+student.getFname()+"   "+student.getAge()));
            textView2.setText(String.valueOf(dpt.getBlocks() +"   "+ dpt.getName() +"   "+ dpt.getCode()));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
