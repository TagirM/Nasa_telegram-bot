import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        String url = "https://api.nasa.gov/planetary/apod?api_key=jEcMf89LzCfOcQtC0lFMQJINZ62wU2YRmCTxycoa";
//        CloseableHttpClient client = HttpClients.createDefault();
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        HttpGet httpGet = new HttpGet(url);
//
//        CloseableHttpResponse response = client.execute(httpGet);

//        Scanner scanner = new Scanner(response.getEntity().getContent());
//        String answer = scanner.nextLine();
//        System.out.println(answer);

//        NasaAnswer nasaAnswer = objectMapper.readValue(response.getEntity().getContent(), NasaAnswer.class);
//        HttpGet responseImage = new HttpGet(nasaAnswer.url);
//        CloseableHttpResponse image = client.execute(responseImage);
//
//        FileOutputStream fileOutputStream = new FileOutputStream("imageTodayFromNasa_" + nasaAnswer.date + ".jpg");
//        image.getEntity().writeTo(fileOutputStream);

        new MyTelegramBot("java_tagir_bot", "6795725170:AAEZOAW_1xjszKVdRg_qX1N4D9KywoHSmHw");

    }
}
