package com.api.rest.Repository;

import com.api.rest.Model.Voto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotoRepository extends CrudRepository<Voto,Long> {
    @Query(value = "select v.* from Opcion o, Voto v where o.ENCUESTA_ID = ?1 and v.OPCION_ID = o.OPCION_ID",nativeQuery = true)
    public Iterable<Voto> findByEncuesta(Long encuestaId);
}
