package org.itsimulator.germes.app.persistence.repository;

import java.util.List;

import org.itsimulator.germes.app.model.entity.geography.Station;
import org.itsimulator.germes.app.model.search.criteria.StationCriteria;

/**
 * Defines CRUD methods to access Station objects in the persistent storage
 * @author Morenets
 *
 */
public interface StationRepository {
	
	/**
	 * Returns all the stations that match specified criteria 
	 * @param stationCriteria
	 * @return
	 */
	List<Station> findAllByCriteria(StationCriteria stationCriteria);

}
