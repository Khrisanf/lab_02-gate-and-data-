package ru.khrisanfova.gate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.khrisanfova.gate.client.ApiClient;
import ru.khrisanfova.gate.client.api.StudentDataApi;

@Configuration
public class FeignClientConfig {

    @Bean
    public StudentDataApi someStudentApi() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8083"); // или data.service.url
        return apiClient.buildClient(StudentDataApi.class);
    }
}
