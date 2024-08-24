import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.IOException;

public class UtilsTelegramBot {

    public static String urlImage(String url){

        CloseableHttpClient client = HttpClients.createDefault();
        ObjectMapper objectMapper = new ObjectMapper();
        HttpGet httpGet = new HttpGet(url);

        try {
            CloseableHttpResponse response = client.execute(httpGet);
            NasaAnswer nasaAnswer = objectMapper.readValue(response.getEntity().getContent(), NasaAnswer.class);
            return nasaAnswer.url;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
