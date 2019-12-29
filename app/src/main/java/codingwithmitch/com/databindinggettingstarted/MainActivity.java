package codingwithmitch.com.databindinggettingstarted;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import codingwithmitch.com.databindinggettingstarted.databinding.ActivityMainBinding;
import codingwithmitch.com.databindinggettingstarted.models.Product;
import codingwithmitch.com.databindinggettingstarted.util.Products;

public class MainActivity extends AppCompatActivity implements IMainActivity {
    //class autocreated when databinding enabled
    //name of the layout file with hyphens removed and characters autocapitalized
    ActivityMainBinding activityMainBinding;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Products productList = new Products();
        product = productList.PRODUCTS[0];

        //This setter method is the autocreated method for the variable name
        //created in layout file
        activityMainBinding.setProduct(product);
        activityMainBinding.setQuantity(1);
        activityMainBinding.setIMainActivity(this);
    }

    @Override
    public void inflateQuantityDialog() {
        ChooseQuantityDialog dialog = new ChooseQuantityDialog();
        dialog.show(getSupportFragmentManager(), getString(R.string.dialog_choose_quantity));
    }
}
