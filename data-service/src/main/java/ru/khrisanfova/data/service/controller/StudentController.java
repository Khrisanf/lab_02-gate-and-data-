package ru.khrisanfova.data.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.khrisanfova.data.api.StudentDataApi;
import ru.khrisanfova.data.model.StudentDataCreateRequest;
import ru.khrisanfova.data.model.StudentDataResponse;
import ru.khrisanfova.data.service.data.Student;
import ru.khrisanfova.data.service.data.StudentRepository;

@RestController
@RequiredArgsConstructor
public class StudentController implements StudentDataApi {

    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity<StudentDataResponse> createStudentDataInData(StudentDataCreateRequest request) {
        Student student = new Student();
        student.setName(request.getFullName());
        student.setPassport(request.getPassport());
        studentRepository.save(student);
        StudentDataResponse response = new StudentDataResponse();
        response.setId(student.getId());
        response.setFullName(student.getName());
        response.setPassport(student.getPassport());

        return ResponseEntity.status(200).body(response);
    }

    @Override
    public ResponseEntity<StudentDataResponse> getStudentDataByIdFromData(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        StudentDataResponse response = new StudentDataResponse();
        response.setId(student.getId());
        response.setFullName(student.getName());
        response.setPassport(student.getPassport());

        return ResponseEntity.status(200).body(response);
    }
}

