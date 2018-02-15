package dk.hammernemt.simon.starbuzzin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrinkActivity extends AppCompatActivity {
public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}
