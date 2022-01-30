package com.example.datajpacourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaCourseApplication.class, args);
    }
    CommandLineRunner commandLineRunner (StudentRepository studentRepository)
    {
        return args -> {
            Student3 maria=new Student3(
                    "Maria",
                    "Jones",
                    "marias.jones@gmail.com",
                    21
            );
            System.out.println("Ceva!!!");
            System.out.println(maria.toString());
            studentRepository.save(maria);
        };
    }
}
