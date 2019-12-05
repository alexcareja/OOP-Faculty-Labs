import java.util.Objects;

public class Dog {
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        int sum = 0;
        for (char a : this.breed.toCharArray()) {
            sum += a;
        }
        return sum * age * 29 / 5;
    }
}
