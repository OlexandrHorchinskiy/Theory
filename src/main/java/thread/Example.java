package thread;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() { // Створює об'єкт інтерфейса в якому э один абстрактний метод "run"
            @Override // Перевизначає метод "run"
            public void run() { // В методі "run" знаходиться необхідний для виконання код
                System.out.println("Новий поток thread");
            }
        };

        // Створюємо поток "thread"
        Thread thread = new Thread(runnable); // Створює об'єкт класу "Thread" (поток) та приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускаэ поток "thread"
    }
}
