package se.yrgo.dataaccess;

import java.util.List;

import org.springframework.stereotype.Repository;
import se.yrgo.domain.Action;
@Repository
public interface ActionDao {
	public void create(Action newAction);
	public List<Action> getIncompleteActions(String userId);
	public void update(Action actionToUpdate) throws RecordNotFoundException;
	public void delete(Action oldAction) throws RecordNotFoundException;
}
