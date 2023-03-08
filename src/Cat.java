import java.util.ArrayList;

public class Cat {
    RandomHelper randomHelper = new RandomHelper();

    String catName;
    int catAge;
    String catSex;
    boolean isVaccinated;
    String ownerName;

    int randomCatName = randomHelper.getRandomInt();
    int randomCatAge = randomHelper.getRandomInt();
    int randomCatSex = randomHelper.getRandomInt();
    boolean randomVaccinated = randomHelper.getRandomBoolean();
    int randomOwnerName = randomHelper.getRandomInt();

    public Cat() {
        getRandomCat();
    }

    public Cat(String catName, int catAge, String catSex,
               boolean isVaccinated, String ownerName) {
        validCatsName(catName);
        validCatsAge(catAge);
        this.catSex = catSex;
        this.isVaccinated = isVaccinated;
        validateOwnerName(ownerName);
    }

    public Cat(String catName, int catAge, String catSex,
               boolean isVaccinated) {
        validCatsName(catName);
        validCatsAge(catAge);
        this.catSex = catSex;
        this.isVaccinated = isVaccinated;
    }

    public Cat(String catName, int catAge, String catSex, String ownerName) {
        validCatsName(catName);
        validCatsAge(catAge);
        this.catSex = catSex;
        validateOwnerName(ownerName);
    }

    public Cat(String catName, int catAge, String catSex) {
        validCatsName(catName);
        validCatsAge(catAge);
        this.catSex = catSex;
    }

    public void validCatsName(String catName) {
        if (catName.length() >= 3) {
            this.catName = catName;
        } else {
            System.out.println("Имя кота слишком короткое");
        }
    }

    public void validCatsAge(int catAge) {
        if (catAge < 20 && catAge > 0) {
            this.catAge = catAge;
        } else {
            System.out.println("Неправильный возраст кота");
        }
    }

    public void validateOwnerName(String ownerName) {
        if (ownerName.length() >= 5) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Имя хозяина слишком короткое");
        }
    }

    public void printFullCat() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println("Привит: " + isVaccinated);
        System.out.println("Имя хозяина: " + ownerName);
        System.out.println();
    }

    public void printCatOnly() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println();
    }

    public void printCatWithVaccines() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println("Привит: " + isVaccinated);
        System.out.println();
    }

    public void printCatOwner() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println("Имя хозяина: " + ownerName);
        System.out.println();
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        validCatsName(catName);
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        validCatsAge(catAge);
    }

    public String getCatSex() {
        return catSex;
    }

    public void setCatSex(String catSex) {
        this.catSex = catSex;
    }

    public boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        validateOwnerName(ownerName);
    }

    public void getRandomCat() {
        switch (randomCatSex) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                /* falls through */
                catSex = "Мальчик";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                /* falls through */
                catSex = "Девочка";
                break;
            default:
                catSex = "Пол не указан";
                break;
        }

        switch (randomCatName) {
            case 1:
                catNameRandomizer("Мурзик", "Соня");
                break;
            case 2:
                catNameRandomizer("Гарфилд", "Клеопатра");
                break;
            case 3:
                catNameRandomizer("Том", "Цунами");
                break;
            case 4:
                catNameRandomizer("Гудвин", "Матильда");
                break;
            case 5:
                catNameRandomizer("Пушок", "Масяня");
                break;
            case 6:
                catNameRandomizer("Зорро", "Царапка");
                break;
            case 7:
                catNameRandomizer("Саймон", "Серсея");
                break;
            case 8:
                catNameRandomizer("Альбус", "Амели");
                break;
            case 9:
                catNameRandomizer("Базилио", "Наоми");
                break;
            case 10:
                catNameRandomizer("Леопольд", "Маркиза");
                break;
            default:
                catName = "Котик без имени :(";
        }

        catAge = randomCatAge;
        isVaccinated = randomVaccinated;

        switch (randomOwnerName) {
            case 1:
                ownerName = ("Григорий");
                break;
            case 2:
                ownerName = ("Андрей");
                break;
            case 3:
                ownerName = ("Владислав");
                break;
            case 4:
                ownerName = ("Никита");
                break;
            case 5:
                ownerName = ("Ярослав");
                break;
            case 6:
                ownerName = ("Евгений");
                break;
            case 7:
                ownerName = ("Михаил");
                break;
            case 8:
                ownerName = ("Игорь");
                break;
            case 9:
                ownerName = ("Тимофей");
                break;
            case 10:
                ownerName = ("Сергей");
                break;
            default:
                ownerName = ("Имя хозяина неизвестно");
                break;
        }
    }

    public void catNameRandomizer(String catBoyName, String catGirlName) {
        if (randomCatName != 0 && catSex.equals("Мальчик")) {
            catName = catBoyName;
        }
        if (randomCatName != 0 && catSex.equals("Девочка")) {
            catName = catGirlName;
        }
        if (randomCatName == 0 || catSex.equals("Пол не указан")) {
            catName = "Котик без имени :(";
        }
    }

    public static void randomCatBuilder() {
        ArrayList<Cat> randomCats = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            Cat cat = new Cat();
            randomCats.add(cat);

            for (int j = i; j < randomCats.size(); j++) {
                System.out.print("Имя " + i + " кота: " + randomCats.get(j).catName + " | ");
                System.out.print("Возраст: " + randomCats.get(j).catAge + " | ");
                System.out.print("Пол: " + randomCats.get(j).catSex + " | ");
                System.out.print("Наличие прививок: " + randomCats.get(j).isVaccinated + " | ");
                System.out.print("Имя хозяина: " + randomCats.get(j).ownerName);
            }

            System.out.println();
        }
    }

}
