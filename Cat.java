package Animal;


    public class Cat extends Animal implements Edible {
        @Override
        public String makeSound() {
            return "Cat: meow meow!";
        }
        public String howToEat() {
            return "mouth";
        }
    }


