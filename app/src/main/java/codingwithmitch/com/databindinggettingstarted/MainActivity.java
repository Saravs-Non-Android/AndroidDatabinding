package codingwithmitch.com.databindinggettingstarted;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import codingwithmitch.com.databindinggettingstarted.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //class autocreated when databinding enabled
    //name of the layout file with hyphens removed and characters autocapitalized
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        
    }
}
