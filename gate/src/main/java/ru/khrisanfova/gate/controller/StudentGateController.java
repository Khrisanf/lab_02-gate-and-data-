package ru.khrisanfova.gate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.khrisanfova.gate.api.StudentGateApi;
import ru.khrisanfova.gate.client.api.StudentDataApi;
import ru.khrisanfova.gate.client.model.StudentDataCreateRequest;
import ru.khrisanfova.gate.client.model.StudentDataResponse;
import ru.khrisanfova.gate.model.StudentGateCreateRequest;
import ru.khrisanfova.gate.model.StudentGateResponse;

@RestController
@RequiredArgsConstructor
public class StudentGateController implements StudentGateApi {

    private final StudentDataApi studentsFeignClient;

    /**
     * Проксирует создание студента во внутренний DATA-SERVICE.
     * Получает запрос от клиента, преобразует модель и перенаправляет.
     */
    @Override
    public ResponseEntity<StudentGateResponse> createStudent(StudentGateCreateRequest request) {
        StudentDataCreateRequest dataRequest = new StudentDataCreateRequest();
        dataRequest.setFullName(request.getFullName());
        dataRequest.setPassport(request.getPassport());

        StudentDataResponse dataResponse = studentsFeignClient.createStudentDataInData(dataRequest);

        StudentGateResponse gateResponse = new StudentGateResponse();
        gateResponse.setId(dataResponse.getId());
        gateResponse.setFullName(dataResponse.getFullName());
        gateResponse.setPassport(dataResponse.getPassport());

        return ResponseEntity.status(201).body(gateResponse);
    }

    @Override
    public ResponseEntity<StudentGateResponse> getStudentById(Long id) {
        // 1) дергаем data-service через Feign
        StudentDataResponse dataResponse = studentsFeignClient.getStudentDataByIdFromData(id);

        // 2) маппим в gate-модель
        StudentGateResponse gateResponse = new StudentGateResponse();
        gateResponse.setId(dataResponse.getId());
        gateResponse.setFullName(dataResponse.getFullName());
        gateResponse.setPassport(dataResponse.getPassport());

        // 3) возвращаем клиенту
        return ResponseEntity.ok(gateResponse);
    }

}
