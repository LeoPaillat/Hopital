package hospital.dao;
import java.util.List;

import hospital.model.Visite;

public interface VisiteDao extends DaoGeneric<Visite,String> {

	List<Visite> findAllVisite();
}
