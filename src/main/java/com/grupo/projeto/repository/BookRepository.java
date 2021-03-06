package com.grupo.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.grupo.projeto.model.BookModel;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long>{

	@Query("SELECT obj FROM BookModel obj WHERE UPPER(obj.title) LIKE CONCAT('%',UPPER(:title),'%')")
	List<BookModel> findByDescriptionTitle(@Param("title") String title);

}
