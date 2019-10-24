package thread;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() { // Створює об'єкт інтерфейса в якому э один абстрактний метод "run"
            @Override // Перевизначає метод "run"
            public void run() { // В методі "run" знаходиться необхідний для виконання код
                int seconds = 0;
                while(true){
                    try {
                        seconds++;
                        Thread.sleep(1000); // Поток засинає на 1 секунду
                        System.out.println("секунд " + seconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };

        // Створюємо поток "thread"
        Thread thread = new Thread(runnable); // Створює об'єкт класу "Thread" (поток) та приймає "runnable" (код який буде виконуватись)
        thread.start(); // Запускає поток "thread"


    }
}
