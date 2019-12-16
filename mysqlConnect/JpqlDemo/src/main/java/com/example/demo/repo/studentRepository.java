package com.example.demo.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Student;

public interface studentRepository extends CrudRepository<Student, Long> {
	@Query("from Student")
List<Student> findallstud(Pageable pageable);
	@Query("select st.firstname,st.lastname from Student st")
	List<Object[]> firstandlast();
	@Query("from Student where firstname=:fistname")
	List<Student> findAllStudentByFirstName(@Param("fistname")String firstname);
	@Query("from Student where score between :val1 and :val2")
	List<Student> findByScore(@Param("val1")int val1,@Param("val2") int val2 );
	@Modifying
	@Query("delete from Student where firstname=:firstname")
	void deletebyfirstname(@Param("firstname")String firstname);
	@Query(value = "select * from student",nativeQuery = true)
	List<Student> findallStudentNQ();

}
