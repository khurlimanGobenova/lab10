package category3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConfig {

    @Value("${api.base-path}")
    private String basePath;

    @Value("${api.timeout}")
    private int timeout;

    @Value("${api.max-results}")
    private int maxResults;

    @Value("${api.default-page-size}")
    private int defaultPageSize;
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(clientHttpRequestFactory());
        return restTemplate;
    }

    private ClientHttpRequestFactory clientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(timeout);
        factory.setReadTimeout(timeout);
        return factory;
    }

    public String getBasePath() {
        return basePath;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public int getDefaultPageSize() {
        return defaultPageSize;
    }
}