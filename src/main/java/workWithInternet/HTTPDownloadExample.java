package workWithInternet;

import java.io.*;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.*;

public class HTTPDownloadExample {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Callable<String> httpRequest = () -> {


            URL url = new URL("http://www.google.com.ua"); // В дужках вказано куди звертатися
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // Відчиняє URL (підключення до сервера)
            connection.setRequestMethod("GET"); // "GET", "POST", "UPDATE" - типи HttpURLConnection

            InputStream inputStream = connection.getInputStream(); // Вхідний поток
            InputStreamReader reader = new InputStreamReader(inputStream);

            String html = "";
            int b = 0;
            while (( b = reader.read() ) != -1) { // перевіряє чи не закінчився stream
                html += ( (char) b );
            }


            return html;
        };


        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(httpRequest);
        Future<String> future = service.submit(httpRequest);
        System.out.println(future.get());

        service.shutdown();

    }
}