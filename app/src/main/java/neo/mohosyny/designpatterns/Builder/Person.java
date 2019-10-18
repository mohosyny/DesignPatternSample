package neo.mohosyny.designpatterns.Builder;

public class Person {

    private int id;
    private int age;
    private int wieght;
    private int height;
    private String firstName;
    private String lastName;


    public static class Builder {

        private int id;
        private int age;
        private int weight;
        private int height;
        private String firstName;
        private String lastName;


        public Builder(int id) {

            this.id = id;
        }


        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setWeight(int weight) {

            this.weight = weight;
            return this;
        }

        public Builder setHeight(int height) {

            this.height = height;
            return this;
        }

        public Builder setFirstName(String firstName) {

            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {

            this.lastName = lastName;
            return this;
        }


        public Person Build() {
            Person person = new Person();
            person.id = id;
            person.age = age;
            person.wieght = weight;
            person.height = height;
            person.firstName = firstName;
            person.lastName = lastName;
            return person;


        }

    }


}
