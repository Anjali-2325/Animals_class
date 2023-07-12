class Animal{
    public void makesound(){
        System.out.println("The sound by animals");
    }
}
class Dog extends Animal{
public void makesound(){
        System.out.println("Dogs barking");
    }

}
class Cat extends Animal{
public void makesound(){
        System.out.println("cats Sound");
    }
}
class Cow extends Animal{
public void makesound(){
        System.out.println("Cow Sound");
    }
}

class AnimalInheritance{
    public static void main(String[] args) {
        Animal an=new Animal();
        an.makesound();
    }
}