package com.postgresql.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.model.datas;

@Repository
public interface DatasRepository extends JpaRepository<datas, Long> {

	
}
