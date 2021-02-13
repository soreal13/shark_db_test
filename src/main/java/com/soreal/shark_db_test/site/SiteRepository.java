package com.soreal.shark_db_test.site;

import com.soreal.shark_db_test.domain.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface SiteRepository extends JpaRepository<Site, Long> {

    List<Site> findByArea1(String area1);

}
