package workWithInternet.youtube;

import com.alibaba.fastjson.JSON;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import workWithInternet.youtube.entity.ResponseSearch;

public class YouTubeAPI {
    public static final String API_KEY = "AIzaSyBYpC6G4y4vYfgWRs9bDAIqLngbu7kJgBc";

    public static final ObjectMapper mapper = new ObjectMapper() {
        public <T> T readValue(String value, Class<T> valueType) {
            return JSON.parseObject(value, valueType);
        }

        public String writeValue(Object value) {
            return JSON.toJSONString(value);
        }
    };

    static {
        System.out.println("Unirest Object Mapper initialization");
        Unirest.setObjectMapper(mapper);
    }

    public static ResponseSearch search(String query, int maxResults) throws UnirestException {
        HttpResponse<ResponseSearch> response = Unirest.get("https://www.googleapis.com/youtube/v3/search")
                .queryString("key", API_KEY)
                .queryString("part", "snippet")
                .queryString("maxResults", maxResults)
                .queryString("q", query)
                .asObject(ResponseSearch.class);

        return response.getBody();
    }
}