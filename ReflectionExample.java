import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // Получаем класс String
        Class<String> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим информацию о каждом методе
        System.out.println("Методы класса String:");
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
