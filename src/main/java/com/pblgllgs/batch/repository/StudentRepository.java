package com.pblgllgs.batch.repository;
/*
 *
 * @author pblgl
 * Created on 01-02-2024
 *
 */

import com.pblgllgs.batch.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
