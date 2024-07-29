//Lớp cat kế thừa lớp Animal
public class Cat extends  Animal{
//    ví dụ về override
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    //    ví dụ về overloading
    public void makeSound(String sound) {
        System.out.println("Cat makeSound " + sound);
    }

}
