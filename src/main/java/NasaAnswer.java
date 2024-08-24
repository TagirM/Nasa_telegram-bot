import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaAnswer {

    public String copyright;
    public String date;
    public String explanation;
    public String hdurl;
    public String media_type;
    public String service_version;
    public String title;
    public String url;

    public NasaAnswer(@JsonProperty("copyright") String copyright,
                      @JsonProperty("date") String date,
                      @JsonProperty("explanation") String explanation,
                      @JsonProperty("hdurl") String hdurl,
                      @JsonProperty("media_type") String media_type,
                      @JsonProperty("service_version") String service_version,
                      @JsonProperty("title") String title,
                      @JsonProperty("url") String url) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.media_type = media_type;
        this.service_version = service_version;
        this.title = title;
        this.url = url;
    }
}
