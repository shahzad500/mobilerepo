package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
