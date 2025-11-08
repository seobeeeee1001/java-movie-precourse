package persistence;

import domain.Screening;

public interface ScreeningDao {
    Screening getScreening(Long id);
    void insert(Screening screening);
}
