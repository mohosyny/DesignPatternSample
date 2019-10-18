package neo.mohosyny.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import neo.mohosyny.designpatterns.Builder.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //‌Builder pattern usage
        Person person = new Person.Builder(1)
                .setAge(26)
                .setWeight(80)
                .setHeight(175)
                .setFirstName("moho")
                .setLastName("hsyny")
                .Build();

    }
}
