public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String yasesit_mi(Person A,Person B) {

        if (A.getAge()== B.getAge()) {

            return "ESIT";
        } else {

            return "ESIT DEGIL";

        }



    }}
