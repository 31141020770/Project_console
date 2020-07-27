package project.management.repository;

import java.util.List;

import project.management.entity.StoreMachineEntity;

public interface IStoreMachineRepository extends GenericRepository<StoreMachineEntity> {
	List<StoreMachineEntity> findAll() ;
	int add(StoreMachineEntity storeMachineEntity);
	void update(StoreMachineEntity storeMachineEntity);
	void delete(int id);
}
