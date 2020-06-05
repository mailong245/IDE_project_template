package business;

import BO.Human;

import java.util.List;

public interface DatabaseBusiness {

    List<Human> getData();

    Human findHumanById(String id);

}
