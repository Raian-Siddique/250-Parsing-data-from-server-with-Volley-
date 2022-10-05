package com.example.class250parsingdatafromserverwithvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        progressBar= findViewById(R.id.progressBar);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://testbdraian.000webhostapp.com/apps/hello.php";

// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        textView.setText(response);
                        progressBar.setVisibility(View.GONE);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("That didn't work!");
                progressBar.setVisibility(View.GONE);
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);


//        String url ="http://tprobd.42web.io/apps/apps.php";
//        String url ="http://jubyerbd.000webhostapp.com/apps/hello.php";

        //================= Request a string response from the provided URL================
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, "http://jubyerbd.000webhostapp.com/apps/hello.php" ,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        textView.setText(response);
//                        progressBar.setVisibility(View.GONE);
//                    }
//
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                textView.setText("That did not work ");
//                progressBar.setVisibility(View.GONE);
//            }
//
//        });
//        //============== Add the request to the RequestQueue.================
//        // ====================Instantiate the RequestQueue.===============
//    RequestQueue requestQueue =Volley.newRequestQueue(MainActivity.this);
//    requestQueue.add(stringRequest);
//




    }
}