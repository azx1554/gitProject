import org.apache.http.HttpHost;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import java.util.Date;

public class Operator {

    public static RestHighLevelClient getClient() throws Exception {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("132.126.2.78", 19200, "http"))
        );
        return client;
    }


    public static void insert() throws Exception {
        RestHighLevelClient client = getClient();
        IndexRequest indexRequest = new IndexRequest("test_index")
                .id("1")
                .source("user", "root",
                        "postDate", new Date(),
                        "message", "trying out Elasticsearch");

        IndexResponse response = client.index(indexRequest, RequestOptions.DEFAULT);
        System.out.println(response.status());
    }

    public static void main(String[] args) throws Exception {
        insert();
        //query();
        //delete();
    }

}
