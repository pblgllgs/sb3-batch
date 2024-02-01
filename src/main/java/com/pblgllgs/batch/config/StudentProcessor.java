package com.pblgllgs.batch.config;
/*
 *
 * @author pblgl
 * Created on 01-02-2024
 *
 */

import com.pblgllgs.batch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student,Student> {
    @Override
    public Student process(Student student) throws Exception {
        student.setId(null);
        return student;
    }
}
