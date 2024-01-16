public class Homework1 {

    public static void main(String[] args) {
        String tree = "Береза";
        String bigTree = "БЕРЕЗА";
        String wrongTree = "     Береза     ";
        String emptyVariable = "";
        Homework1 homework = new Homework1();
        homework.resultIsEmpty(tree)
                .resultIsEmpty(emptyVariable)
                .resultIsBlank(tree)
                .resultIsBlank(emptyVariable)
                .resultSubstring(tree, 3, 5)
                .resultIndexOf(tree, 'р')
                .resultLastIndexOf(tree, 'е')
                .resultToLowerCase(bigTree)
                .resultToUpperCase(tree)
                .resultReplace(tree,'е', 'у')
                .resultStartsWith(tree,"Бер")
                .resultStartsWith(tree,"БЕР")
                .resultEndsWith(tree,"еза")
                .resultEndsWith(tree,"езА")
                .resultRepeat(tree,3)
                .resultContains(tree,"ере")
                .resultContains(tree,"хах")
                .resultConcat(tree,bigTree)
                .resultTrim(wrongTree);
    }

    public Homework1 resultIsEmpty(String variable) {
        boolean result = variable.isEmpty(); // строка пустая или нет, различие isEmpty(" ") = false
        System.out.println(result);
        return this;
    }

    public Homework1 resultIsBlank(String variable) {
        boolean result = variable.isBlank(); // строка пустая или нет, различие isBlank(" ") = true
        System.out.println(result);
        return this;
    }

    public Homework1 resultSubstring(String variable, int variable_1, int variable_2) {
        String result = variable.substring(variable_1, variable_2); // обрезает строку
        System.out.println(result);
        return this;
    }

    public Homework1 resultIndexOf(String variable_1, char variable_2) {
        int result = variable_1.indexOf(variable_2); // поиск индекса последнего искомого элемента
        System.out.println(result);
        return this;
    }

    public Homework1 resultLastIndexOf(String variable_1, char variable_2) {
        int result = variable_1.lastIndexOf(variable_2); // поиск индекса первого искомого элемента
        System.out.println(result);
        return this;
    }

    public Homework1 resultToLowerCase(String variable) {
        String result = variable.toLowerCase(); // приводит к нижнему регистру
        System.out.println(result);
        return this;
    }

    public Homework1 resultToUpperCase(String variable) {
        String result = variable.toUpperCase(); // приводит к верхнему регистру
        System.out.println(result);
        return this;
    }

    public Homework1 resultReplace(String variable_1, char variable_2, char variable_3) {
        String result = variable_1.replace(variable_2, variable_3); // ищет элемент и заменяет его
        System.out.println(result);
        return this;
    }

    public Homework1 resultStartsWith(String variable_1, String variable_2) {
        boolean result = variable_1.startsWith(variable_2); // проверка, что variable_1 начинается с variable_2
        System.out.println(result);
        return this;
    }

    public Homework1 resultEndsWith(String variable_1, String variable_2) {
        boolean result = variable_1.endsWith(variable_2); //проверка, что variable_1 заканчивается на variable_2
        System.out.println(result);
        return this;
    }

    public Homework1 resultRepeat(String variable_1, int variable_2) {
        String result = variable_1.repeat(variable_2); //повторяет строку
        System.out.println(result);
        return this;
    }

    public Homework1 resultContains(String variable_1, String variable_2) {
        boolean result = variable_1.contains(variable_2); // ищет слово в строке
        System.out.println(result);
        return this;
    }

    public Homework1 resultConcat(String variable_1, String variable_2) {
        String result = variable_1.concat(variable_2); // добовляет слово к строке
        System.out.println(result);
        return this;
    }

    public Homework1 resultTrim(String variable) {
        String result = variable.trim(); // убираем пробелы
        System.out.println(result);
        return this;
    }


}
