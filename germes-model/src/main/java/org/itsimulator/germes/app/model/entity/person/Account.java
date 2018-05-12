package org.itsimulator.germes.app.model.entity.person;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.itsimulator.germes.app.model.entity.base.AbstractEntity;

/**
 * Entity that encapsulates user of the application
 * @author Morenets
 *
 */
@Table(name = "ACCOUNT")
@Entity
public class Account extends AbstractEntity{

}
