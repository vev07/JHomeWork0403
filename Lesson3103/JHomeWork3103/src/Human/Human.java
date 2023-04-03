package Human;


public class Human {

    private String name;
    private int age;
    private double width;


    public static void main(String[] args) {
        String[] name = {"Yevhen", "Irina", "Karyna", "Zlata"};
        int[] age = {39, 42, 12, 9};
        double[] width = {98.9, 51.3, 36.9, 29.7};

        Human human = new Human();
        human.HumanSortAgeLower25AndWidthMore60(name,age,width);
        human.HumanSortWidthMore70AndNameLengthMore5Char(name,age,width);
        human.HumanSortNameStartVowelAndAgeLower18AndWidthMore70(name,age,width);

    }
    public void HumanSortAgeLower25AndWidthMore60(String[] name, int[] age, double[] width){
            for (int i = 0; i < name.length; i++) {
                if (age[i] > 25 && width[i] < 60) {
                    System.out.println(name[i] + " " + age[i] + " " + width[i]);
                }
            }

    }
    public void HumanSortWidthMore70AndNameLengthMore5Char(String[] name, int[] age, double[] width){
        for (int i = 0; i < name.length; i++) {
            if (width[i] > 70 && name[i].length() > 5) {
                System.out.println(name[i] + " " + age[i] + " " + width[i]);
            }
        }

    }
    public void HumanSortNameStartVowelAndAgeLower18AndWidthMore70(String[] name, int[] age, double[] width){
        char[] vowels = {'A','E','I','O','U','Y'};
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (name[i].charAt(0) == vowels[j]) {
                    if (age[i] < 18 && width[i] > 70) {
                        System.out.println(name[i] + " " + age[i] + " " + width[i]);
                    }
                }
            }

        }

    }

}
