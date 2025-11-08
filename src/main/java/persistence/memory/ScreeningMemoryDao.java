package persistence.memory;

import domain.Screening;
import persistence.ScreeningDao;

public class ScreeningMemoryDao extends InMemoryDao<Screening> implements ScreeningDao {
    @Override
    public Screening getScreening(Long id){
        return findOne(screening -> screening.getId().equals(id));
    }
}
