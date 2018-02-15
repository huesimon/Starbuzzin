package dk.hammernemt.simon.starbuzzin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];
        Log.d("Extra id is", "onCreate: "+ EXTRA_DRINKID);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());


        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());


    }
}
