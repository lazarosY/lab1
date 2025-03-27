package com.station.net.Rest.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.station.net.Rest.models.Resource;
@Repository
public interface ResourceRepo extends JpaRepository<Resource, Long>{

}
