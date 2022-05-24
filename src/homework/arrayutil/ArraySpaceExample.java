package homework.arrayutil;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        char c = ' ';
        int startIndex = 0;
        int lastIndex = spaceArray.length - 1;

        while (startIndex < lastIndex && spaceArray[startIndex] == c) {
            startIndex++;
        }
        while (startIndex < lastIndex && spaceArray[lastIndex] == c) {
            lastIndex--;
        }

        char[] result = new char[(lastIndex - startIndex) + 1];

        int index = 0;
        for (int i = startIndex; i <= lastIndex; i++) {

            result[index++] = spaceArray[i];
        }
        System.out.println("Տնային չէր, սթրես էր:");
        System.out.print(result);

    }
}


