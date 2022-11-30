public class Human {
    public String name;
    public String surname;
    public String gender;
    private double weight;
    private double height;

    public Human (String name, String surname, String gender, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void build() {
        double h = height / 100;
        double imt = weight / (h * h);
        System.out.format("ИМТ = " + "%.0f", imt);
        System.out.println("");
        if (gender == "мужчина") {
            if (imt > 29.5) {
                System.out.println("Ожирение");
            }
            else if (imt > 25.5) {
                System.out.println("Избыточный вес");
            }
            else if (imt > 18.5) {
                System.out.println("В хорошей форме");
            }
            else if (imt < 18.5) {
                System.out.println("Недостаточный вес");
            }
        }
        else if (gender == "женщина") {
            if (imt > 27.5) {
                System.out.println("Ожирение");
            }
            else if (imt > 23.5) {
                System.out.println("Избыточный вес");
            }
            else if (imt > 17.5) {
                System.out.println("В хорошей форме");
            }
            else if (imt < 17.5) {
                System.out.println("Недостаточный вес");
            }
        }
    }
}
