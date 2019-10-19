package neo.mohosyny.designpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import neo.mohosyny.designpatterns.Builder.Person;
import neo.mohosyny.designpatterns.Factory.Shape;
import neo.mohosyny.designpatterns.Factory.ShapeFactory;
import neo.mohosyny.designpatterns.Factory.Square;

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
                .setFirstName("mo")
                .setLastName("hsyny")
                .Build();



        //Factory pattern usage
        Shape circle = ShapeFactory.getShape("Square");


    }
}
