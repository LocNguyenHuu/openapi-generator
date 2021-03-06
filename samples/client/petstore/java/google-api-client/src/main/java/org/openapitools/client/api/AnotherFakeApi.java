package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class AnotherFakeApi {
    private ApiClient apiClient;

    public AnotherFakeApi() {
        this(new ApiClient());
    }

    public AnotherFakeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * To test special tags
    * To test special tags and operation ID starting with number
    * <p><b>200</b> - successful operation
    * @param client client model
    * @return Client
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Client call123testSpecialTags(Client client) throws IOException {
        HttpResponse response = call123testSpecialTagsForHttpResponse(client);
        TypeReference typeRef = new TypeReference<Client>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * To test special tags
    * To test special tags and operation ID starting with number
    * <p><b>200</b> - successful operation
    * @param client client model
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Client
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Client call123testSpecialTags(Client client, Map<String, Object> params) throws IOException {
        HttpResponse response = call123testSpecialTagsForHttpResponse(client, params);
        TypeReference typeRef = new TypeReference<Client>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse call123testSpecialTagsForHttpResponse(Client client) throws IOException {
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new IllegalArgumentException("Missing the required parameter 'client' when calling call123testSpecialTags");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/another-fake/dummy");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(client);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse call123testSpecialTagsForHttpResponse(java.io.InputStream client, String mediaType) throws IOException {
          // verify the required parameter 'client' is set
              if (client == null) {
              throw new IllegalArgumentException("Missing the required parameter 'client' when calling call123testSpecialTags");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/another-fake/dummy");

              String url = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(url);

              HttpContent content = client == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, client);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse call123testSpecialTagsForHttpResponse(Client client, Map<String, Object> params) throws IOException {
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new IllegalArgumentException("Missing the required parameter 'client' when calling call123testSpecialTags");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/another-fake/dummy");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(client);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
