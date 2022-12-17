package constants;

public class Endpoints {

    public String getallPersonEndpoint(){
        String endpoint = BaseURLs.baseURL + "/api/users";
        return endpoint;
    }

    public String getSinlePersonEndpoint(){
        String endpoint = BaseURLs.baseURL + "/api/users/{id}";
        return endpoint;
    }

    public String createPersonEndpoint(){
        String endpoint = BaseURLs.baseURL + "/api/users";
        return endpoint;
    }

    public String updatePersonEndpoint(){
        String endpoint = BaseURLs.baseURL + "/api/users/{id}";
        return endpoint;
    }
}
