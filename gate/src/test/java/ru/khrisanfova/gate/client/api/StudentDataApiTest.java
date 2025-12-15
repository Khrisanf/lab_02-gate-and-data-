package ru.khrisanfova.gate.client.api;

import ru.khrisanfova.gate.client.ApiClient;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeEach;
import ru.khrisanfova.gate.client.model.StudentDataCreateRequest;

/**
 * API tests for StudentDataApi
 */
class StudentDataApiTest {

    private StudentDataApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(StudentDataApi.class);
    }

    
    /**
     * Создать студента в БД
     *
     * Создает запись о студенте в базе данных.
     */
    @Test
    void createStudentDataInDataTest() {
        StudentDataCreateRequest studentDataCreateRequest = null;
        // StudentDataResponse response = api.createStudentDataInData(studentDataCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Получить данные студента из БД
     *
     * Возвращает информацию о студенте по идентификатору.
     */
    @Test
    void getStudentDataByIdFromDataTest() {
        Long id = null;
        // StudentDataResponse response = api.getStudentDataByIdFromData(id);

        // TODO: test validations
    }

    
}
