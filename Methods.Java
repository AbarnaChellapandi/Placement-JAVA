1. length()

public class LengthExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Length: " + str.length());
    }
}
OUTPUT:
Length: 10


2. isEmpty()

public class IsEmptyExample {
    public static void main(String[] args) {
        String str = "";
        System.out.println("Is empty? " + str.isEmpty());
    }
}
OUTPUT:
Is empty? true


3. isBlank() (Java 11+)

public class IsBlankExample {
    public static void main(String[] args) {
        String str = "   ";
        System.out.println("Is blank? " + str.isBlank());
    }
}
OUTPUT:
Is blank? true


4. charAt()

public class CharAtExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Character at index 1: " + str.charAt(1));
    }
}
OUTPUT:
Character at index 1: e


5. codePointAt()

public class CodePointAtExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Code point at index 1: " + str.codePointAt(1));
    }
}
OUTPUT:
Code point at index 1: 101


6. codePointBefore()

public class CodePointBeforeExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Code point before index 2: " + str.codePointBefore(2));
    }
}
OUTPUT:
Code point before index 2: 101


7. codePointCount()

public class CodePointCountExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Code points between 0 and 5: " + str.codePointCount(0, 5));
    }
}
OUTPUT:
Code points between 0 and 5: 5


8. equals()

public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("Equals? " + str1.equals(str2));
    }
}
OUTPUT:
Equals? true

9. equalsIgnoreCase()

public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        System.out.println("Equals ignoring case? " + str1.equalsIgnoreCase(str2));
    }
}
OUTPUT:
Equals ignoring case? true


10. compareTo()

public class CompareToExample {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        System.out.println("Compare result: " + str1.compareTo(str2));
    }
}
OUTPUT:
Compare result: -1


11. compareToIgnoreCase()

public class CompareToIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "Apple";
        System.out.println("Compare ignoring case: " + str1.compareToIgnoreCase(str2));
    }
}
OUTPUT:
Compare ignoring case: 0

12. contentEquals()

public class ContentEqualsExample {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Content equals 'Java'? " + str.contentEquals("Java"));
    }
}
OUTPUT:
Content equals 'Java'? true


13. contains()

public class ContainsExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Contains 'Java'? " + str.contains("Java"));
    }
}
OUTPUT:
Contains 'Java'? true

14. startsWith()

public class StartsWithExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello"));
    }
}
OUTPUT:
Starts with 'Hello'? true


15. endsWith()

public class EndsWithExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Ends with 'Java'? " + str.endsWith("Java"));
    }
}
OUTPUT:
Ends with 'Java'? true


16. indexOf()

public class IndexOfExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
    }
}
OUTPUT:
Index of 'Java': 6


17. lastIndexOf()

public class LastIndexOfExample {
    public static void main(String[] args) {
        String str = "Hello Java Java";
        System.out.println("Last index of 'Java': " + str.lastIndexOf("Java"));
    }
}
OUTPUT:
Last index of 'Java': 11

18. matches()

public class MatchesExample {
    public static void main(String[] args) {
        String str = "Java123";
        System.out.println("Matches regex 'Java[0-9]+': " + str.matches("Java[0-9]+"));
    }
}
OUTPUT:
Matches regex 'Java[0-9]+': true


19. substring(beginIndex)

public class SubstringBeginExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Substring from index 6: " + str.substring(6));
    }
}
OUTPUT:
Substring from index 6: Java


20. substring(beginIndex, endIndex)

public class SubstringRangeExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Substring (0,5): " + str.substring(0, 5));
    }
}
OUTPUT:
Substring (0,5): Hello

21. concat()

public class ConcatExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Concatenated: " + str.concat(" Java"));
    }
}
OUTPUT:
Concatenated: Hello Java


22. replace(char, char)

public class ReplaceCharExample {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }
}
OUTPUT:
Replace 'a' with 'o': bonono

23. replace(CharSequence, CharSequence)

public class ReplaceSequenceExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));
    }
}
OUTPUT:
Replace 'Java' with 'World': Hello World


24. replaceAll(regex, replacement)

public class ReplaceAllExample {
    public static void main(String[] args) {
        String str = "a1b2c3";
        System.out.println("Replace all digits: " + str.replaceAll("\\d", "#"));
    }
}
OUTPUT:
Replace all digits: a#b#c#


25. replaceFirst(regex, replacement)

public class ReplaceFirstExample {
    public static void main(String[] args) {
        String str = "a1b2c3";
        System.out.println("Replace first digit: " + str.replaceFirst("\\d", "#"));
    }
}
OUTPUT:
Replace first digit: a#b2c3


26. trim()

public class TrimExample {
    public static void main(String[] args) {
        String str = "   Hello Java   ";
        System.out.println("Trimmed: '" + str.trim() + "'");
    }
}
OUTPUT:
Trimmed: 'Hello Java'


27. strip() (Java 11+)

public class StripExample {
    public static void main(String[] args) {
        String str = "   Hello Java   ";
        System.out.println("Stripped: '" + str.strip() + "'");
    }
}
OUTPUT:
Stripped: 'Hello Java'


28. stripLeading() (Java 11+)

public class StripLeadingExample {
    public static void main(String[] args) {
        String str = "   Hello Java   ";
        System.out.println("Strip leading: '" + str.stripLeading() + "'");
    }
}
OUTPUT:
Stripped: 'Hello Java'


29. stripTrailing() (Java 11+)

public class StripTrailingExample {
    public static void main(String[] args) {
        String str = "   Hello Java   ";
        System.out.println("Strip trailing: '" + str.stripTrailing() + "'");
    }
}
OUTPUT:Strip trailing: '   Hello Java'


30. toLowerCase()

public class ToLowerCaseExample {
    public static void main(String[] args) {
        String str = "HELLO JAVA";
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}
OUTPUT:
Lowercase: hello java


31. toUpperCase()

public class ToUpperCaseExample {
    public static void main(String[] args) {
        String str = "hello java";
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
OUTPUT:
Uppercase: HELLO JAVA


32. split(regex)

public class SplitExample {
    public static void main(String[] args) {
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
OUTPUT:
apple
banana
orange


33. split(regex, limit)

public class SplitLimitExample {
    public static void main(String[] args) {
        String str = "apple,banana,orange";
        String[] parts = str.split(",", 2);
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
OUTPUT:
apple
banana,orange


34. toCharArray()

public class ToCharArrayExample {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
OUTPUT:
J
a
v
a


35. format()

public class FormatExample {
    public static void main(String[] args) {
        String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
        System.out.println(formatted);
    }
}
OUTPUT:
Name: Alice, Age: 25

36. valueOf()

public class ValueOfExample {
    public static void main(String[] args) {
        int num = 123;
        String str = String.valueOf(num);
        System.out.println("String value: " + str);
    }
}
OUTPUT:
String value: 123


