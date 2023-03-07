import java.util.List;

import jbdc.test.Formateur;

public interface PatientDao extends DaoGeneric<Patient,String> {

	List<Patient> findAllPatient();
}
