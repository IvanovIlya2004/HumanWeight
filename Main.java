public class Main {
    public static void main(String[] args) {
        // В поле gender работают = "мужчина", "женщина"
        Human human = new Human("Ilya", "Ivanov", "мужчина",88, 188);
        double weight = human.getWeight();
        double height = human.getHeight();

        System.out.println("Имя: " + human.name + "; Фамилия: " + human.surname);
        System.out.println("Вес: " + weight + "; Рост: " + height);
        human.build();

    }
}