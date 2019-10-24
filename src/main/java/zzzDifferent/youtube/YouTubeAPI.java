package zzzDifferent.youtube;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class YouTubeAPI {
    public static final String API_KEY = "____________________________________________";

    public static String search(String query, int maxResults) throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://www.googleapis.com/youtube/v3/search")
                .queryString("key", API_KEY)
                .queryString("part", "snippet")
                .queryString("maxResults", maxResults)
                .queryString("q", query)
                .asString();

        return response.getBody();

        // String json = response.getBody();
        // System.out.println(json);
        // return JSON.parseObject(json, new TypeReference<ResponseSearch<Item<SnippetVideo>>>() {});
    }
}